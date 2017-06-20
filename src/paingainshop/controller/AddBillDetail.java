/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paingainshop.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.json.simple.JSONObject;
import paingainshop.model.CTHoaDon;
import paingainshop.model.DAO.HangHoaDAO;
import paingainshop.model.HangHoa;
import paingainshop.model.HoaDonData;

/**
 *
 * @author dangt
 */
public class AddBillDetail extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8"); 
        String mahh = request.getParameter("maHH");
        
        try {
            HangHoa hh = new HangHoaDAO().getById(mahh);
            HttpSession session = request.getSession();
            HoaDonData hoadon = (HoaDonData) session.getAttribute("hoadon");
            if (hoadon == null) {
                response.sendRedirect("createhoadon");
            } else {
                CTHoaDon ct = new CTHoaDon(hoadon.getMaHD(), mahh, 1, hh.getGiaBan(), 0);
                hoadon.addItem(ct);
                session.setAttribute("hoadon", hoadon);
                String txtresult = "";
                ArrayList<CTHoaDon> rs = hoadon.getItems();
                int i=1;
                long totalbill=0 ;
                for (CTHoaDon ctiet : rs) {
                    String tensp = new HangHoaDAO().getById(ctiet.getMaHH()).getTenHH();
                    long total = (ctiet.getDonGia() * ctiet.getSoLuong()) -((ctiet.getDonGia()* ctiet.getSoLuong())*ctiet.getGiamGia())/100;
                    txtresult += "<tr for=\""+ctiet.getMaHH()+"\">"
                            + "<td>"+i+"</td>"
                            + "<td>"+ctiet.getMaHH()+"</td>"
                            + "<td>"+tensp+"</td>"
                            + "<td><input type=\"text\" class=\"form-control dongia\" value=\""+ctiet.getDonGia()+"\" onchange= \"editBill(this);\"></td>"
                            + "<td><input type=\"number\" class=\"form-control soluong\" value=\""+ctiet.getSoLuong()+"\" onchange= \"editBill(this);\"></td>"
                            + "<td><input type=\"number\" class=\"form-control giamgia\" value=\""+ctiet.getGiamGia()+"\" onchange= \"editBill(this);\"></td>"
                            + "<td>"+total+"</td>"
                            + "<td><a href=\"#\" onclick=\"confirmremove(\'"+ ctiet.getMaHH() +"\');\"><span  class=\" fa fa-times-circle delproc\" ></span></a></td>"
                            + "</tr>";
                    i++;
                    totalbill+=total;
                }
                JSONObject jsonobject = new JSONObject();
                jsonobject.put("list", txtresult);
                jsonobject.put("total",Long.toString(totalbill));
                response.getWriter().print(jsonobject.toJSONString());
            }
        } catch (Exception ex) {
            response.getWriter().print("loi: " + ex.getMessage());
        }

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
