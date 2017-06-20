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
import paingainshop.model.CTHoaDon;
import paingainshop.model.DAO.CTHoaDonDAO;
import paingainshop.model.DAO.HoaDonDAO;
import paingainshop.model.DAO.KhachHangDAO;
import paingainshop.model.DAO.NhanVienDAO;
import paingainshop.model.HoaDon;
import paingainshop.model.KhachHang;
import paingainshop.model.NhanVien;

/**
 *
 * @author Admin
 */
public class ChitietHoaDon extends HttpServlet {

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
        String mahd = request.getParameter("mahd");
        try {
            HoaDon hd = new HoaDonDAO().getById(mahd);
            NhanVien nv = new NhanVienDAO().getById(hd.getMaNV());
            KhachHang kh = new KhachHangDAO().getByID(hd.getMaKH());
            ArrayList<CTHoaDon> cthd = new CTHoaDonDAO().getById(mahd);
            request.setAttribute("hd", hd);
            request.setAttribute("nv", nv);
            request.setAttribute("kh", kh);
            request.setAttribute("cthd", cthd);
            long total=0;
            for(CTHoaDon ctiet:cthd){
                int pay = (ctiet.getDonGia() * ctiet.getSoLuong()) -((ctiet.getDonGia()* ctiet.getSoLuong())*ctiet.getGiamGia())/100;
                total +=pay;
            }
            request.setAttribute("total", total);
            request.getRequestDispatcher("chitiethoadon.jsp").forward(request, response);
        } catch (Exception ex) {
            response.getWriter().print("Đường dẫn không đúng");
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
