<%-- 
    Document   : hoadon
    Created on : 20-06-2017, 21:42:24
    Author     : Admin
--%>

<%@page import="java.util.ArrayList"%>
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
        </ol>
    </section>
    <section class="content">
        <!-- Small boxes (Stat box) -->
        <div class="box">
            <!-- /.box-header -->
            <div class="box-body">
                <table id="example1" class="table table-bordered table-striped table-hover">
                    <thead>
                        <tr>
                            <th>Mã Hóa đơn</th>
                            <th>Mã Khách hàng</th>
                            <th>Nhân viên lập</th>
                            <th>Ngày lập</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            ArrayList<HoaDon> rs = (ArrayList<HoaDon>)request.getAttribute("rs");
                            if(rs.isEmpty()){
                                out.print("Không có dữ liệu hiển thị");
                            }else{
                                for(HoaDon hd : rs){
                        %>
                        <tr>
                            <td><a href="#"><%= hd.getMaHD()%></a></td>
                            <td><%= hd.getMaKH() %>p</td>
                            <td><%= hd.getMaNV() %></td>
                            <td><%= hd.getNgay() %></td>
                            <td><a href="chitiethoadon?mahd=<%= hd.getMaHD() %>">Chi tiết</a></td>
                        </tr>
                        <%}}%>
                    </tbody>
                    <tfoot>
                        <tr>
                            <th>Mã Hóa đơn</th>
                            <th>Mã Khách hàng</th>
                            <th>Nhân viên lập</th>
                            <th>Ngày lập</th>
                            <th>Action</th>
                        </tr>
                    </tfoot>
                </table>
            </div>
            <!-- /.box-body -->
        </div>
    </section>
</div>
<%@include file="frame/footer.jsp"%>