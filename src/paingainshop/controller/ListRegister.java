package paingainshop.controller;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import paingainshop.model.DAO.BangChamCongDAO;
import paingainshop.model.BangChamCong;
import paingainshop.model.DAO.NhanVienDAO;
import paingainshop.model.NhanVien;

public class ListRegister extends HttpServlet {


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
        ArrayList<BangChamCong> result = new ArrayList<BangChamCong>();
        ArrayList<NhanVien> result2 = new ArrayList<NhanVien>();
        try {
            result = new BangChamCongDAO().getAll();
            request.setAttribute("result",result);
            result2 = new NhanVienDAO().getAll();
            request.setAttribute("result",result2);
            request.getRequestDispatcher("register.jsp").forward(request, response);
        } catch (Exception ex) {
            response.getWriter().print("Loi: "+ ex.getMessage());
        }
        
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
