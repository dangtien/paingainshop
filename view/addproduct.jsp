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
    	<span style="color:red">${msg}</span>
    	<form class="form-horizontal" action="addnewproduct" method="post">
    	<div class="col-md-6">
    		<div class="box box-info">
            <div class="box-header with-border">
              <h3 class="box-title">Điền thông tin </h3>
            </div>
            <!-- /.box-header -->
            <!-- form start -->
              <div class="box-body">
                <div class="form-group">
                    <label for="inputText0" class="col-sm-2 control-label">Mã Hàng</label>
                  <div class="col-sm-10">
                      <input type="text" class="form-control" id="inputText0" placeholder="Tự động sinh mã"  name="primproduct" disabled="disabled">
                  </div>
                </div>
                 <div class="form-group">
                  <label for="inputText1" class="col-sm-2 control-label">Tên hàng <span style="color:red"><i>*</i></span></label>
                  <div class="col-sm-10">
                    <input type="text" class="form-control" id="inputText1" placeholder="Tên hàng hóa" name="productname">
                  </div>
                </div>
                <div class="form-group">
                  <label for="inputText2" class="col-sm-2 control-label">Nhóm hàng <span style="color:red"><i>*</i></span></label>
                  <div class="col-sm-10">
                    
                    <select class="form-control" id="inputText2"  name="category" >
						<option value="Áo ba lỗ">Áo ba lỗ</option>
						<option value="Áo thun">Áo thun</option>
						<option value="Quần short">Quần short</option>
						<option value="Găng tay">Găng tay</option>
						<option value="Cuốn sổ">Cuốn sổ</option>
						<option value="Túi xách">Túi xách</option>
						<option value="Phụ kiện khác">Phụ kiện khác</option>
					</select>
                  </div>
                </div>
                <div class="form-group">
                  <label for="inputText2" class="col-sm-2 control-label">Mã nhà cung cấp <span style="color:red"><i>*</i></span></label>
                  <div class="col-sm-10">
                    
                    <select class="form-control" id="inputText2" name="vendor" >
						<option value="Sony" selected>Sony</option>
						<option value="DMX">Điện máy xanh</option>
						<option value="TGDD">Thế giới di động</option>
						<option value="NKE">Nike</option>
						<option value="ADD">Adidas</option>
						<option value="MST">Muscltech</option>
						<option value="PWT">PowerTrain</option>
						<option value="SamSung">SamSung </option>
						<option value="LTR">Little Rock</option>
						
					</select>
                  </div>
                </div>
                <div class="form-group">
                  <label for="inputText3" class="col-sm-2 control-label">Thuộc tính</label>
                  <div class="col-md-10">
                  	<textarea class="form-control" rows="3" placeholder="Thêm mô tả" name="attribute1" id="inputText3"></textarea>
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
                  <label for="inputText0" class="col-sm-2 control-label">Số lượng <span style="color:red"><i>*</i></span></label>
                  <div class="col-sm-10">
                    <input type="number" class="form-control" id="inputText0" placeholder="Số lượng" name="sl">
                  </div>
                </div>
                 <div class="form-group">
                  <label for="inputText1" class="col-sm-2 control-label">Đơn vị tính <span style="color:red"><i>*</i></span></label>
                  <div class="col-sm-10">
                    
                    <select class="form-control" id="inputText1" name="dvt">
						<option value="cái" selected>Cái</option>
						<option value="chiếc">Chiếc</option>
						<option value="kg">Kg</option>
					</select>
                  </div>
                </div>
                <div class="form-group">
                  <label for="inputText2" class="col-sm-2 control-label">Giá bán <span style="color:red"><i>*</i></span></label>
                  <div class="col-sm-10">
                    <input type="text" class="form-control" id="inputText2" placeholder="Giá bán" name="outprice">
                  </div>
                </div>
                <div class="form-group">
                  <label for="inputText2" class="col-sm-2 control-label">Giá nhập <span style="color:red"><i>*</i></span></label>
                  <div class="col-sm-10">
                    <input type="text" class="form-control" id="inputText2" placeholder="Giá Nhập" name="inprice">
                  </div>
                </div>
                <div class="form-group">
                  <label for="inputText3" class="col-sm-2 control-label">Ghi chú</label>
                  <div class="col-md-10">
                  	<textarea class="form-control" rows="3" placeholder="Thêm mô tả" name="attribute2" id="inputText3"></textarea>
                  </div>
                </div>
                <div class="box-footer">
                <button type="reset" class="btn btn-default">Hủy</button>
                <button type="submit" class="btn btn-info pull-right">Lưu</button>
              </div>
              </div>
          </div>
        </div>
       </form>
    </section>
</div>
<%@include file="frame/footer.jsp"%>