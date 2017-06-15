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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 try
		 {
			 //String MaHH = PainAndGainService.CreatePKey("SP", new HangHoaDAO().getLastPkey());
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
				 if(db.insertKhachHang(kh))
				 {
					 message = "Thêm khách hàng thành công.";
					 RequestDispatcher xxx = request.getRequestDispatcher("customer.jsp");
					 request.setAttribute("msg", message );
					 xxx.forward(request, response);
				 }
				 else
				 {
					 message = "Không thành công.";
					 RequestDispatcher xxx = request.getRequestDispatcher("danhsachkhachhang");
					 request.setAttribute("msg", message );
					 xxx.forward(request, response);
					 System.out.println("lỗi.");
				 }
			 } catch (Exception e) {
				 message = "Không thành công.";
				 RequestDispatcher xxx = request.getRequestDispatcher("danhsachkhachhang");
				 request.setAttribute("msg", message );
				 xxx.forward(request, response);
				 System.out.println("Lỗi.");
			 }
		 }
		 catch (Exception e)
		 {
			 String message = "Không thành công.";
			 RequestDispatcher xxx = request.getRequestDispatcher("customer.jsp");
			 request.setAttribute("msg", message );
			 xxx.forward(request, response);
		 }
	}

}
