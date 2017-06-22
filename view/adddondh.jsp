<%-- 
    Document   : adddondh
    Created on : Jun 21, 2017, 11:00:30 PM
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
            Quản lí hàng hóa <small>Lập đơn đặt hàng</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i>Home</a></li>
            <li><a href="dsdondathang.jsp">Danh sách đơn đặt hàng</a></li>
            <li class="active">Lập đơn đặt hàng</li>
        </ol>
    </section>
    <section class="content">
        <div class="row">
            <div class="col-md-8" style="width: 70%">
                <div class="box box-primary">
                    <div class="box-header with-border">
                        <div class="input-group input-group-sm">
                            <input type="text" name="txtsearchproc" class="form-control" placeholder="Tìm kiếm sản phẩm" id="txtsearch1" onkeyup ="dhsearchProduct(this.value);">
                            <span class="input-group-btn">
                                <button  type="button" class="btn btn-info btn-flat" id="btnaddpro" data-toggle="modal" data-target="#modal-addpro">Thêm</button>
                            </span>
                        </div>
                    </div>
                    <div class="box-body suggest" id="sugges1">
                        <ul class="list-suggest" id="result1"></ul>
                    </div>
                    <div class="box-body table-responsive no-padding">
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th>STT</th>
                                    <th>Mã hàng</th>
                                    <th>Tên hàng</th>
                                    <th width="125px">Đơn giá nhập</th>
                                    <th width="88px">Số lượng</th>
                                    <th>Thành tiền</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody id="hoadondetail" style="text-align: center;"></tbody>
                        </table>
                    </div>               
                </div>

            </div>
            <div class="col-md-4" style="width:30%; float:right">
                <div class="box" style="border-top: none;">
                    <div class="nav-tabs-custom">
                        <ul class="nav nav-tabs">
                            <li class="active"><a href="#activity" data-toggle="tab">Đơn hàng</a></li>
                        </ul>
                        <div class="tab-content">
                            <div class="active tab-pane" id="activity">
                                <!-- Don hang -->
                                <div class="box-body">
                                    <strong>Mã đơn đặt hàng:</strong>
                                    <p class="text-muted"><%= request.getAttribute("madh")%></p>
                                    <strong>Nhân viên lập: </strong>
                                    <p class="text-muted"><%=request.getAttribute("nhanvien")%></p>
                                    <strong>Ngày lập:</strong>
                                    <p class="text-muted"><%=request.getAttribute("ngay")%></p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div  class="box box-primary">
                        <div class="box-header with-border">
                            <h3 class="box-title">Thanh toán</h3>
                        </div>
                        <div class="box-body">
                            <strong>Tổng giá trị</strong>
                            <p class="text-muted" id="paytotal">0</p>
                            <button class="btn btn-info" type="button" onclick="saveDonDatHang();">Lưu Đơn đặt hàng</button>
                        </div>
                    </div>
                </div>
            </div>      
        </div>
        <div class="modal  fade" id="modal-addpro">
            <div class="modal-dialog" >
                <div class="modal-content">
                    <div class="modal-header with-border">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title">Thêm hàng hóa</h4>
                    </div>
                    <form class="form-horizontal">
                        <div class="modal-body">

                            <div class="box box-info">
                                <span style="color:red" id="msg"></span>
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


                                    <div class="form-group">
                                        <label for="inputText5" class="col-sm-2 control-label">Số lượng </label>
                                        <div class="col-sm-10">
                                            <input type="number" class="form-control" id="inputText5" placeholder="Số lượng" name="sl" disabled="disabled" value="0">
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
                                        <label for="inputText7" class="col-sm-2 control-label">Giá bán</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" id="inputText7" placeholder="Giá bán" name="outprice" disabled="disabled" value="0">
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
                                </div>
                            </div>

                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default pull-left" data-dismiss="modal">Close</button>
                            <button type="button" class="btn btn-primary" onclick="addProduct()">Lưu</button>
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