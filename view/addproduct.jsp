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
			<li class="active">Thêm hàng hóa</li>
		</ol>
	</section>
	    <section class="content">
    	<!-- đây là nội dung -->
    	<span style="color:red" id="msg"></span>
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
                  <label for="inputText3" class="col-sm-2 control-label">Mã nhà cung cấp <span style="color:red"><i>*</i></span></label>
                  <div class="col-sm-10">
                    
                    <select class="form-control" id="inputText3" name="vendor" >
						<option value="NC000001" selected>Sony</option>
						<option value="NC000002">Điện máy xanh</option>
						<option value="NC000003">Thế giới di động</option>
						<option value="NC000006">Nike</option>
						<option value="NC000007">Adidas</option>
						<option value="NC000008">Muscltech</option>
						<option value="NC000009">PowerTrain</option>
						<option value="SNC000004">SamSung </option>
						<option value="NC000005">Little Rock</option>
						
					</select>
                  </div>
                </div>
                <div class="form-group">
                  <label for="inputText4" class="col-sm-2 control-label">Thuộc tính</label>
                  <div class="col-md-10">
                  	<textarea class="form-control" rows="3" placeholder="Thêm mô tả" name="attribute1" id="inputText4"></textarea>
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
                  <label for="inputText5" class="col-sm-2 control-label">Số lượng <span style="color:red"><i>*</i></span></label>
                  <div class="col-sm-10">
                    <input type="number" class="form-control" id="inputText5" placeholder="Số lượng" name="sl">
                  </div>
                </div>
                 <div class="form-group">
                  <label for="inputText6" class="col-sm-2 control-label">Đơn vị tính <span style="color:red"><i>*</i></span></label>
                  <div class="col-sm-10">
                    
                    <select class="form-control" id="inputText6" name="dvt">
						<option value="cái" selected>Cái</option>
						<option value="chiếc">Chiếc</option>
						<option value="kg">Kg</option>
					</select>
                  </div>
                </div>
                <div class="form-group">
                  <label for="inputText7" class="col-sm-2 control-label">Giá bán <span style="color:red"><i>*</i></span></label>
                  <div class="col-sm-10">
                    <input type="text" class="form-control" id="inputText7" placeholder="Giá bán" name="outprice">
                  </div>
                </div>
                <div class="form-group">
                  <label for="inputText8" class="col-sm-2 control-label">Giá nhập <span style="color:red"><i>*</i></span></label>
                  <div class="col-sm-10">
                    <input type="text" class="form-control" id="inputText8" placeholder="Giá Nhập" name="inprice">
                  </div>
                </div>
                <div class="form-group">
                  <label for="inputText9" class="col-sm-2 control-label">Ghi chú</label>
                  <div class="col-md-10">
                  	<textarea class="form-control" rows="3" placeholder="Thêm mô tả" name="attribute4" id="inputText9"></textarea>
                  </div>
                </div>
                <div class="box-footer">
                <button type="reset" class="btn btn-default">Hủy</button>
                <button type="button" class="btn btn-info pull-right" onclick="addProduct()">Lưu</button>
              </div>
              </div>
          </div>
        </div>
       </form>
    </section>
</div>
<%@include file="frame/footer.jsp"%>