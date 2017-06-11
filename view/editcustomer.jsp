<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="frame/header.jsp" %>
<%@include file="frame/sidebar.jsp" %>
<div class="content-wrapper">
    <div class="content-header">
        <h1>
            Khách hàng
            <small>Chỉnh sửa</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="home.jsp"><i class="fa fa-dashboard"></i>Home</a></li>
            <li><a href="#">Khách hàng</a></li>
            <li><a href="customer.jsp">Quản lý thông tin</a></li>
            <li class="active">Chỉnh sửa</li>
        </ol>
    </div>
    <div class="content">
        <div class="box">
            <div class="box-body">
                <form class="form-horizontal">
                    <div class="col-md-6">
		              <div class="form-group">
		                <label>Tên khách hàng</label>
		                <input type="text" class="form-control" id="inputText1" style="width:95%" placeholder="Tên khách hàng">
		              </div>
		              <div class="form-group">
		                <label>Số điện thoại</label>
		                <input type="text" class="form-control" id="inputText3" style="width:95%" placeholder="Số điện thoại khách hàng">
		              </div>
              <!-- /.form-group -->
              <!-- /.form-group -->
            		</div>
                    <div class="col-md-6">
            <!-- /.form-group -->
		              <div class="form-group">
		                <label>Địa chỉ</label>
		                <input type="text" class="form-control" id="inputText2" style="width:95%" placeholder="Địa chỉ khách hàng">
		              </div>
		              <div class="form-group">
		                <label>Địa chỉ email</label>
		                <input type="email" class="form-control" id="inputText4" style="width:95%" placeholder="Email khách hàng">
		              </div>
		              <!-- /.form-group -->
		            </div>
                    <div class="box-footer">
                        <button type="submit" class="btn btn-default">Hủy</button>
                        <button type="submit" class="btn btn-info pull-right">Lưu</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<%@include file="frame/footer.jsp" %>
