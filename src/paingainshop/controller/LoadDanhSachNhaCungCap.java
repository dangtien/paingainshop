package paingainshop.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import paingainshop.model.NhaCungCap;
import paingainshop.model.DAO.KhachHangDAO;
import paingainshop.model.DAO.NhaCungCapDAO;

/**
 * Servlet implementation class LoadDanhSachNhaCungCap
 */
@WebServlet("/danhsachnhacungcap")
public class LoadDanhSachNhaCungCap extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoadDanhSachNhaCungCap() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<NhaCungCap> result = new ArrayList<NhaCungCap>();
		try
		{
			result = new NhaCungCapDAO().getAll();
			request.setAttribute("result", result);
			request.getRequestDispatcher("nhacc.jsp").forward(request, response);
		}
		catch (Exception e)
		{
			System.out.println("loi -->:" +e);
		}
	}

}
