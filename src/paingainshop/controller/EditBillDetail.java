/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paingainshop.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.json.simple.JSONObject;
import paingainshop.model.CTHoaDon;
import paingainshop.model.DAO.HangHoaDAO;
import paingainshop.model.HoaDonData;

/**
 *
 * @author Mạnh Nguyễn!
 */
public class EditBillDetail extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EditBillDetail</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditBillDetail at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

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
        int dongia = Integer.parseInt(request.getParameter("DonGia"));
        String mahh = request.getParameter("MaHH");
        int soluong = Integer.parseInt(request.getParameter("SoLuong"));
        int giamgia = Integer.parseInt(request.getParameter("GiamGia"));

        HttpSession session = request.getSession();
        HoaDonData hoadon = (HoaDonData) session.getAttribute("hoadon");
        CTHoaDon ct = hoadon.getItem(mahh);
        ct.setDonGia(dongia);
        ct.setGiamGia(giamgia);
        ct.setSoLuong(soluong);
        ct.setSaltong(false);
        hoadon.update(ct);
        session.setAttribute("hoadon", hoadon);
        try {
            String txtresult = "";
            ArrayList<CTHoaDon> rs = hoadon.getItems();
            int i = 1;
            long totalbill = 0;
            for (CTHoaDon ctiet : rs) {
                String tensp;

                tensp = new HangHoaDAO().getById(ctiet.getMaHH()).getTenHH();
                int total = (ctiet.getDonGia() * ctiet.getSoLuong()) - ((ctiet.getDonGia() * ctiet.getSoLuong()) * ctiet.getGiamGia()) / 100;
                txtresult += "<tr for=\"" + ctiet.getMaHH() + "\">"
                        + "<td>" + i + "</td>"
                        + "<td>" + ctiet.getMaHH() + "</td>"
                        + "<td>" + tensp + "</td>"
                        + "<td><input type=\"text\" class=\"form-control dongia\" value=\"" + ctiet.getDonGia() + "\" onchange= \"editBill(this);\"></td>"
                        + "<td><input type=\"number\" class=\"form-control soluong\" value=\"" + ctiet.getSoLuong() + "\" onchange= \"editBill(this);\"></td>"
                        + "<td><input type=\"number\" class=\"form-control giamgia\" value=\"" + ctiet.getGiamGia() + "\" onchange= \"editBill(this);\"></td>"
                        + "<td>" + total + "</td>"
                        + "<td><a href=\"#\" onclick=\"confirmremove(\'"+ ctiet.getMaHH() +"\');\"><span  class=\" fa fa-times-circle delproc\"></span></a></td>"
                        + "</tr>";
                i++;
                totalbill += total;
            }
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("list", txtresult);
            jsonobject.put("total", Long.toString(totalbill));
            response.getWriter().print(jsonobject.toJSONString());
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
        processRequest(request, response);
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
