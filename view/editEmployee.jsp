<%-- 
    Document   : editEmployee
    Created on : Jun 11, 2017, 3:19:56 PM
    Author     : dangt
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@page import="paingainshop.model.DAO.*" %>
<%@page import="paingainshop.model.NhanVien"  %>
<title>Chỉnh Sửa Thông Tin Nhân Viên</title>
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
            <li><a href="danhsachnhanvien">Nhân viên</a></li>
            <li><a href="#">Quản lý thông tin</a></li>
            <li class="active">Chỉnh sửa</li>
        </ol>
    </div>
    <div class="content">
        <div class="box">
            <div class="box-body">
             <%
            	String manv = (String) request.getParameter("MaNV");
            	NhanVien nv = new NhanVienDAO().getUserByID(manv);
            %>
            <span style="color:red">${msg}</span>
                <form class="form-horizontal" action="editemployee" method="post">
                    <div class="col-md-6">
                        <div class="form-group">
                            <label for="inputText1" class="col-sm-2 control-label">Tên nhân viên</label>
                            <div class="col-sm-10">
                                <input type="hidden" name="MaNV" value="<%=manv %>" size="0" />
                                <input type="text" class="form-control" id="inputText1"  name="Tennv" value="<%=nv.getHoTen()%>" >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputText2" class="col-sm-2 control-label">Username</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="inputText2"  name="Username" value="<%=nv.getUserName() %>">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputText3" class="col-sm-2 control-label">Email</label>
                            <div class="col-sm-10">
                                <input type="email" class="form-control" id="inputText3"  name="Email" value="<%=nv.getEmail() %>">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputText4" class="col-sm-2 control-label">Password</label>
                            <div class="col-sm-10">
                                <input type="password" class="form-control" id="inputText4"  name="Password" value="<%=nv.getPass() %>">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputText4" class="col-sm-2 control-label">Trạng thái</label>
                            <div class="col-sm-10">
                                <select class="form-control" id="inputText4" name="TrangThai" >
                                <option value="<%=nv.getTrangThai() %>" selected><%=nv.getTrangThai() %></option>
								<option value="" >Còn làm việc</option>
								<option value="Nghỉ">Nghỉ</option>
							</select>
                            </div>
                        </div>
	                        
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <label for="inputText5" class="col-sm-2 control-label">Địa chỉ</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="inputText5"  name="Diachi" value="<%=nv.getDiaChi() %>">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputText6" class="col-sm-2 control-label">Số điện thoại</label>
                            <div class="col-sm-10">
                                 <input type="text" class="form-control" id="inputText6"  name="Sodt" value="<%=nv.getSoDT() %>">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputText7" class="col-sm-2 control-label">Lương</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="inputText7" " name="Luong" value="<%=nv.getLuong() %>">
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
                        <button type="reset" class="btn btn-default">Hủy</button>
                        <button type="submit" class="btn btn-info pull-right">Lưu</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<%@include file="frame/footer.jsp" %>