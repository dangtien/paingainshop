<%-- 
    Document   : employee
    Created on : Jun 11, 2017, 2:27:50 PM
    Author     : dangt
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="paingainshop.model.NhanVien" %>
<%@include file="frame/header.jsp" %>
<script language="javascript">
              function confirmAction() {
      		return confirm("Xác nhận xóa:")
	}
</script>
<%@include file="frame/sidebar.jsp" %>
<div class="content-wrapper">
    <section class="content-header">
         <h1>
            Nhân viên
            <small>Quản lí</small>
        </h1>
        <span style="color:red"><i>${msg}</i></span>
        <ol class="breadcrumb">
            <li><a href="home.jsp"><i class="fa fa-dashboard"></i>Home</a></li>
            <li class="active">Nhân viên</li>
        </ol>
    </section>
    <section class="content">
    	<span style="color:red"><i>${msg1}</i></span>
    	<span style="color:red"><i>${msg2}</i></span>
          <div class="box">
            <!-- /.box-header -->
            <div class="box-body">
              <table id="example1" class="table table-bordered table-striped table-hover">
                <thead>
                <tr>
                  <th>Username</th>
                  <th>Tên nhân viên</th>
                  <th>Địa chỉ</th>
                  <th>Số điện thoại</th>
                  <th><button class="btn btn-primary" id="btnaddemployee" data-toggle="modal" data-target="#modal-addemployee">Thêm mới</button></th>
                </tr>
                </thead>
                <tbody>
                <%
                	ArrayList<NhanVien> list =(ArrayList<NhanVien>)request.getAttribute("result");
                	if (list != null) 
                	{
                		for (NhanVien nv : list)
                		{
                			
                %>
                <tr>
                    <td><a href="#" title="click vào để xem chi tiết sản phẩm"><%=nv.getMaNV() %></a></td>
                    <td><%=nv.getHoTen() %></td>
                    <td><%=nv.getDiaChi() %></td>
                    <td><%=nv.getSoDT() %></td>
                    <td>
                      <a href="editEmployee.jsp?MaNV=<%=nv.getMaNV()%>"><span class="fa fa-edit">Sửa</span></a>
                      <span class="fa" style="margin: 0px 5px;"></span>
                      <a onclick="return confirmAction()" href="deletenhanvien?MaNV=<%=nv.getMaNV() %>"><span class="fa fa-remove">Xóa</span></a>
                    </td>
                  </tr>
                   <%
                		}
                	}
                   %>
                   
                   
                </tbody>
                <tfoot>
                <tr>
                  <th>Tên nhân viên</th>
                  <th>Username</th>
                  <th>Địa chỉ</th>
                  <th>Số điện thoại</th>
                  <th>Action</th>
                </tr>
                </tfoot>
              </table>
            </div>
    
            <!-- /.box-body -->
          </div>
        <div class="modal  fade" id="modal-addemployee">
          <div class="modal-dialog" >
            <div class="modal-content">
              <div class="modal-header with-border">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">Thêm nhân viên</h4>
              </div>
              
                <form class="form-horizontal" action="addemployee" method="post">
              <div class="modal-body">
        
                 <div class="form-group">
                  <label for="inputText1" class="col-sm-2 control-label">Tên nhân viên</label>
                  <div class="col-sm-10">
                    <input type="text" class="form-control" id="inputText1" placeholder="Tên nhân viên" name="Tennv">
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
                  <label for="inputText8" class="col-sm-2 control-label">Trạng thái làm việc</label>
                  
                </div>
                  <div class="form-group">
                  <label for="inputText8" class="col-sm-2 control-label">Ghi chú</label>
                  <div class="col-sm-10">
                    <input type="text" class="form-control" id="inputText8" placeholder="Ghi chú" name="Ghichu">
                  </div>
                </div>
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-default pull-left" data-dismiss="modal">Close</button>
                <button type="sublit" class="btn btn-primary">Lưu</button>
              </div>
            </form>
            </div>
            <!-- /.modal-content -->
          </div>
          <!-- /.modal-dialog -->
        </div>
    </section>
</div>
<%@include file="frame/footer.jsp" %>
