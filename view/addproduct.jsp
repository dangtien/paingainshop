<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="frame/header.jsp"%>
<%@include file="frame/sidebar.jsp"%>
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header">
		<h1>
			Trang chủ <small>Tổng quan</small>
		</h1>
		<ol class="breadcrumb">
			<li><a href="#"><i class="fa fa-dashboard"></i>Home</a></li>
			<li class="active">Tổng quan</li>
		</ol>
	</section>
	    <section class="content">
    	<!-- đây là nội dung -->
    	<form class="form-horizontal">
    	<div class="col-md-6">
    		<div class="box box-info">
            <div class="box-header with-border">
              <h3 class="box-title">Điền thông tin</h3>
            </div>
            <!-- /.box-header -->
            <!-- form start -->
              <div class="box-body">
                <div class="form-group">
                  <label for="inputText0" class="col-sm-2 control-label">Mã Hàng</label>
                  <div class="col-sm-10">
                    <input type="email" class="form-control" id="inputText0" placeholder="HHxxxxxx" disabled name="primproduct">
                  </div>
                </div>
                 <div class="form-group">
                  <label for="inputText1" class="col-sm-2 control-label">Tên hàng</label>
                  <div class="col-sm-10">
                    <input type="email" class="form-control" id="inputText1" placeholder="Tên hàng hóa" name="productname">
                  </div>
                </div>
                <div class="form-group">
                  <label for="inputText2" class="col-sm-2 control-label">Nhóm hàng</label>
                  <div class="col-sm-10">
                    <input type="email" class="form-control" id="inputText2" placeholder="Nhóm hàng hóa" name="category">
                  </div>
                </div>
                <div class="form-group">
                  <label for="inputText2" class="col-sm-2 control-label">Nhà cung cấp</label>
                  <div class="col-sm-10">
                    <input type="email" class="form-control" id="inputText2" placeholder="Nhà cung cấp" name="vendor">
                  </div>
                </div>
                <div class="form-group">
                  <label for="inputText3" class="col-sm-2 control-label">Thuộc tính</label>
                  <div class="col-md-10">
                  	<textarea class="form-control" rows="3" placeholder="Thêm mô tả" name="attribute" id="inputText3"></textarea>
                  </div>
                </div>
              </div>
          </div>
        </div>
        <div class="col-md-6">
        	<div class="box box-info">
            <div class="box-header with-border">
              <h3 class="box-title">Điền thông tin</h3>
            </div>
              <div class="box-body">
                <div class="form-group">
                  <label for="inputText0" class="col-sm-2 control-label">Email</label>
                  <div class="col-sm-10">
                    <input type="email" class="form-control" id="inputText0" placeholder="Email">
                  </div>
                </div>
                 <div class="form-group">
                  <label for="inputText1" class="col-sm-2 control-label">Tên hàng</label>
                  <div class="col-sm-10">
                    <input type="email" class="form-control" id="inputText1" placeholder="Tên hàng hóa" name="productname">
                  </div>
                </div>
                <div class="form-group">
                  <label for="inputText2" class="col-sm-2 control-label">Nhóm hàng</label>
                  <div class="col-sm-10">
                    <input type="email" class="form-control" id="inputText2" placeholder="Nhóm hàng hóa" name="category">
                  </div>
                </div>
                <div class="form-group">
                  <label for="inputText2" class="col-sm-2 control-label">Nhà cung cấp</label>
                  <div class="col-sm-10">
                    <input type="email" class="form-control" id="inputText2" placeholder="Nhà cung cấp" name="vendor">
                  </div>
                </div>
                <div class="form-group">
                  <label for="inputText3" class="col-sm-2 control-label">Ghi chú</label>
                  <div class="col-md-10">
                  	<textarea class="form-control" rows="3" placeholder="Thêm mô tả" name="attribute" id="inputText3"></textarea>
                  </div>
                </div>
                <div class="box-footer">
                <button type="submit" class="btn btn-default">Hủy</button>
                <button type="submit" class="btn btn-info pull-right">Lưu</button>
              </div>
              </div>
          </div>
        </div>
       </form>
    </section>
</div>
<%@include file="frame/footer.jsp"%>