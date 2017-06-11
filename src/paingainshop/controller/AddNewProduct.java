package paingainshop.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import paingainshop.model.*;

/**
 * Servlet implementation class AddNewProduct
 */
@WebServlet("/addnewproduct")
public class AddNewProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNewProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try
		 {
			 String MaHH = request.getParameter("primproduct");
			 String TenHH = request.getParameter("productname");
			 String NhomHH= request.getParameter("category");
			 int GiaBan = Integer.parseInt(request.getParameter("outprice"));
			 int GiaNhap = Integer.parseInt(request.getParameter("inprice"));
			 String ThuocTinh = request.getParameter("attribute1");
			 int SoLuong = Integer.parseInt(request.getParameter("sl"));
			 String DonViTinh = request.getParameter("dvt");
			 String MaNCC = request.getParameter("vendor");
			 String GhiChu = request.getParameter("attribute2");
			 
			 HangHoa hh = new HangHoa( MaHH, TenHH, NhomHH, GiaBan, GiaNhap, ThuocTinh, SoLuong, DonViTinh, MaNCC, GhiChu);
			 DBconnect db = new DBconnect();
			 String message = "";
			 try 
			 {
				 if(db.addHangHoa(hh))
				 {
					 message = "Thêm hàng hóa thành công.";
					 RequestDispatcher xxx = request.getRequestDispatcher("addproduct.jsp");
					 request.setAttribute("msg", message );
					 xxx.forward(request, response);
				 }
				 else
				 {
					 message = "Không thành công.";
					 RequestDispatcher xxx = request.getRequestDispatcher("addproduct.jsp");
					 request.setAttribute("msg", message );
					 xxx.forward(request, response);
					 System.out.println("Lỗi.");
				 }
			 } catch (Exception e) {
				 message = "Không thành công.";
				 RequestDispatcher xxx = request.getRequestDispatcher("addproduct.jsp");
				 request.setAttribute("msg", message );
				 xxx.forward(request, response);
				 System.out.println("Lỗi.");
			 }
		 }
		 catch (Exception e)
		 {
			 String message = "Bạn đã nhập sai định dạng. Mời nhập lại!";
			 RequestDispatcher xxx = request.getRequestDispatcher("addproduct.jsp");
			 request.setAttribute("msg", message );
			 xxx.forward(request, response);
			 System.out.println("Lỗi.");
		 }
	}

}
