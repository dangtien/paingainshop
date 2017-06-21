<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="frame/header.jsp"%>
<%@include file="frame/sidebar.jsp"%>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>
            Quản lí hàng hóa <small>Lập hóa đơn</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i>Home</a></li>
            <li class="active">Quản lí hàng hóa</li>
        </ol>
    </section>
    <section class="content">
        <div class="row">
            <div class="col-md-9">
                <div class="box box-primary">
                    <div class="box-header with-border">
                        <input type="text" name="txtsearchproc" class="form-control" placeholder="Tìm kiếm sản phẩm" id="txtsearch1" onkeyup ="showHint(this.value);">
                    </div>
                    <div class="box-body suggest" id="sugges1">
                        <ul class="list-suggest" id="result1"></ul>
                    </div>
                    <div class="box-body table-responsive no-padding">
                        <table class="table table-hover">
                            <tr>
                                <th>STT</th>
                                <th>Mã hàng</th>
                                <th>Tên hàng</th>
                                <th width="125px">Đơn giá</th>
                                <th width="88px">Số lượng</th>
                                <th width="75px">Giảm giá</th>
                                <th>Thành tiền</th>
                                <th>Action</th>
                            </tr>
                            <tbody id="hoadondetail" onload="editBill();"></tbody>
                        </table>
                    </div>               
                </div>

            </div>
            <div class="col-md-3">
                <div class="box" style="border-top: none;">
                    <div class="nav-tabs-custom">
                        <ul class="nav nav-tabs">
                            <li class="active"><a href="#activity" data-toggle="tab">Khách hàng</a></li>
                            <li><a href="#timeline" data-toggle="tab">Đơn hàng</a></li>
                        </ul>
                        <div class="tab-content">
                            <div class="active tab-pane" id="activity">
                                <!-- The khach hang -->
                                <div class="input-group input-group-sm">
                                    <input type="text" name="txtsearchcustomer" class="form-control" placeholder="Tìm kiếm hoặc thêm mới" id="txtsearch2" onkeyup="showHintkh(this.value);">
                                    <span class="input-group-btn">
                                        <button  type="button" class="btn btn-info btn-flat" id="btnaddcustomer" data-toggle="modal" data-target="#modal-addcustomer">Thêm</button>
                                    </span>
                                </div>
                                <div class="box-body suggest" id="suggest2">
                                    <ul class="list-suggest" id="result2"></ul>
                                </div> 
                                <hr/>
                                <div class="box-body" id="infocustomer">
                                    <strong>Họ tên</strong>
                                    <p class="text-muted">

                                    </p>
                                    <strong>Địa chỉ</strong>
                                    <p class="text-muted">

                                    </p>
                                    <strong>Email</strong>
                                    <p class="text-muted">

                                    </p>
                                </div>
                            </div>
                            <!-- /.tab-pane -->
                            <div class="tab-pane" id="timeline">
                                <!-- Don hang -->
                                <div class="box-body">
                                    <strong>Mã hóa đơn:</strong>
                                    <p class="text-muted"><%= request.getAttribute("MaHD")%></p>
                                    <strong>Nhân viên lập: </strong>
                                    <p class="text-muted"><%=request.getAttribute("Nhanvien")%></p>
                                    <strong>Ngày lập:</strong>
                                    <p class="text-muted"><%=request.getAttribute("Ngay")%></p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div  class="box box-primary">
                        <div class="box-header with-border">
                            <h3 class="box-title">Thanh toán</h3>
                        </div>
                        <div class="box-body">
                            <strong>Giảm giá: </strong>
                            <input type="number" name="inputsale" class="form-control" value="0" id="txtinputsale" onchange="updateSale()">
                            <strong>Tổng giá trị</strong>
                            <p class="text-muted" id="paytotal">0</p>
                            <button class="btn btn-info" type="button" onclick="saveBill();">Lưu Hóa Đơn</button>
                        </div>
                    </div>
                </div>
            </div>      
        </div>
        <div class="modal  fade" id="modal-addcustomer">
            <div class="modal-dialog" >
                <div class="modal-content">
                    <div class="modal-header with-border">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title">Thêm khách hàng</h4>
                        <span style="color:red"><i id="msg"></i></span>
                    </div>
                    <form class="form-horizontal">
                        <div class="modal-body">

                            <div class="form-group">
                                <label for="inputText1" class="col-sm-2 control-label">Tên khách hàng</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="inputText1" placeholder="Tên khách hàng" name="Tenkh">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputText2" class="col-sm-2 control-label">Địa chỉ</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="inputText2" placeholder="Địa chỉ" name="Diachi">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputText3" class="col-sm-2 control-label">Số điện thoại</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="inputText3" placeholder="Số điện thoại" name="Sodt">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputText4" class="col-sm-2 control-label">Email</label>
                                <div class="col-sm-10">
                                    <input type="email" class="form-control" id="inputText4" placeholder="Email" name="Email">
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default pull-left" data-dismiss="modal">Close</button>
                            <button type="button" class="btn btn-primary" onclick="addCustomer();">Lưu</button>
                        </div>
                    </form>
                </div>
                <!-- /.modal-content -->
            </div>
            <!-- /.modal-dialog -->
        </div>
    </section>
</div>
<%@include file="frame/footer.jsp"%>