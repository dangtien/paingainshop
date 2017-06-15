package paingainshop.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import paingainshop.model.DAO.*;

/**
 * Servlet implementation class DeleteNhanVien
 */
@WebServlet("/deletenhanvien")
public class DeleteNhanVien extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteNhanVien() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String MaNV = request.getParameter("MaNV");
		NhanVienDAO db = new NhanVienDAO();
		String message ="";
		try
		{
			db.deleteNhanVien(MaNV);
			message = "Xóa nhân viên thành công.";
			RequestDispatcher xxx = request.getRequestDispatcher("danhsachnhanvien");
			request.setAttribute("msg", message );
			xxx.forward(request, response);
			
		}
		catch (Exception e)
		{
			message = "Xóa nhân viên không thành công.";
			RequestDispatcher xxx = request.getRequestDispatcher("danhsachnhanvien");
			request.setAttribute("msg", message );
			xxx.forward(request, response);
		}
		
	}

}
