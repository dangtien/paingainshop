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
import paingainshop.model.service.PainAndGainService;

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

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.setContentType("text/html; charset=UTF-8");
       request.setCharacterEncoding("utf-8");
        String message = "";
        try {
            String MaHH = PainAndGainService.CreatePKey("SP", new HangHoaDAO().getLastPkey());
            String TenHH = request.getParameter("productname");
            String NhomHH = request.getParameter("category");
            int GiaBan = Integer.parseInt(request.getParameter("outprice"));
            int GiaNhap = Integer.parseInt(request.getParameter("inprice"));
            String ThuocTinh = request.getParameter("attribute1");
            int SoLuong = Integer.parseInt(request.getParameter("sl"));
            String DonViTinh = request.getParameter("dvt");
            String MaNCC = request.getParameter("vendor");
            String GhiChu = request.getParameter("attribute2");

            HangHoa hh = new HangHoa(MaHH, TenHH, NhomHH, GiaBan, GiaNhap, ThuocTinh, SoLuong, DonViTinh, MaNCC, GhiChu);
            HangHoaDAO db = new HangHoaDAO();

            try {
                if (db.insertHangHoa(hh)) {
                    message = "Thêm sản phẩm thành công.";

                } else {
                    message = "Không thành công.";

                }
            } catch (Exception e) {
                message = "Không thành công. " + e.getMessage();
            }
        } catch (Exception e) {
            message = "Bạn đã nhập sai định dạng. Mời bạn nhập lại!";
        }
        response.getWriter().print(message);

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
