<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page import="paingainshop.model.KhachHang" %>
<%@ page import="paingainshop.model.*" %>
<%@ page import="paingainshop.model.DAO.*" %>
<%@ page import="java.util.ArrayList" %>
<%@include file="frame/header.jsp"%>
<%@include file="frame/sidebar.jsp"%>
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header">
		<h1>
			Quản lý khách hàng <small>Danh sách</small>
		</h1>
		<ol class="breadcrumb">
			<li><a href="home.jsp"><i class="fa fa-dashboard"></i>Home</a></li>
			<li><a href="#">Quản lý khách hàng</a></li>
			<li class="active">Quản lý thông tin</li>
		</ol>
	</section>
	<section class="content">
	<span style="color:red"><i id="msg"></i></span>
	<form action="" method="post">
		<div class="box box-default collapsed-box" >
            <div class="box-header with-border">
          <h3 class="box-title">Thêm khách hàng</h3>

          <div class="box-tools pull-right">
            <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-plus"></i></button>
          </div>
        </div>
              <div class="box-body" style="display: none;">
          <div class="row">
            <div class="col-md-6">
              <div class="form-group">
                <label>Mã khách hàng</label>
                    <input type="text" class="form-control" id="inputText0" style="width:100%" placeholder="Sinh mã tự động" disabled name="MaKH">
              </div>
              <div class="form-group">
                <label>Tên khách hàng</label>
                <input type="text" class="form-control" id="inputText1" style="width:100%" placeholder="Tên khách hàng" name="TenKH" required>
              </div>
              <div class="form-group">
                <label>Số điện thoại</label>
                <input type="text" class="form-control" id="inputText3" style="width:100%"  placeholder="Số điện thoại khách hàng" name="SDT" required>
              </div>
              <!-- /.form-group -->
              <!-- /.form-group -->
            </div>
            <!-- /.col -->
            <div class="col-md-6">
            <!-- /.form-group -->
              <div class="form-group">
                <label>Địa chỉ</label>
                <input type="text" class="form-control" id="inputText2" style="width:100%" placeholder="Địa chỉ khách hàng" name="Address" required>
              </div>
              <div class="form-group">
                <label>Địa chỉ email</label>
                <input type="email" class="form-control" id="inputText4" style="width:100%" placeholder="Email khách hàng" name="Email" >
              </div>
              <!-- /.form-group -->
            </div>
            <!-- /.col -->
          </div>
          <!-- /.row -->
        </div>
        <div class="box-footer" style="display: none;">
          <div class="input-group-btn">
                  <button id="add-new-event" type="button" style="float: right; margin-right: 20px; " onclick="addCustomer();" class="btn btn-primary btn-flat">Thêm</button>
                </div>
        </div>
        </div>
        <span style="color:red"><i>${msg1}</i></span>
        </form>
		<div class="row">
	        <div class="col-xs-12">
	          <div class="box">
	            <div class="box-header">
	              <h3 class="box-title">Danh sách khách hàng</h3>
	            </div>
	            <!-- /.box-header -->
	            <div class="box-body">
	              <table id="example1" class="table table-striped table-bordered  table-hover">
	                <thead>
	                <tr>
	                  <th>Mã khách hàng</th>
	                  <th>Tên khách hàng</th>
	                  <th>Địa chỉ</th>
	                  <th>Tổng số hóa đơn</th>
	                  <th>Tổng tiền</th>
	                  <th></th>
	                </tr>
	                </thead>
	                <tbody>
	                <% ArrayList<KhachHang> list = (ArrayList<KhachHang>)request.getAttribute("result");%>
	                
	                <%
	                	if(list!=null){
	                		for(KhachHang kh : list){
	                			
	                	CoutSoHoaDonSoTien cs =new CoutSoHoaDonSoTienDAO().getSoHDByID(kh.getMaKH());
	                	CoutSoTienHoaDon ct = new CoutSoTienHoaDonDAO().getSoTienByID(kh.getMaKH());
	                %>
			                <tr>
			                  <td><%=kh.getMaKH()%></td>
			                  <td><%=kh.getTenHK() %></td>
			                  <td><%=kh.getDiaChi() %></td>
			                  <td><%=cs.getSoHoaDon() %></td>
			                  <td><%=ct.getTongtien() %></td>
			                  <td>  <a href="editcustomer.jsp?MaKH=<%=kh.getMaKH()%>"><span class="fa fa-edit">Sửa</span></a>
		                      <span class="fa" style="margin: 0px 5px;"></span>
		                      
		                       </td>
			                </tr>
	                <%
	                		}
	                	}
	                %>
	                
	                
	                
	                </tbody>
	                <tfoot>
	                 <tr>
	                  <th>Mã khách hàng</th>
	                  <th>Tên khách hàng</th>
	                  <th>Địa chỉ</th>
	                  <th>Tổng số hóa đơn</th>
	                  <th>Tổng tiền</th>
	                  <th></th>
	                </tr>
	                </tfoot>
	              </table>
	            </div>
	            <!-- /.box-body -->
	          </div>
	         </div>
         </div>
	</section>
</div>
<%@include file="frame/footer.jsp"%>