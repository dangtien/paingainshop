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
                <input type="text" name="txtsearchproc" class="form-control" placeholder="Tìm kiếm sản phẩm">
              </div>
              <div class="box-body suggest">
                    <ul class="list-suggest">
                        <li class="suggest-col">
                          <span class="fa fa-tags fa-custom"></span>
                          <span class="fa-custom text-muted">HH000001</span>
                          <span class="fa-custom text-muted">Hoa gi do di</span>
                          <span class="fa-custom text-muted">Đơn giá: <b>100.000.000</b> VND</span>
                          <span class="text-muted">Số lương hiện có: <b>10</b></span>
                        </li>
                        <li class="suggest-col">
                          <span class="fa fa-tags fa-custom"></span>
                          <span class="fa-custom text-muted">HH000001</span>
                          <span class="text-muted fa-custom">Hoa gi do di</span>
                          <span class="fa-custom text-muted">Đơn giá: <b>100.000.000</b> VND</span>
                          <span class="text-muted">Số lương hiện có: <b>10</b></span>
                        </li>
                    </ul>
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
                <tr>
                  <th>1</th>
                  <th>HH000001</th>
                  <th>Khánh chi vũ</th>
                  <th><input type="text" class="form-control dongia"></th>
                  <th><input type="number" class="form-control soluong"></th>
                  <th><input type="number" class="form-control giamgia"></th>
                  <th>1000</th>
                  <th><a href="#"><span  class=" fa fa-times-circle delproc"></span></a></th>
                </tr>
                <tr>
                  <th>1</th>
                  <th>HH000001</th>
                  <th>Khánh chi vũ</th>
                  <th><input type="text" class="form-control dongia"></th>
                  <th><input type="number" class="form-control soluong"></th>
                  <th><input type="number" class="form-control giamgia"></th>
                  <th>1000</th>
                  <th><a href="#"><span  class=" fa fa-times-circle delproc"></span></a></th>
                </tr>
                <tr>
                  <th>1</th>
                  <th>HH000001</th>
                  <th>Khánh chi vũ</th>
                  <th><input type="text" class="form-control dongia"></th>
                  <th><input type="number" class="form-control soluong"></th>
                  <th><input type="number" class="form-control giamgia"></th>
                  <th>1000</th>
                  <th><a href="#"><span  class=" fa fa-times-circle delproc"></span></a></th>
                </tr>
                <tr>
                  <th>1</th>
                  <th>HH000001</th>
                  <th>Khánh chi vũ</th>
                  <th><input type="text" class="form-control dongia"></th>
                  <th><input type="number" class="form-control soluong"></th>
                  <th><input type="number" class="form-control giamgia"></th>
                  <th>1000</th>
                  <th><a href="#"><span  class=" fa fa-times-circle delproc"></span></a></th>
                </tr>
                <tr>
                  <th>1</th>
                  <th>HH000001</th>
                  <th>Khánh chi vũ</th>
                  <th><input type="text" class="form-control dongia"></th>
                  <th><input type="number" class="form-control soluong"></th>
                  <th><input type="number" class="form-control giamgia"></th>
                  <th>1000</th>
                  <th><a href="#"><span  class=" fa fa-times-circle delproc"></span></a></th>
                </tr>
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
                   <input type="text" name="txtsearchcustomer" class="form-control" placeholder="Tìm kiếm hoặc thêm mới">
                   <span class="input-group-btn">
                     <button  type="button" class="btn btn-info btn-flat" id="btnaddcustomer" data-toggle="modal" data-target="#modal-addcustomer">Thêm</button>
                   </span>
                 </div>
                 <div class="box-body suggest">
                    <ul class="list-suggest">
                        <li class="suggest-col">
                          <span class="fa  fa-user fa-custom"></span>
                          <span class="text-muted">Đặng Tiến Chiêu</span>
                        </li>
                        <li class="suggest-col">
                          <span class="fa  fa-user fa-custom"></span>
                          <span class="text-muted">Đặng Tiến Chiêu</span>
                        </li>
                    </ul>
                 </div> 
                 <hr/>
                 <div class="box-body">
                   <strong>Họ tên</strong>
                   <p class="text-muted">
                     Đặng Tiến Chiêu  
                   </p>
                   <strong>Địa chỉ</strong>
                   <p class="text-muted">
                     Hoàng Mai-Hà Nội
                   </p>
                   <strong>Email</strong>
                   <p class="text-muted">
                     Dangtienchieu@gmail.com
                   </p>
                  </div>
              </div>
              <!-- /.tab-pane -->
              <div class="tab-pane" id="timeline">
                <!-- Don hang -->
                <div class="box-body">
                   <strong>Mã hóa đơn:</strong>
                   <p class="text-muted">HD000010</p>
                   <strong>Nhân viên lập: </strong>
                   <p class="text-muted">Đặng Tiến Chiêu</p>
                   <strong>Ngày lập:</strong>
                   <p class="text-muted">20/2/2017</p>
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
              <input type="number" name="inputsale" class="form-control">
              <strong>Tổng giá trị</strong>
              <p class="text-muted">10000.0000.0000</p>
              <button class="btn btn-info" type="button">Lưu Hóa Đơn</button>
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
                <h4 class="modal-title">Default Modal</h4>
              </div>
              <div class="modal-body">
                <p>One fine body&hellip;</p>
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-default pull-left" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary">Save changes</button>
              </div>
            </div>
            <!-- /.modal-content -->
          </div>
          <!-- /.modal-dialog -->
        </div>       
  </section>
</div>
<%@include file="frame/footer.jsp"%>