/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paingainshop.controller.donhang;

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
import paingainshop.model.CTDonDatHang;
import paingainshop.model.DAO.HangHoaDAO;
import paingainshop.model.DonHang;
import paingainshop.model.HangHoa;

/**
 *
 * @author BANH MY donhang/add
 */
public class ThemChiTietDonHang extends HttpServlet {

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
            out.println("<title>Servlet ThemChiTietDonHang</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ThemChiTietDonHang at " + request.getContextPath() + "</h1>");
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
        String mahh = request.getParameter("maHH");
        HttpSession session = request.getSession();
        DonHang donhang = (DonHang) session.getAttribute("donhang");
        try {
            HangHoa hh = new HangHoaDAO().getById(mahh);
            long total = 0;
            String txtresult = "";
            if (donhang == null) {
                response.sendRedirect(request.getContextPath() + "/donhang/new");
            } else {
                CTDonDatHang ct = new CTDonDatHang(donhang.getMaDDH(), hh.getMaHH(), 0, hh.getGiaNhap());
                donhang.addItem(ct);
                session.setAttribute("donhang", donhang);
                ArrayList<CTDonDatHang> rs = donhang.getItems();
                int i = 1;
                for (CTDonDatHang ctiet : rs) {
                    long money = ctiet.getSoLuong() * ctiet.getDonGia();
                    total += money;
                    String tensp = new HangHoaDAO().getById(ctiet.getMaHH()).getTenHH();
                    txtresult += "<tr for=\"" + ctiet.getMaHH() + "\">"
                            + "<td>" + i + "</td>"
                            + "<td>" + ctiet.getMaHH() + "</td>"
                            + "<td>" + tensp + "</td>"
                            + "<td><input type=\"text\" name=\"dongia\" class=\"form-control dongia\" value=\"" + ctiet.getDonGia() + "\" onchange=\"donhangEdit(this);\"></td>"
                            + "<td><input type=\"number\" name=\"soluong\" class=\"form-control soluong\" value=\"" + ctiet.getSoLuong() + "\" onchange=\"donhangEdit(this);\"></td>"
                            + "<td>" + money + "</td>"
                            + "<td><a href=\"#\" onclick=\"confirmDHRemove(\'"+ ctiet.getMaHH() +"\');\"><span  class=\" fa fa-times-circle delproc\" ></span></a></td>"
                            + "</tr>";
                    i++;
                }
            }
            JSONObject obj = new JSONObject();
            obj.put("list", txtresult);
            obj.put("total", total);
            response.getWriter().print(obj.toJSONString());
        } catch (Exception ex) {
            Logger.getLogger(ThemChiTietDonHang.class.getName()).log(Level.SEVERE, null, ex);
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
