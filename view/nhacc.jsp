<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
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
		<div class="box box-default" >
            <div class="box-header with-border">
          <h3 class="box-title">Thêm nhà cung cấp</h3>

          <div class="box-tools pull-right">
            <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
          </div>
        </div>
              <div class="box-body">
          <div class="row">
            <div class="col-md-6">
              <div class="form-group">
                <label>Mã nhà cung cấp</label>
                    <input type="text" class="form-control" id="inputText0" style="width:100%" placeholder="NCxxxxxx" disabled name="Manhacc">
              </div>
              <div class="form-group">
                <label>Tên nhà cung cấp</label>
                <input type="text" class="form-control" id="inputText1" style="width:100%" placeholder="Tên nhà cung cấp">
              </div>
              <!-- /.form-group -->
              <div class="form-group">
                <label>Địa chỉ</label>
                <input type="text" class="form-control" id="inputText2" style="width:100%" placeholder="Địa chỉ nhà cung cấp">
              </div>
              <!-- /.form-group -->
            </div>
            <!-- /.col -->
            <div class="col-md-6">
              <div class="form-group">
                <label>Số điện thoại</label>
                <input type="text" class="form-control" id="inputText3" style="width:100%" placeholder="Số điện thoại nhà cung cấp">
              </div>
              <!-- /.form-group -->
              <div class="form-group">
                <label>Địa chỉ email</label>
                <input type="email" class="form-control" id="inputText4" style="width:100%" placeholder="Email nhà cung cấp">
              </div>
              <!-- /.form-group -->
              <div class="form-group">
                <label>Mã số thuế</label>
                <input type="text" class="form-control" id="inputText5" style="width:100%" placeholder="Mã số thuế nhà cung cấp">
              </div>
              
            </div>
            <div class="col-md-6">
            <div class="form-group">
                <label>Ghi chú</label>
                <textarea class="form-control" id="inputText6" style="width:205.4%" placeholder="Nội dung ghi chú" rows="3"></textarea>
              </div>
            </div>
            <!-- /.col -->
          </div>
          <!-- /.row -->
        </div>
        <div class="box-footer">
          <div class="input-group-btn">
                  <button id="add-new-event" type="button" style="float: right; margin-right: 20px; " class="btn btn-primary btn-flat">Thêm</button>
                </div>
        </div>
        </div>
		<div class="row">
	        <div class="col-xs-12">
	          <div class="box">
	            <div class="box-header">
	              <h3 class="box-title">Danh sách nhà cung cấp</h3>
	            </div>
	            <!-- /.box-header -->
	            <div class="box-body">
	              <table id="example2" class="table table-bordered table-hover">
	                <thead>
	                <tr>
	                  <th>Mã nhà cung cấp</th>
	                  <th>Tên nhà cung cấp</th>
	                  <th>Địa chỉ</th>
	                  <th>Số điện thoại</th>
	                  <th>Email</th>
	                  <th>Tác vụ</th>
	                </tr>
	                </thead>
	                <tbody>
	                <tr>
	                  <td>Trident</td>
	                  <td>Internet
	                    Explorer 5.5
	                  </td>
	                  <td>Win 95+</td>
	                  <td>5.5</td>
	                  <td>A</td>
	                  <td> <a href="#" style="float: left; margin-left: 20px">Sửa</a>
	                  		<a href="#" style="float: right; margin-right: 20px">Xóa</a>
	                  </td>
	                </tr>
	                
	                <tr>
	                  <td>Misc</td>
	                  <td>PSP browser</td>
	                  <td>PSP</td>
	                  <td>-</td>
	                  <td>C</td>
	                  <td > <a href="#" style="float: left; margin-left: 20px">Sửa</a>
	                  		<a href="#" style="float: right; margin-right: 20px">Xóa</a>
	                  </td>
	                </tr> 
	                <tr>
	                  <td>Other browsers</td>
	                  <td>All others</td>
	                  <td>-</td>
	                  <td>-</td>
	                  <td>U</td>
	                  <td> <a href="#" style="float: left; margin-left: 20px">Sửa</a>
	                  		<a href="#" style="float: right; margin-right: 20px">Xóa</a>
	                  </td>
	                </tr>
	                </tbody>
	                <tfoot>
	                <tr>
	                
	                  <th>Mã nhà cung cấp</th>
	                  <th>Tên nhà cung cấp</th>
	                  <th>Địa chỉ</th>
	                  <th>Số điện thoại</th>
	                  <th>Email</th>
	                  <th>Tác vụ</th>
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