/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paingainshop.controller.hanghoa;

import java.io.IOException;
import java.io.PrintWriter;
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
 * @author dangt
 */
public class UpdateHangHoa extends HttpServlet {

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
            out.println("<title>Servlet UpdateHangHoa</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateHangHoa at " + request.getContextPath() + "</h1>");
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
        response.setContentType("text/html; charset =UTF-8;");
        request.setCharacterEncoding("utf-8");
        String MaHH = request.getParameter("primproduct");
        String TenHH = request.getParameter("productname");
        String NhomHH = request.getParameter("category");
        int GiaBan = Integer.parseInt(request.getParameter("outprice"));
        int GiaNhap = Integer.parseInt(request.getParameter("inprice"));
        String ThuocTinh = request.getParameter("attribute1");
        int SoLuong = Integer.parseInt(request.getParameter("sl"));
        String DonViTinh = request.getParameter("dvt");
        String MaNCC = request.getParameter("vendor");
        String GhiChu = request.getParameter("attribute2");
        HangHoa hh = new HangHoa(MaHH, TenHH, NhomHH, GiaBan, GiaNhap, ThuocTinh, SoLuong, DonViTinh, MaNCC, GhiChu);
        HangHoaDAO db = new HangHoaDAO();
        String msg = "";
        try {
            if(db.updateHangHoa(hh)){
                msg ="Cập nhật thông tin thành công";
            }else{
                msg ="Cập nhật thất bại";
            }
        } catch (Exception ex) {
            msg="loi: "+ ex.getMessage();
        }
        response.getWriter().print(msg);
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
