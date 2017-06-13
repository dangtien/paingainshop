package paingainshop.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import paingainshop.model.DAO.*;
import paingainshop.model.*;
/**
 * Servlet implementation class LoadDanhSachKhachHang
 */
@WebServlet("/danhsachkhachhang")
public class LoadDanhSachKhachHang extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoadDanhSachKhachHang() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<KhachHang> result = new ArrayList<KhachHang>();
		try
		{
			result = new KhachHangDAO().getAllCustomer();
			request.setAttribute("result", result);
			request.getRequestDispatcher("customer.jsp").forward(request, response);
		}
		catch (Exception e)
		{
			System.out.println("loi -->:" +e);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
