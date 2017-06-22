package paingainshop.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import paingainshop.model.*;
import paingainshop.model.DAO.*;
/**
 * Servlet implementation class EditNhacc
 */
@WebServlet("/editnhacc")
public class EditNhacc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditNhacc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset= UTF-8");
		request.setCharacterEncoding("utf-8");
		try
		{
			
			String ten = request.getParameter("Tenncc");
			String mathue = request.getParameter("Masothue");
			String email = request.getParameter("Email");
			String diachi = request.getParameter("Diachi");
			String sdt= request.getParameter("Sodt");
			String gc = request.getParameter("attribute");
			String MaNCC = request.getParameter("MaNCC");
			String message1 = "";
			
			NhaCungCap ncc= new NhaCungCap(MaNCC,ten,mathue,diachi,sdt,email,gc);
			NhaCungCapDAO db = new NhaCungCapDAO();
			try 
			{
				if (ten !="" && mathue !=""  && diachi!= "" && sdt!= "" )
				 {
					    db.updateNhaCungCap(MaNCC, ncc);
					    message1 = "Cập nhật thông tin thành công.";
						RequestDispatcher xxx = request.getRequestDispatcher("editnhacc.jsp?MaNCC="+MaNCC);
						request.setAttribute("msg1", message1 );
						xxx.forward(request, response);
						
					
				 }
				else
				{
					 message1 = "Cập nhật không thành công.";
					 RequestDispatcher xxx = request.getRequestDispatcher("editnhacc.jsp?MaNCC="+MaNCC);
					 request.setAttribute("msg1", message1 );
					 xxx.forward(request, response);
					 System.out.println("Lỗi.1");
				}
				
			}
			catch (Exception e)
			{
				 message1 = "Cập nhật không thành công.";
				 RequestDispatcher xxx = request.getRequestDispatcher("editnhacc.jsp?MaNCC="+MaNCC);
				 request.setAttribute("msg1", message1 );
				 xxx.forward(request, response);
				 System.out.println("Lỗi.2");
			}
		}
		catch (Exception e)
		{
			 String MaNCC = request.getParameter("MaNCC");
			 String message1 = "Cập nhật không thành công.";
			 RequestDispatcher xxx = request.getRequestDispatcher("editnhacc.jsp?MaNCC="+MaNCC);
			 request.setAttribute("msg1", message1 );
			 xxx.forward(request, response);
			 System.out.println("Lỗi.3");
		}
	}

}
