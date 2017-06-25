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
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset= UTF-8");
        request.setCharacterEncoding("utf-8");
        try {

            int MaCC = (new BangChamCongDAO().getLastPkey()) + 1;
            Date Ngay = new Date();
            SimpleDateFormat datefrmat = new SimpleDateFormat("yyyy-MM-dd");
            String datestr = datefrmat.format(Ngay);
            String GioBD = request.getParameter("GioBD");
            String GioKT = request.getParameter("GioKT");
            int TienPhat = Integer.parseInt(request.getParameter("TienPhat"));
            int Phucap = Integer.parseInt(request.getParameter("PhuCap"));
            int Tamung = Integer.parseInt(request.getParameter("TamUng"));
            int MaCa = Integer.parseInt(request.getParameter("MaCa"));
            String MaNV = request.getParameter("MaNV");

            BangChamCong cc = new BangChamCong(MaCC, datestr, GioBD, GioKT, TienPhat, Phucap, Tamung, MaNV, MaCa);
            BangChamCongDAO db = new BangChamCongDAO();
            String message = "";
            try {

                if (db.insertBCC(cc)) {
                	message = "  Chấm công thành công.";
					RequestDispatcher xxx = request.getRequestDispatcher("register.jsp");
					request.setAttribute("msg", message );
					xxx.forward(request, response);
					
                } else {
                	message = "  Chấm công không thành công.";
					RequestDispatcher xxx = request.getRequestDispatcher("register.jsp");
					request.setAttribute("msg", message );
					xxx.forward(request, response);
					System.out.println("loi 1");
                }

            } catch (Exception e) {
            	message = "  Chấm công không thành công.";
				RequestDispatcher xxx = request.getRequestDispatcher("register.jsp");
				request.setAttribute("msg", message );
				xxx.forward(request, response);
				System.out.println("loi 2");
            }
        } catch (Exception e) {
        	String message = "  Chấm công không thành công.";
			RequestDispatcher xxx = request.getRequestDispatcher("register.jsp");
			request.setAttribute("msg", message );
			xxx.forward(request, response);
			System.out.println("loi 3");
        }
    }

   
}
