/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paingainshop.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import paingainshop.model.DAO.KhachHangDAO;
import paingainshop.model.KhachHang;

/**
 *
 * @author dangt
 */
public class SearchKhachHang extends HttpServlet {

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
            out.println("<title>Servlet SearchKhachHang</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SearchKhachHang at " + request.getContextPath() + "</h1>");
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
        String str = request.getParameter("txtsearch");
        KhachHangDAO khaccessdb = new KhachHangDAO();
        try {
            ArrayList<KhachHang> rs = khaccessdb.getLikeString(str);
            String resulthtml = "";
            if (rs != null) {
                for (KhachHang kh : rs) {
                    resulthtml += "<li class=\"suggest-col\" onclick=\"addinfobill(\'"+kh.getMaKH()+"\')\">"
                            + "<span class=\"fa  fa-user fa-custom\"></span>"
                            + "<span class=\"text-muted\">"+kh.getTenHK()+"</span>"
                            + "</li>";
                }
                response.getWriter().print(resulthtml);
            }else{
                response.getWriter().print("Không có kết quả nào");
            }
        } catch (Exception ex) {
            response.getWriter().print(ex.getMessage());
        } finally {
            try {
                khaccessdb.close();
            } catch (SQLException ex) {
                response.getWriter().print(ex.getMessage());
            }
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
