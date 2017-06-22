<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="paingainshop.model.*" %>
<%@ page import="paingainshop.model.DAO.*" %>
<%@ page import="java.util.ArrayList" %>
<title>Quản Lý Nhà Cung Cấp</title>
<%@include file="frame/header.jsp"%>
<%@include file="frame/sidebar.jsp"%>
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header">
		<h1>
			Quản lý nhà cung cấp <small>Danh sách</small>
		</h1>
		<ol class="breadcrumb">
			<li><a href="home.jsp"><i class="fa fa-dashboard"></i>Home</a></li>
			<li><a href="#">Quản lý nhà cung cấp</a></li>
			<li class="active">Quản lý thông tin</li>
		</ol>
	</section>
	<section class="content">
	<span style="color:red"><i >${msg2}</i></span>
	<form action="addnewncc" method ="post">
		<div class="box box-default collapsed-box" >
            <div class="box-header with-border">
          <h3 class="box-title">Thêm nhà cung cấp</h3>

          <div class="box-tools pull-right">
            <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-plus"></i></button>
          </div>
        </div>
              <div class="box-body" style="display: none;">
          <div class="row">
            <div class="col-md-6">
              <div class="form-group">
                <label>Mã nhà cung cấp</label>
                    <input type="text" class="form-control" id="inputText0" style="width:100%" placeholder="Tự động sinh mã" disabled name="Manhacc">
              </div>
              <div class="form-group">
                <label>Tên nhà cung cấp</label>
                <input type="text" class="form-control" id="inputText1" style="width:100%" placeholder="Tên nhà cung cấp" name="TenNCC">
              </div>
              <!-- /.form-group -->
              <div class="form-group">
                <label>Địa chỉ</label>
                <input type="text" class="form-control" id="inputText2" style="width:100%" placeholder="Địa chỉ nhà cung cấp" name="DiaChi">
              </div>
              <!-- /.form-group -->
            </div>
            <!-- /.col -->
            <div class="col-md-6">
              <div class="form-group">
                <label>Số điện thoại</label>
                <input type="text" class="form-control" id="inputText3" style="width:100%" placeholder="Số điện thoại nhà cung cấp" name ="SDT">
              </div>
              <!-- /.form-group -->
              <div class="form-group">
                <label>Địa chỉ email</label>
                <input type="email" class="form-control" id="inputText4" style="width:100%" placeholder="Email nhà cung cấp" name ="Email">
              </div>
              <!-- /.form-group -->
              <div class="form-group">
                <label>Mã số thuế</label>
                <input type="text" class="form-control" id="inputText5" style="width:100%" placeholder="Mã số thuế nhà cung cấp" name ="Mst">
              </div>
              
            </div>
            <div class="col-md-6">
            <div class="form-group">
                <label>Ghi chú</label>
                <textarea class="form-control" id="inputText6" style="width:205.4%" placeholder="Nội dung ghi chú" rows="3" name="gc"></textarea>
              </div>
            </div>
            <!-- /.col -->
          </div>
          <!-- /.row -->
        </div>
        <div class="box-footer" style="display: none;">
          <div class="input-group-btn">
                  <button id="add-new-event" type="submit" style="float: right; margin-right: 20px; " class="btn btn-primary btn-flat">Thêm</button>
                </div>
        </div>
        </div>
        </form>
        <span style="color:red"><i>${msg1}</i></span>
		<div class="row">
	        <div class="col-xs-12">
	          <div class="box">
	            <div class="box-header">
	              <h3 class="box-title">Danh sách nhà cung cấp</h3>
	            </div>
	            <!-- /.box-header -->
	            <div class="box-body">
	              <table id="example1" class="table table-striped table-bordered  table-hover">
	                <thead>
	                <tr>
	                  <th>Mã nhà cung cấp</th>
	                  <th>Tên nhà cung cấp</th>
	                  <th>Địa chỉ</th>
	                  <th>Số điện thoại</th>
	                  <th>Action</th>
	                </tr>
	                </thead>
	                <tbody>
	                <%
	                	ArrayList <NhaCungCap> list = (ArrayList<NhaCungCap>)request.getAttribute("result");
 	                	if (list!=null)
 	                	{
 	                		for (NhaCungCap ncc : list)
 	                		{
 	                		
	                %>
	                
	                
	                 <tr>
			                  <td><%=ncc.getMaNCC() %></td>
			                  <td><%=ncc.getTenNCC() %></td>
			                  <td><%=ncc.getDiaChi() %></td>
			                  <td><%=ncc.getSoDT() %></td>
			                  <td>  <a href="editnhacc.jsp?MaNCC=<%=ncc.getMaNCC()%>"><span class="fa fa-edit">Sửa</span></a>
		                      <span class="fa" style="margin: 0px 5px;"></span>
		                      
		                       </td>
			                </tr>
	                
	                <%
	            	
 	                		}
 	                	}
	                %>
	                
	                </tbody>
	                <tfoot>
	                <tr>
	                  <th>Mã nhà cung cấp</th>
	                  <th>Tên nhà cung cấp</th>
	                  <th>Địa chỉ</th>
	                  <th>Số điện thoại</th>
	                  <th>Action</th>
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