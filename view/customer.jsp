<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="frame/header.jsp"%>
<%@include file="frame/sidebar.jsp"%>
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header">
		<h1>
			Quản lý khách hàng <small>Danh sách</small>
		</h1>
		<ol class="breadcrumb">
			<li><a href="home.jsp"><i class="fa fa-dashboard"></i>Home</a></li>
			<li><a href="#">Quản lý khách hàng</a></li>
			<li class="active">Quản lý thông tin</li>
		</ol>
	</section>
	<section class="content">
		<div class="box box-default" >
            <div class="box-header with-border">
          <h3 class="box-title">Thêm khách hàng</h3>

          <div class="box-tools pull-right">
            <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
          </div>
        </div>
              <div class="box-body">
          <div class="row">
            <div class="col-md-6">
              <div class="form-group">
                <label>Mã khách hàng</label>
                    <input type="text" class="form-control" id="inputText0" style="width:100%" placeholder="KHxxxx" disabled name="MaKH">
              </div>
              <div class="form-group">
                <label>Tên khách hàng</label>
                <input type="text" class="form-control" id="inputText1" style="width:100%" placeholder="Tên khách hàng">
              </div>
              <div class="form-group">
                <label>Số điện thoại</label>
                <input type="text" class="form-control" id="inputText3" style="width:100%" placeholder="Số điện thoại khách hàng">
              </div>
              <!-- /.form-group -->
              <!-- /.form-group -->
            </div>
            <!-- /.col -->
            <div class="col-md-6">
            <!-- /.form-group -->
              <div class="form-group">
                <label>Địa chỉ</label>
                <input type="text" class="form-control" id="inputText2" style="width:100%" placeholder="Địa chỉ khách hàng">
              </div>
              <div class="form-group">
                <label>Địa chỉ email</label>
                <input type="email" class="form-control" id="inputText4" style="width:100%" placeholder="Email khách hàng">
              </div>
              <!-- /.form-group -->
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
	              <h3 class="box-title">Danh sách khách hàng</h3>
	            </div>
	            <!-- /.box-header -->
	            <div class="box-body">
	              <table id="example1" class="table table-striped table-bordered  table-hover">
	                <thead>
	                <tr>
	                  <th>Mã khách hàng</th>
	                  <th>Tên khách hàng</th>
	                  <th>Địa chỉ</th>
	                  <th>Tổng số hóa đơn</th>
	                  <th>Tổng tiền</th>
	                  <th>Action</th>
	                </tr>
	                </thead>
	                <tbody>
	                <tr>
	                  <td><a href="#" title="click vào để xem chi tiết nhà cung cấp">Trident</a></td>
	                  <td>Internet
	                    Explorer 5.5
	                  </td>
	                  <td>Win 95+</td>
	                  <td>A</td>
	                  <td>35000</td>
	                  <td>  <a href="editcustomer.jsp"><span class="fa fa-edit">Sửa</span></a>
                      <span class="fa" style="margin: 0px 5px;"></span>
                      <a href="#"><span class="fa fa-remove">Xóa</span></a>
                       </td>
	                </tr>
	                
	                <tr>
	                  <td><a href="#" title="click vào để xem chi tiết nhà cung cấp">Trident</a></td>
	                  <td>PSP browser</td>
	                  <td>PSP</td>
	                  <td>-</td>
	                  <td>35000</td>
	                  <td > 
	                  	 <a href="editcustomer.jsp"><span class="fa fa-edit">Sửa</span></a>
                      <span class="fa" style="margin: 0px 5px;"></span>
                      <a href="#"><span class="fa fa-remove">Xóa</span></a>
	                  </td>
	                </tr> 
	                <tr>
	                  <td><a href="#" title="click vào để xem chi tiết nhà cung cấp">Trident</a></td>
	                  <td>All others</td>
	                  <td>-</td>
	                  <td>-</td>
	                  <td>35000</td>
	                  <td> 
	                  	 <a href="editcustomer.jsp"><span class="fa fa-edit">Sửa</span></a>
                      <span class="fa" style="margin: 0px 5px;"></span>
                      <a href="#"><span class="fa fa-remove">Xóa</span></a>
	                  </td>
	                </tr>
	                </tbody>
	                <tfoot>
	                 <tr>
	                  <th>Mã khách hàng</th>
	                  <th>Tên khách hàng</th>
	                  <th>Địa chỉ</th>
	                  <th>Tổng số hóa đơn</th>
	                  <th>Tổng tiền</th>
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