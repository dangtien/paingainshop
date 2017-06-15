package paingainshop.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import paingainshop.model.DAO.NhanVienDAO;
import paingainshop.model.NhanVien;
import java.util.*;
/**
 * Servlet implementation class LoadDanhSachNhanVien
 */
@WebServlet("/danhsachnhanvien")
public class LoadDanhSachNhanVien extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoadDanhSachNhanVien() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<NhanVien> result = new ArrayList<NhanVien>();
		try
		{
			result = new NhanVienDAO().getAll();
			request.setAttribute("result", result);
			request.getRequestDispatcher("employee.jsp").forward(request, response);
		}
		catch (Exception e)
		{
			response.getWriter().print("Loi: "+ e.getMessage());
		}
	}

}
