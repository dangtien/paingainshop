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
import paingainshop.model.DAO.HangHoaDAO;
import paingainshop.model.HangHoa;

/**
 *
 * @author BANH MY
 */
public class SuggestSanPham extends HttpServlet {

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
            out.println("<title>Servlet SuggestSanPham</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SuggestSanPham at " + request.getContextPath() + "</h1>");
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
        request.setCharacterEncoding("utf-8");
        String str = request.getParameter("txtsearch");
        try {
            ArrayList<HangHoa> list = new HangHoaDAO().getLikeString(str);
            String strtext="";
            for(HangHoa hh:list){
                strtext += "<li class=\"suggest-col\" value=\"" + hh.getMaHH() + "\" onclick=\"dhthemSanpham(\'" + hh.getMaHH() + "\');\">"
                        + "<span class=\"fa fa-tags fa-custom\"></span>"
                        + "<span class=\"fa-custom text-muted\">" + hh.getMaHH() + "</span>"
                        + "<span class=\"fa-custom text-muted\">" + hh.getTenHH() + "</span>"
                        + "<span class=\"fa-custom text-muted\">Đơn giá nhập: <b>" + hh.getGiaNhap() + "</b> VND</span>"
                        + "<span class=\"text-muted\">Số lượng hiện có: <b>" + hh.getSoLuong() + "</b></span>"
                        + "</li>";
            }
            response.getWriter().print(strtext);
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
