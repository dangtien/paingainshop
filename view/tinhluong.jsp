<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ page import="paingainshop.model.*" %>
<%@ page import="paingainshop.model.DAO.*" %>
<%@ page import="java.util.ArrayList" %>
<title>Quản Lý Tính Lương</title>
<%@include file="frame/header.jsp"%>
<%@include file="frame/sidebar.jsp"%>
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header">
		<h1>
			Quản lý tính lương <small>Thông tin các ngày làm việc</small>
		</h1>
		<ol class="breadcrumb">
			<li><a href="home.jsp"><i class="fa fa-dashboard"></i>Home</a></li>
			<li><a href="#">Quản lý tính lương</a></li>
			<li class="active">Thông tin chi tiết</li>
		</ol>
	</section>
	<section class="content">
	<span style="color:red"><i id="msg"></i></span>
	
		<div class="row">
	        <div class="col-xs-12">
	          <div class="box">
	            <div class="box-header">
	              <h3 class="box-title">Danh sách nhân viên</h3>
	            </div>
	            <!-- /.box-header -->
	            <marquee behavior="scroll" direction="left" style="width: 100%; overflow-y: hidden;color : pink;">TRANG NÀY ĐANG TRONG QUÁ TRÌNH HOÀN THIỆN NỘI DUNG... HÃY THÔNG CẢM CHO DỊCH VỤ CỦA CHÚNG TÔI NHÉ. THẢ TIM. </marquee>
	            <div class="box-body">
	              <table id="example1" class="table table-striped table-bordered  table-hover">
	                <thead>
	                <tr>
	                  <th>Mã nhân viên</th>
	                  <th>Tên nhân viên</th>
	                  <th>Số giờ làm trong tháng</th>
	                  <th>Lương/giờ</th>
	                  <th>Phạt</th>
	                   <th>Phụ cấp</th>
	                  <th>Tổng lương</th>
	                </tr>
	                </thead>
	                <tbody>
	                <% ArrayList<BangTinhLuong> list = new ArrayList<BangTinhLuong>();
	                try 
	                {
	                	list = new BangTinhLuongDAO().getInfoLuong();
	                }
	                catch (Exception e)
	                {}
	                	if(list!=null){
	                		for(BangTinhLuong btl : list){
	                			
	                	
	                %>
			                <tr>
			                  <td><%=btl.getManv() %></td>
			                  <td><%=btl.getTen() %></td>
			                  <td><%=btl.getGio() %></td>
			                  <td><%=btl.getLuong() %></td>
			                  <td><%=btl.getPhat() %></td>
			                  <td><%=btl.getPhucap() %></td>
			                  <td><%= btl.getGio()*btl.getLuong()-btl.getPhat()+btl.getPhucap() %> </td>
			                </tr>
	                <%
	                		}
	                	}
	                %>
	                
	                
	                
	                </tbody>
	                <tfoot>
	                 <tr>
	                  <th>Mã nhân viên</th>
	                  <th>Tên nhân viên</th>
	                  <th>Số giờ làm trong tháng</th>
	                  <th>Lương/giờ</th>
	                  <th>Phạt</th>
	                   <th>Phụ cấp</th>
	                  <th>Tổng Lương</th>
	                </tr>
	                </tfoot>
	              </table>
	            </div>
	            <!-- /.box-body -->
	          </div>
	         </div>
         </div>
	</section>
</div>
<%@include file="frame/footer.jsp"%>