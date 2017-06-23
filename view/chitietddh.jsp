<%-- 
    Document   : chitietddh
    Created on : Jun 21, 2017, 10:43:51 PM
    Author     : Asus
--%>

<%@page import="paingainshop.model.DAO.HangHoaDAO"%>
<%@page import="paingainshop.model.DAO.NhanVienDAO"%>
<%@page import="paingainshop.model.DonDatHang"%>
<%@page import="paingainshop.model.CTDonDatHang"%>
<%@page import="java.util.ArrayList"%>
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
            <li><a href="danhsach">Danh sách đơn đặt hàng</li></a>
            <li class="active">Chi tiết đơn đặt hàng</li>
        </ol>
    </section>
    <section class="content">
        <!-- Small boxes (Stat box) -->
        <form action ="updatettdondathang" method="post">  
           
        <div class="box box-default">
            <div class="box-header with-border">
                <h3 class="box-title">Thông tin đơn đặt hàng</h3>
                    <span style="color:red">${msg1}</span>
                <div class="box-tools pull-right">
                    <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                </div>
            </div>
            <div class="box-body">
                <div class="row">
                    <%
                        
                        DonDatHang dh = (DonDatHang) request.getAttribute("dh");
                    %>
                    <div class="col-md-6">
                        <div class="form-group">
                            <label>Mã đơn đặt hàng</label>
                             <input type="hidden" name="MaDDH" value="<%= dh.getMaDDH()%>" size="0" />
                            <h3 class="text-muted" style=" margin: 0px;margin-left: 20px;"><%= dh.getMaDDH()%></h3>
                        </div>
                        <div class="form-group">
                            <label>Nhân viên lập</label>
                            <h3 class="text-muted" style=" margin: 0px;margin-left: 20px;"><%= new NhanVienDAO().getUserByID(dh.getMaNV()).getHoTen()%></h3>
                        </div>
                    </div>
                    <!-- /.col -->
                    <div class="col-md-6">
                        <!-- /.form-group -->
                        <div class="form-group">
                            <label>Ngày lập</label>
                            <h3 class="text-muted" style=" margin: 0px;margin-left: 20px;"><%= dh.getNgay()%></h3>
                        </div>
                        <div class="form-group">
                            <label>Tổng giá trị</label>
                            <h3 class="text-muted" style=" margin: 0px;margin-left: 20px;"><%= request.getAttribute("total")%></h3>
                        </div>
                        <div>
                            <button type="submit"  class="btn btn-primary" style="float:right"> Cập nhật trạng thái</button>
                        </div>
                        <!-- /.form-group -->
                    </div>
                    <!-- /.col -->
                </div>
                <!-- /.row -->
            </div>
        </div>
        </form>
        <div class="box">
            <!-- /.box-header -->
            <div class="box-body">
                <table id="example1" class="table table-bordered table-striped table-hover">
                    <thead>
                        <tr>
                            <th>STT</th>
                            <th>Mã hàng</th>
                            <th>Tên hàng</th>
                            <th width="125px">Đơn giá nhập</th>
                            <th width="88px">Số lượng</th>
                            <th>Thành tiền</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            int i = 1;
                            ArrayList<CTDonDatHang> list = (ArrayList<CTDonDatHang>) request.getAttribute("rs");
                            for (CTDonDatHang ct : list) {
                                long money = ct.getDonGia() * ct.getSoLuong();
                                String tensp = new HangHoaDAO().getById(ct.getMaHH()).getTenHH();

                        %>
                        <tr>
                            <td><%= i %></td>
                            <td><%= ct.getMaDDH()%></td>
                            <td><%=tensp %></td>
                            <td><%= ct.getDonGia()%></td>
                            <td><%=ct.getSoLuong()%></td>
                            <td><%= money%></td>
                        </tr>
                        <% i++;
                            }
                        %>
                    </tbody>
                    <tfoot>
                        <tr>
                            <th>STT</th>
                            <th>Mã hàng</th>
                            <th>Tên hàng</th>
                            <th width="125px">Đơn giá nhập</th>
                            <th width="88px">Số lượng</th>
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
