<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page import="paingainshop.model.DAO.* "%>
<%@ page import="paingainshop.model.*"%>
<%@ page import="java.util.ArrayList" %>
<%@include file="frame/header.jsp" %>
<%@include file="frame/sidebar.jsp" %>
<div class="content-wrapper">
    <div class="content-header">
        <h1>
            Nhà cung cấp
            <small>Chỉnh sửa</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="home.jsp"><i class="fa fa-dashboard"></i>Home</a></li>
            <li><a href="#">Nhà cung cấp</a></li>
            <li><a href="nhacc.jsp">Quản lý thông tin</a></li>
            <li class="active">Chỉnh sửa</li>
        </ol>
    </div>
    <div class="content">
        <div class="box">
            <div class="box-body">
            <%
            	String MaNCC = request.getParameter("MaNCC");
            	NhaCungCap ncc = new NhaCungCapDAO().getByID(MaNCC);
            %>
            
            	<span style="color:red">${msg1}</span>
                <form class="form-horizontal" action="editnhacc" method="post">
                    <div class="col-md-6">
                        <div class="form-group">
                            <label for="inputText1" class="col-sm-2 control-label">Tên nhà cung cấp</label>
                            <div class="col-sm-10">
                            	<input type="hidden" name="MaNCC" value="<%=MaNCC %>" size="0" />
                                <input type="text" class="form-control" id="inputText1" value="<%=ncc.getTenNCC() %>" name="Tenncc">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputText2" class="col-sm-2 control-label">Mã số thuế</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="inputText2" value="<%=ncc.getMaSoThue() %>" name="Masothue">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputText3" class="col-sm-2 control-label">Email</label>
                            <div class="col-sm-10">
                                <input type="email" class="form-control" id="inputText3" value="<%=ncc.getEmail() %>" name="Email">
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <label for="inputText5" class="col-sm-2 control-label">Địa chỉ</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="inputText5" value="<%=ncc.getDiaChi() %>" name="Diachi">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputText6" class="col-sm-2 control-label">Số điện thoại</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="inputText6" value="<%=ncc.getSoDT() %>" name="Sodt">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputText8" class="col-sm-2 control-label">Ghi chú</label>
                            <div class="col-md-10">
                                <textarea class="form-control" rows="3" value="<%=ncc.getGhiChu() %>" name="attribute" id="inputText8"></textarea>
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
