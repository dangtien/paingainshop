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
import paingainshop.model.CTDonDatHang;
import paingainshop.model.DAO.CTDonDatHangDAO;
import paingainshop.model.DAO.DonDatHangDAO;
import paingainshop.model.DonDatHang;

/**
 *
 * @author BANH MY
 */
public class ChiTietDonDatHang extends HttpServlet {

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
            out.println("<title>Servlet ChiTietDonDatHang</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ChiTietDonDatHang at " + request.getContextPath() + "</h1>");
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
       response.setContentType("text/html; charset=UTF-8");
       String MaDDH = request.getParameter("madh");
        try {
            DonDatHang dh = new DonDatHangDAO().getById(MaDDH);
            ArrayList<CTDonDatHang> list = new CTDonDatHangDAO().getByID(MaDDH);
            long money=0;
            for(CTDonDatHang ct: list){
                money+= ct.getSoLuong()*ct.getDonGia();
            }
            request.setAttribute("total", money);
            request.setAttribute("dh", dh);
            request.setAttribute("rs", list);
            request.getRequestDispatcher(request.getContextPath()+"/chitietddh.jsp").forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(ChiTietDonDatHang.class.getName()).log(Level.SEVERE, null, ex);
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
