package paingainshop.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import paingainshop.model.NhanVien;

/**
 * Servlet implementation class LoadIndex
 */
public class LoadIndex extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoadIndex() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
     * @param request
     * @param response
     * @throws javax.servlet.ServletException
     * @throws java.io.IOException
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
        @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            HttpSession session = request.getSession();
            NhanVien nv = (NhanVien) session.getAttribute("login");
            if(nv == null){
                response.sendRedirect("login.jsp");
            }else{
                response.sendRedirect("home.jsp");
            }
	}

	/**
     * @param request
     * @param response
     * @throws javax.servlet.ServletException
     * @throws java.io.IOException
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
        @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            /*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            */		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
