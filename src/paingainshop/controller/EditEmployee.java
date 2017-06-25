package paingainshop.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.ParseConversionEvent;

import paingainshop.model.DAO.*;
import paingainshop.model.*;

/**
 * Servlet implementation class EditEmployee
 */
@WebServlet("/editemployee")
public class EditEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditEmployee() {
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
			String MaNV = request.getParameter("MaNV");
			String TenNV = request.getParameter("Tennv");
			String Username = request.getParameter("Username");
			String Email = request.getParameter("Email");
			String Pass = request.getParameter("Password");
			String DiaChi = request.getParameter("Diachi");
			String SDT = request.getParameter("Sodt");
			int Luong = Integer.parseInt(request.getParameter("Luong"));
			String gc = request.getParameter("attribute");
			String tt= request.getParameter("TrangThai");
			
			NhanVien nv = new NhanVien(MaNV,TenNV,Luong,Email,DiaChi,SDT,Username,Pass,gc,tt);
			NhanVienDAO db = new NhanVienDAO();
			String message ="";
			try
			{
				if (TenNV!= "" && Username!= "" && Pass != "" && DiaChi!= "" && SDT!= "" ) 
				{
					db.updateNhanVien(MaNV, nv);
					message = "Cập nhật thông tin thành công.";
					RequestDispatcher xxx = request.getRequestDispatcher("editEmployee.jsp?MaNV="+MaNV);
					request.setAttribute("msg", message );
					xxx.forward(request, response);
				}
				else
				{
					message = "Cập nhật thông tin không thành công.";
					RequestDispatcher xxx = request.getRequestDispatcher("editEmployee.jsp?MaNV="+MaNV);
					request.setAttribute("msg", message );
					xxx.forward(request, response);
				}
				
			}
			catch (Exception e)
			{
				message = "Cập nhật thông tin không thành công.";
				RequestDispatcher xxx = request.getRequestDispatcher("editEmployee.jsp?MaNV="+MaNV);
				request.setAttribute("msg", message );
				xxx.forward(request, response);
			}
		}
		catch (Exception e)
		{
			String message = "Cập nhật thông tin không thành công.";
			String MaNV = request.getParameter("MaNV");
			RequestDispatcher xxx = request.getRequestDispatcher("editEmployee.jsp?MaNV="+MaNV);
			request.setAttribute("msg", message );
			xxx.forward(request, response);
		}
	}

}
