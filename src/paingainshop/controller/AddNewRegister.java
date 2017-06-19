package paingainshop.controller;

import java.io.IOException;
import java.sql.Time;
import java.text.*;
import javax.servlet.RequestDispatcher;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import paingainshop.model.*;
import paingainshop.model.DAO.BangChamCongDAO;

@WebServlet("/register")
public class AddNewRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNewRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset= UTF-8");
		request.setCharacterEncoding("utf-8");
		 try
		 {
			 
			 int MaCC=  (new BangChamCongDAO().getLastPkey()) +1;
			 Date Ngay = new Date();
			 SimpleDateFormat datefrmat = new SimpleDateFormat("yyyy-MM-dd");
	         String datestr = datefrmat.format(Ngay);
			 Time GioBD = new Time(Long.parseLong(request.getParameter("gioBD")));
			 Time GioKT = new Time(Long.parseLong(request.getParameter("gioKT")));
			 int TienPhat = Integer.parseInt(request.getParameter("tienphat"));
			 int Phucap = Integer.parseInt(request.getParameter("phucap"));
			 int Tamung = Integer.parseInt(request.getParameter("tamung"));
			 int MaCa = Integer.parseInt(request.getParameter("MaCa"));
			 String MaNV = request.getParameter("MaNV");
			 
			 BangChamCong cc = new BangChamCong( MaCC, datestr,GioBD ,GioKT , TienPhat, Phucap, Tamung, MaCa, MaNV);
			 BangChamCongDAO db = new BangChamCongDAO();
			 String message = "";
			 try 
			 {
				
					 if(db.insertBCC(cc))
					 {
						 
						 response.getWriter().println("ThÃªm thÃ nh cÃ´ng");
					 }
					 else
					 {
						 response.getWriter().println("KhÃ´ng thÃ nh cÃ´ng! Kiá»ƒm tra láº¡i thÃ´ng tin");
					 }
				 
			 } catch (Exception e) {
				response.getWriter().println("Lá»—i: " + e.getMessage());
			 }
		 }
			 catch (Exception e)
			 {
				 response.getWriter().println("Lá»—i: " + e.getMessage());
			 }
		}
		 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				doGet(request, response);
			}
}
