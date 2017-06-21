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
 * Servlet implementation class AddEmployee
 */
@WebServlet("/addemployee")
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployee() {
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
			
			String MaNV = PainAndGainService.CreatePKey("NV", new NhanVienDAO().getLastPkey());
			String TenNV = request.getParameter("Tennv");
			int Luong = Integer.parseInt(request.getParameter("Luong"));
			String Username = request.getParameter("Username");
			String Pass =request.getParameter("Password");
			String Email = request.getParameter("Email");
			String DiaChi = request.getParameter("Diachi");
			String SDT = request.getParameter("Sodt");
			String gc= request.getParameter("Ghichu");
			String tt= "";
			NhanVien nv = new NhanVien(MaNV,TenNV,Luong,Email,DiaChi,SDT,Username,Pass,gc,tt);
			NhanVienDAO db = new NhanVienDAO();
			String message ="";
			try 
			{
				if (TenNV!= "" && Username!= "" && Pass != ""  && DiaChi!= "" && SDT!= "" ) 
				{
					db.insertNhanVien(nv);
					message = "Thêm nhân viên thành công.";
					RequestDispatcher xxx = request.getRequestDispatcher("employee.jsp");
					request.setAttribute("msg2", message );
					xxx.forward(request, response);
				}
				else
				{
					message = "Thêm nhân viên không thành công.";
					RequestDispatcher xxx = request.getRequestDispatcher("editEmployee.jsp?MaNV="+MaNV);
					request.setAttribute("msg", message );
					xxx.forward(request, response);
				}
			}
			catch (Exception e)
			{
				message = "Thêm nhân viên không thành công.";
				RequestDispatcher xxx = request.getRequestDispatcher("employee.jsp");
				request.setAttribute("msg2", message );
				xxx.forward(request, response);
				
			}
		} catch (Exception e) {
			
			String message = "Thêm nhân viên không thành công.";
			RequestDispatcher xxx = request.getRequestDispatcher("employee.jsp");
			request.setAttribute("msg2", message );
			xxx.forward(request, response);
			
		}
	}

}
