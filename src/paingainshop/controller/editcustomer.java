package paingainshop.controller;
import paingainshop.model.*;
import paingainshop.model.DAO.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class editcustomer
 */
@WebServlet("/editcustomer")
public class editcustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editcustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			String ten = request.getParameter("TenKH");
			String sdt = request.getParameter("SDT");
			String diachi = request.getParameter("Address");
			String email= request.getParameter("Email");
			String MaKH = request.getParameter("MaKH");
			String message1 = "";
			
			KhachHang kh = new KhachHang(MaKH,ten,diachi,sdt,email);
			KhachHangDAO db = new KhachHangDAO();
			try 
			{
				if (db.updateKhachHang(MaKH, kh));
				{
					message1 = "Sửa thông tin thành công.";
					RequestDispatcher xxx = request.getRequestDispatcher("editcustomer.jsp?MaKH="+MaKH);
					request.setAttribute("msg1", message1 );
					xxx.forward(request, response);
					
				}
				
				
			}
			catch (Exception e)
			{
				 message1 = "Cập nhật không thành công.";
				 RequestDispatcher xxx = request.getRequestDispatcher("editcustomer.jsp?MaKH="+MaKH);
				 request.setAttribute("msg1", message1 );
				 xxx.forward(request, response);
				 System.out.println("Lỗi.");
			}
		}
		catch (Exception e)
		{
			 String MaKH = request.getParameter("MaKH");
			 String message1 = "Cập nhật không thành công.";
			 RequestDispatcher xxx = request.getRequestDispatcher("editcustomer.jsp?MaKH="+MaKH);
			 request.setAttribute("msg1", message1 );
			 xxx.forward(request, response);
			 System.out.println("Lỗi.");
		}
	}

}
