<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="frame/header.jsp"%>
<%@include file="frame/sidebar.jsp"%>
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header">
		<h1>Tổng quan</h1>
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
                    <input type="text" class="form-control" id="inputText0" placeholder="HHxxxxxx" disabled name="primproduct" name="txtMahang">
                  </div>
                </div>
                 <div class="form-group">
                  <label for="inputText1" class="col-sm-2 control-label">Tên hàng</label>
                  <div class="col-sm-10">
                    <input type="text" class="form-control" id="inputText1" placeholder="Tên hàng hóa" name="productname" name="txtTenhang">
                  </div>
                </div>
                <div class="form-group">
                  <label for="inputText2" class="col-sm-2 control-label">Nhóm hàng</label>
                  <div class="col-sm-10">
                    <input type="text" class="form-control" id="inputText2" placeholder="Nhóm hàng hóa" name="category" name="txtNhomhang">
                  </div>
                </div>
                <div class="form-group">
                  <label for="inputText3" class="col-sm-2 control-label">Nhà cung cấp</label>
                  <div class="col-sm-10">
                    <input type="text" class="form-control" id="inputText3" placeholder="Nhà cung cấp" name="vendor" name="txtNhacc">
                  </div>
                </div>
                <div class="form-group">
                  <label for="inputText4" class="col-sm-2 control-label">Thuộc tính</label>
                  <div class="col-md-10">
                  	<textarea class="form-control" rows="3" placeholder="Thêm mô tả" name="attribute" id="inputText4" name="txtThuoctinh"></textarea>
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
                  <label for="inputText5" class="col-sm-2 control-label">Giá nhập</label>
                  <div class="col-sm-10">
                      <input type="text" class="form-control" id="inputText5" placeholder="Giá nhập vào" name="txtGianhap">
                  </div>
                </div>
                 <div class="form-group">
                  <label for="inputText6" class="col-sm-2 control-label">Giá bán</label>
                  <div class="col-sm-10">
                    <input type="text" class="form-control" id="inputText6" placeholder="Giá bán ra" name="txtGiaban">
                  </div>
                </div>
                <div class="form-group">
                  <label for="inputText7" class="col-sm-2 control-label">Số lương</label>
                  <div class="col-sm-10">
                    <input type="number" class="form-control" id="inputText7" placeholder="SỐ lượng" name="txtSoluong">
                  </div>
                </div>
                <div class="form-group">
                  <label for="inputText8" class="col-sm-2 control-label">Đơn vị</label>
                  <div class="col-sm-10">
                    <input type="text" class="form-control" id="inputText8" placeholder="Đơn vị" name="txtDonvi">
                  </div>
                </div>
                <div class="form-group">
                  <label for="inputText9" class="col-sm-2 control-label">Ghi chú</label>
                  <div class="col-md-10">
                  	<textarea class="form-control" rows="3" placeholder="Thêm ghi chú" name="attribute" id="inputText9" name="txtGhichu"></textarea>
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