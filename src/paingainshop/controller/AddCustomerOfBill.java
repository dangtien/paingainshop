/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paingainshop.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import paingainshop.model.DAO.KhachHangDAO;
import paingainshop.model.HoaDonData;
import paingainshop.model.KhachHang;

/**
 *
 * @author dangt
 */
public class AddCustomerOfBill extends HttpServlet {

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
            out.println("<title>Servlet AddCustomerOfBill</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddCustomerOfBill at " + request.getContextPath() + "</h1>");
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
        response.setContentType("text/html;charset=UTF-8");
        String makh = request.getParameter("maKH");
        try {
            KhachHang kh = new KhachHangDAO().getByID(makh);
            HttpSession session = request.getSession();
            HoaDonData hoadon = (HoaDonData) session.getAttribute("hoadon");
            if (hoadon == null) {
                response.sendRedirect("createhoadon");
            } else {
                hoadon.setMaKH(kh.getMaKH());
                session.setAttribute("hoadon", hoadon);
                String resulthtml = "<strong>Họ tên</strong>"
                        + "<p class=\"text-muted\">" + kh.getTenHK() + "</p>"
                        + "<strong>Địa chỉ</strong>"
                        + "<p class=\"text-muted\">" + kh.getDiaChi() + "</p>"
                        + "<strong>Email</strong>"
                        + "<p class=\"text-muted\">" + kh.getEmail() + "</p>";
                response.getWriter().print(resulthtml);
            }
        } catch (Exception ex) {
            response.getWriter().print(ex.getMessage());
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
