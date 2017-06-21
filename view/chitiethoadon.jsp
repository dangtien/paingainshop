<%-- 
    Document   : chitiethoadon
    Created on : 20-06-2017, 22:23:03
    Author     : Admin
--%>

<%@page import="paingainshop.model.DAO.HangHoaDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="paingainshop.model.CTHoaDon"%>
<%@page import="paingainshop.model.KhachHang"%>
<%@page import="paingainshop.model.NhanVien"%>
<%@page import="paingainshop.model.HoaDon"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="frame/header.jsp"%>
<%@include file="frame/sidebar.jsp"%>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>
            Trang chủ
            <small>Quản lí hàng hóa</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i>Home</a></li>
            <li class="active">Hóa đơn</li>
            <li class="active">Chi tiết hóa đơn</li>
        </ol>
    </section>
    <section class="content">
        <!-- Small boxes (Stat box) -->
        <div class="box box-default">
            <div class="box-header with-border">
                <h3 class="box-title">Thông tin Hóa đơn</h3>

                <div class="box-tools pull-right">
                    <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                </div>
            </div>
            <div class="box-body">
                <div class="row">
                    <%
                        HoaDon hd = (HoaDon)request.getAttribute("hd");
                        KhachHang kh= (KhachHang)request.getAttribute("kh");
                        NhanVien nv = (NhanVien)request.getAttribute("nv");
                    %>
                    <div class="col-md-6">
                        <div class="form-group">
                            <label>Mã Hóa đơn</label>
                            <h3 class="text-muted" style=" margin: 0px;margin-left: 20px;"><%= hd.getMaHD() %></h3>
                        </div>
                        <div class="form-group">
                            <label>Tên khách hàng</label>
                            <h3 class="text-muted" style=" margin: 0px;margin-left: 20px;"><%= kh.getTenHK() %></h3>
                        </div>
                        <div class="form-group">
                            <label>Nhân viên lập</label>
                            <h3 class="text-muted" style=" margin: 0px;margin-left: 20px;"><%= nv.getUserName() %></h3>
                        </div>
                    </div>
                    <!-- /.col -->
                    <div class="col-md-6">
                        <!-- /.form-group -->
                        <div class="form-group">
                            <label>Mã Khách hàng</label>
                            <h3 class="text-muted" style=" margin: 0px;margin-left: 20px;"><%= kh.getMaKH()%></h3>
                        </div>
                        <div class="form-group">
                            <label>Ngày lập</label>
                            <h3 class="text-muted" style=" margin: 0px;margin-left: 20px;"><%= hd.getNgay() %></h3>
                        </div>
                        <div class="form-group">
                            <label>Tổng giá trị</label>
                            <h3 class="text-muted" style=" margin: 0px;margin-left: 20px;"><%= request.getAttribute("total") %></h3>
                        </div>
                        <!-- /.form-group -->
                    </div>
                    <!-- /.col -->
                </div>
                <!-- /.row -->
            </div>
        </div>
        <div class="box">
            <!-- /.box-header -->
            <div class="box-body">
                <table id="example1" class="table table-bordered table-striped table-hover">
                    <thead>
                        <tr>
                            <th>STT</th>
                            <th>Mã hàng</th>
                            <th>Tên hàng</th>
                            <th width="125px">Đơn giá</th>
                            <th width="88px">Số lượng</th>
                            <th width="75px">Giảm giá</th>
                            <th>Thành tiền</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            ArrayList<CTHoaDon> list = (ArrayList<CTHoaDon>) request.getAttribute("cthd");
                            if (list.isEmpty()) {
                                out.print("Không có dữ liệu hiển thị");
                            } else {
                                int index = 0;
                                for (CTHoaDon ctiet : list) {
                                    index += 1;
                                    String tensp = new HangHoaDAO().getById(ctiet.getMaHH()).getTenHH();
                                    long money = (ctiet.getDonGia() * ctiet.getSoLuong()) - ((ctiet.getDonGia() * ctiet.getSoLuong()) * ctiet.getGiamGia()) / 100;
                        %>
                        <tr>
                            <td><%= index%></td>
                            <td><%= ctiet.getMaHH()%></td>
                            <td><%= tensp%></td>
                            <td><%= ctiet.getDonGia()%></td>
                            <td><%= ctiet.getSoLuong()%></td>
                            <td><%= ctiet.getGiamGia()%></td>
                            <td><%= money%></td>
                        </tr>
                        <%}
                            }%>
                    </tbody>
                    <tfoot>
                        <tr>
                            <th>STT</th>
                            <th>Mã hàng</th>
                            <th>Tên hàng</th>
                            <th width="125px">Đơn giá</th>
                            <th width="88px">Số lượng</th>
                            <th width="75px">Giảm giá</th>
                            <th>Thành tiền</th>
                        </tr>
                    </tfoot>
                </table>
            </div>
            <!-- /.box-body -->
        </div>
    </section>
</div>
<%@include file="frame/footer.jsp" %>
