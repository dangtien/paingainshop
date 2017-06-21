<%-- 
    Document   : dsdondathang
    Created on : Jun 21, 2017, 9:54:24 PM
    Author     : Asus
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="frame/header.jsp"%>
<%@include file="frame/sidebar.jsp"%>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>
           Quản lí hàng hóa
            <small>Danh sách đơn đặt hàng</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i>Home</a></li>
            <li class="active">Nhập hàng</li>
        </ol>
    </section>
    <section class="content">
        <!-- Small boxes (Stat box) -->
        <div class="row">
            <div class="col-md-10">
                <div class="box box-primary">
 
            <!-- /.box-header -->
            <div class="box-body">
                <table id="example1" class="table table-bordered table-striped table-hover">
                    <thead>
                        <tr>
                            <th>Mã Đơn đặt hàng</th>
                            <th>Nhân viên lập</th>
                            <th>Ngày lập</th>
                            <th>Trạng thái</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>DH000001</td>
                            <td>NV000001</td>
                            <td>2017/04/01</td>
                            <td><a href="chitietddh.jsp">Chưa cập nhật</a></td>
                        </tr>
                         <tr>
                            <td>DH000002</td>
                            <td>NV000002</td>
                            <td>2017/03/25</td>
                            <td><a href="chitietddh.jsp">Đã cập nhật</a></td>
                        </tr>
                         <tr>
                            <td>DH000003</td>
                            <td>NV000003</td>
                            <td>2017/03/02</td>
                            <td><a href="chitietddh.jsp">Đã cập nhật</a></td>
                        </tr>
                         <tr>
                            <td>DH000004</td>
                            <td>NV000001</td>
                            <td>2017/03/31</td>
                            <td><a href="chitietddh.jsp">Chưa cập nhật</a></td>
                        </tr>
                    </tbody>
                    <tfoot>
                        <tr>
                            <th>Mã Đơn đặt hàng</th>
                            <th>Nhân viên lập</th>
                            <th>Ngày lập</th>
                            <th>Trạng thái</th>
                        </tr>
                    </tfoot>
                </table>
            </div>
            <!-- /.box-body -->
        </div>
            </div>
            <div class="col-md-2">
                    <button type="button" class="btn btn-primary" > Thêm đơn đặt hàng</button>
               
            </div>
        </div>
    </section>
</div>
<%@include file="frame/footer.jsp"%>
