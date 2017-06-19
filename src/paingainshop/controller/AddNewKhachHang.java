package paingainshop.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import paingainshop.model.*;
import paingainshop.model.DAO.HangHoaDAO;
import paingainshop.model.DAO.KhachHangDAO;
import paingainshop.model.service.PainAndGainService;

/**
 * Servlet implementation class AddNewKhachHang
 */
@WebServlet("/addcustomer")
public class AddNewKhachHang extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNewKhachHang() {
        super();
        // TODO Auto-generated constructor stub
    }
    

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset= UTF-8");
		request.setCharacterEncoding("utf-8");
		 try
		 {
			 //
			 String MaKH =PainAndGainService.CreatePKey("KH", new KhachHangDAO().getLastPkey());
			 String TenHK =request.getParameter("TenKH");
			 String DiaChi =request.getParameter("Address");
			 String SoDT =request.getParameter("SDT");
			 String Email =request.getParameter("Email");
			 
			 KhachHang kh = new KhachHang( MaKH, TenHK, DiaChi, SoDT, Email);
			 KhachHangDAO db = new KhachHangDAO();
			 
			 String message = "";
			 try 
			 {
				 if (TenHK !="" && DiaChi!= "" && SoDT!="" && Email!="" )
				 {
					 if(db.insertKhachHang(kh))
					 {
						 
						 response.getWriter().println("Thêm thành công");
					 }
					 else
					 {
						 response.getWriter().println("Không thành công! Kiểm tra lại thông tin");
					 }
				 }
				 else 
				 {
					 response.getWriter().println("Không thành công! Kiểm tra lại thông tin");
				 }
			 } catch (Exception e) {
				response.getWriter().println("Lỗi: " + e.getMessage());
			 }
		 }
		 catch (Exception e)
		 {
			 response.getWriter().println("Lỗi: " + e.getMessage());
		 }
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
