<%@page import="paingainshop.model.DAO.NhanVienDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page import="paingainshop.model.*" %>
<%@ page import="java.util.ArrayList" %>
<%@include file="frame/header.jsp"%>
<%@include file="frame/sidebar.jsp"%>
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header">
		<h1>
			Quản lý phiếu chi <small>Danh sách</small>
		</h1>
		<ol class="breadcrumb">
			<li><a href="home.jsp"><i class="fa fa-dashboard"></i>Home</a></li>
			<li><a href="#">Quản lý phiếu chi</a></li>
			<li class="active">Thông tin chi tiết</li>
		</ol>
	</section>
	<section class="content">
	
	
        
		<div class="row">
	        <div class="col-xs-12">
	          <div class="box">
	            <div class="box-header">
	              <h3 class="box-title">Danh sách phiếu chi</h3>
	            </div>
	            <!-- /.box-header -->
	            <div class="box-body">
	              <table id="example1" class="table table-striped table-bordered  table-hover">
	                <thead>
	                <tr>
	                  <th>Mã phiếu chi</th>
	                  <th>Ngày tạo</th>
	                  <th>Loại chi</th>
	                  <th>Người nhận</th>
	                  <th>Giá trị</th>
	                  <th>Người tạo</th>
	                </tr>
	                </thead>
	                <tbody>
                         
	                <% ArrayList<PhieuChi> list = (ArrayList<PhieuChi>)request.getAttribute("result");%>
	                <%
	                	if(list!=null){
	                		for(PhieuChi pc : list){
	                			NhanVien nv = new NhanVienDAO().getUserByID(pc.getMaNV());
	                	
	                %>
			                <tr>
			                  <td><%=pc.getMaPC()%></td>
			                  <td><%=pc.getNgay()%></td>
			                  <td><%=pc.getLoaiChi() %></td>
                                          <td><%=pc.getNguoiNhan()%></td>
			                  <td><%=pc.getGiaTri()%></td>
                                          <td><%=nv.getHoTen()%></td>
			                  
			                </tr>
	                <%
	                		}
	                	}
	                %>
	                
	                
	                
	                </tbody>
	                <tfoot>
	                 <tr>
	                  <th>Mã phiếu chi</th>
	                  <th>Ngày tạo</th>
	                  <th>Loại chi</th>
	                  <th>Người nhận</th>
	                  <th>Giá trị</th>
	                  <th>Người tạo</th>
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