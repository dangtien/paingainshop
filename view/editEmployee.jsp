<%-- 
    Document   : editEmployee
    Created on : Jun 11, 2017, 3:19:56 PM
    Author     : dangt
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="frame/header.jsp" %>
<%@include file="frame/sidebar.jsp" %>
<div class="content-wrapper">
    <div class="content-header">
        <h1>
            Nhân viên
            <small>Chỉnh sửa</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="home.jsp"><i class="fa fa-dashboard"></i>Home</a></li>
            <li><a href="#">Nhân viên</a></li>
            <li><a href="employee.jsp">Quản lý thông tin</a></li>
            <li class="active">Chỉnh sửa</li>
        </ol>
    </div>
    <div class="content">
        <div class="box">
            <div class="box-body">
                <form class="form-horizontal">
                    <div class="col-md-6">
                        <div class="form-group">
                            <label for="inputText1" class="col-sm-2 control-label">Tên nhân viên</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="inputText1" placeholder="Tên khách hàng" name="Tennv">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputText2" class="col-sm-2 control-label">Username</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="inputText2" placeholder="username" name="Username">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputText3" class="col-sm-2 control-label">Email</label>
                            <div class="col-sm-10">
                                <input type="email" class="form-control" id="inputText3" placeholder="Email" name="Email">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputText4" class="col-sm-2 control-label">Password</label>
                            <div class="col-sm-10">
                                <input type="password" class="form-control" id="inputText4" placeholder="Mật khẩu" name="Password">
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <label for="inputText5" class="col-sm-2 control-label">Địa chỉ</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="inputText5" placeholder="Địa chỉ" name="Diachi">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputText6" class="col-sm-2 control-label">Số điện thoại</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="inputText6" placeholder="Số điện thoại" name="Sodt">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputText7" class="col-sm-2 control-label">Lương</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="inputText7" placeholder="Lương" name="Luong">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputText8" class="col-sm-2 control-label">Ghi chú</label>
                            <div class="col-md-10">
                                <textarea class="form-control" rows="3" placeholder="Ghi chú" name="attribute" id="inputText8"></textarea>
                            </div>
                        </div>
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
