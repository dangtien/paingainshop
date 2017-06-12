<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="paingainshop.model.HangHoa"%>
<%@page import="java.util.ArrayList"%>
<%@include file="frame/header.jsp"%>
<%@include file="frame/sidebar.jsp"%>
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header">
		<h1>
			Quản lí hàng hóa <small>Danh sách</small>
		</h1>
		<ol class="breadcrumb">
			<li><a href="#"><i class="fa fa-dashboard"></i>Home</a></li>
			<li><a href="#">Quản lí hàng hóa</a></li>
			<li class="active">Quản lí thông tin</li>
		</ol>
	</section>
	<section class="content">
       <div class="box">
            <!-- /.box-header -->
            <div class="box-body">
              <table id="example1" class="table table-bordered table-striped table-hover">
                <thead>
                <tr>
                  <th>Mã hàng</th>
                  <th>Tên hàng</th>
                  <th>số lượng</th>
                  <th>Giá bán</th>
                  <th>Action</th>
                </tr>
                </thead>
                <tbody>
                    <% ArrayList<HangHoa> list = (ArrayList<HangHoa>)request.getAttribute("result");%>
                    <% if(list !=null){
                        for(HangHoa h:list){
                    %>
                  <tr>
                    <td><a href="#" title="click vào để xem chi tiết sản phẩm"><%= h.getMaHH()%></a></td>
                    <td><%= h.getTenHH()%></td>
                    <td><%= h.getSoLuong()%></td>
                    <td><%= h.getGiaBan()%></td>
                    <td>
                      <a href="#"><span class="fa fa-edit">Sửa</span></a>
                      <span class="fa" style="margin: 0px 5px;"></span>
                      <a href="#"><span class="fa fa-remove">Xóa</span></a>
                    </td>
                  </tr>
                  <%}}%>
                </tbody>
                <tfoot>
                <tr>
                  <th>Mã hàng</th>
                  <th>Tên hàng</th>
                  <th>số lượng</th>
                  <th>Giá bán</th>
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