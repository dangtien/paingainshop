/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paingainshop.controller.donhang;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import paingainshop.model.DAO.DonDatHangDAO;
import paingainshop.model.DAO.NhanVienDAO;
import paingainshop.model.DonHang;
import paingainshop.model.NhanVien;
import paingainshop.model.service.PainAndGainService;

/**
 *
 * @author Mạnh Nguyễn!
 */
public class ThemDonHang extends HttpServlet {

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
            out.println("<title>Servlet ThemDonHang</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ThemDonHang at " + request.getContextPath() + "</h1>");
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
        try {
            HttpSession session = request.getSession();
            NhanVien nv = (NhanVien)session.getAttribute("login");
            String MaDDH = PainAndGainService.CreatePKey("DH", new DonDatHangDAO().getLastPkey());
            Date date = new Date();
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            String datestr = dateformat.format(date);
            DonHang donhang = new DonHang(MaDDH, datestr, nv.getUserName(), 0);
            session.setAttribute("donhang", donhang);
            request.setAttribute("madh", MaDDH);
            request.setAttribute("nhanvien", nv.getUserName());
            request.setAttribute("ngay", datestr);
            request.getRequestDispatcher(request.getContextPath()+"/adddondh.jsp").forward(request, response);
            
        } catch (Exception ex) {
            response.getWriter().print("loi server: "+ ex.getMessage());
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
