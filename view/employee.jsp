<%-- 
    Document   : employee
    Created on : Jun 11, 2017, 2:27:50 PM
    Author     : dangt
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="frame/header.jsp" %>
<%@include file="frame/sidebar.jsp" %>
<div class="content-wrapper">
    <section class="content-header">
         <h1>
            Nhân viên
            <small>Quản lí</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i>Home</a></li>
            <li class="active">Nhân viên</li>
        </ol>
    </section>
    <section class="content">
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
                  <tr>
                    <td><a href="#" title="click vào để xem chi tiết sản phẩm">HH000001</a></td>
                    <td>Khánh Chi Vũ</td>
                    <td>1</td>
                    <td>20.000</td>
                    <td>
                      <a href="#"><span class="fa fa-edit">Sửa</span></a>
                      <span class="fa" style="margin: 0px 5px;"></span>
                      <a href="#"><span class="fa fa-remove">Xóa</span></a>
                    </td>
                  </tr>
                   <tr>
                    <td><a href="#" title="click vào để xem chi tiết sản phẩm">HH000001</a></td>
                    <td>Khánh Chi Vũ</td>
                    <td>1</td>
                    <td>20.000</td>
                    <td>
                      <a href="#"><span class="fa fa-edit">Sửa</span></a>
                      <span class="fa" style="margin: 0px 5px;"></span>
                      <a href="#"><span class="fa fa-remove">Xóa</span></a>
                    </td>
                  </tr>
                   <tr>
                    <td><a href="#" title="click vào để xem chi tiết sản phẩm">HH000001</a></td>
                    <td>Khánh Chi Vũ</td>
                    <td>1</td>
                    <td>20.000</td>
                    <td>
                      <a href="#"><span class="fa fa-edit">Sửa</span></a>
                      <span class="fa" style="margin: 0px 5px;"></span>
                      <a href="#"><span class="fa fa-remove">Xóa</span></a>
                    </td>
                  </tr>
                   <tr>
                    <td><a href="#" title="click vào để xem chi tiết sản phẩm">HH000001</a></td>
                    <td>Khánh Chi Vũ</td>
                    <td>1</td>
                    <td>20.000</td>
                    <td>
                      <a href="#"><span class="fa fa-edit">Sửa</span></a>
                      <span class="fa" style="margin: 0px 5px;"></span>
                      <a href="#"><span class="fa fa-remove">Xóa</span></a>
                    </td>
                  </tr>
                   <tr>
                    <td><a href="#" title="click vào để xem chi tiết sản phẩm">HH000001</a></td>
                    <td>Khánh Chi Vũ</td>
                    <td>1</td>
                    <td>20.000</td>
                    <td>
                      <a href="#"><span class="fa fa-edit">Sửa</span></a>
                      <span class="fa" style="margin: 0px 5px;"></span>
                      <a href="#"><span class="fa fa-remove">Xóa</span></a>
                    </td>
                  </tr>
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
                <h4 class="modal-title">Thêm khách hàng</h4>
              </div>
                <form class="form-horizontal">
              <div class="modal-body">
        
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
                  <div class="col-sm-10">
                    <input type="text" class="form-control" id="inputText8" placeholder="Ghi chú" name="Ghichu">
                  </div>
                </div>
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-default pull-left" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary">Lưu</button>
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
