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
import paingainshop.model.service.PainAndGainService;

/**
 * Servlet implementation class AddNewNCC
 */
@WebServlet("/addnewncc")
public class AddNewNCC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNewNCC() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset= UTF-8");
		request.setCharacterEncoding("utf-8");
		try {
			
			String MaNCC = PainAndGainService.CreatePKey("NC", new NhaCungCapDAO().getLastPkey());
			String ten = request.getParameter("TenNcc");
			String mathue = request.getParameter("Mst");
			String email = request.getParameter("Email");
			String diachi = request.getParameter("DiaChi");
			String sdt= request.getParameter("SDT");
			String gc = request.getParameter("gc");
			
			String message = "";
			
			NhaCungCap ncc= new NhaCungCap(MaNCC,ten,mathue,diachi,sdt,email,gc);
			NhaCungCapDAO db = new NhaCungCapDAO();
			try 
			{
				if (ten !="" && mathue !=""&&email!=""&& diachi!= "" && sdt!="" ) 
				{
					try {
						db.insertNhaCungCap(ncc);
					}
					catch (Exception e)
					{
						System.out.println("loi o day");
					}
					message = "Thêm nhà cung cấp thành công.";
					RequestDispatcher xxx = request.getRequestDispatcher("nhacc.jsp");
					request.setAttribute("msg2", message );
					xxx.forward(request, response);
					
				}
				else
				{
					message = "Thêm nhà cung cấp không thành công.";
					RequestDispatcher xxx = request.getRequestDispatcher("nhacc.jsp");
					request.setAttribute("msg2", message );
					xxx.forward(request, response);
					System.out.println("loi 1");
				}
			}
			catch (Exception e)
			{
				message = "Thêm nhà cung cấp không thành công.";
				RequestDispatcher xxx = request.getRequestDispatcher("nhacc.jsp");
				request.setAttribute("msg2", message );
				xxx.forward(request, response);
				System.out.println("loi 2");
				
			}
		} catch (Exception e) {
			
			String message = "Thêm nhà cung cấp không thành công.";
			RequestDispatcher xxx = request.getRequestDispatcher("nhacc.jsp");
			request.setAttribute("msg2", message );
			xxx.forward(request, response);
			System.out.println("loi 3");
		}
	}

}
