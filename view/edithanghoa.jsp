<%-- 
    Document   : edithanghoa
    Created on : Jun 21, 2017, 3:28:56 PM
    Author     : dangt
--%>

<%@page import="paingainshop.model.NhaCungCap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="paingainshop.model.HangHoa"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="frame/header.jsp"%>
<%@include file="frame/sidebar.jsp"%>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>Trang chủ
            <small>hàng hóa</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i>Home</a></li>
            <li class="active">hàng hóa</li><li class="active">edit</li>
        </ol>
    </section>
    <section class="content">
        <!-- đây là nội dung -->
        <span style="color:red">${msg}</span>
        <form class="form-horizontal" action="hanghoa/save" method="post">
            <div class="col-md-6">
                <div class="box box-info">
                    <div class="box-header with-border">
                        <h3 class="box-title">Điền thông tin </h3>
                    </div>
                    <!-- /.box-header -->
                    <!-- form start -->
                    <%
                        HangHoa hh = (HangHoa) request.getAttribute("hh");
                    %>
                    <div class="box-body">
                        <div class="form-group">
                            <label for="inputText0" class="col-sm-2 control-label">Mã Hàng</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="inputText0" value="<%= hh.getMaHH()%>" placeholder="Không thể sửa"  name="primproduct" disabled="disabled">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputText1" class="col-sm-2 control-label">Tên hàng <span style="color:red"><i>*</i></span></label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="inputText1" placeholder="Tên hàng hóa" name="productname" value="<%= hh.getTenHH()%>">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputText2" class="col-sm-2 control-label">Nhóm hàng <span style="color:red"><i>*</i></span></label>
                            <div class="col-sm-10">
                                <select class="form-control" id="inputText2"  name="category">
                                    <option value="<%= hh.getNhomHH()%>" selected="selected"><%= hh.getNhomHH()%></option>
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
                            <label for="inputText2" class="col-sm-2 control-label">Mã nhà cung cấp <span style="color:red"><i>*</i></span></label>
                            <div class="col-sm-10">

                                <select class="form-control" id="inputText2" name="vendor" >
                                    <%
                                        ArrayList<NhaCungCap> lncc = (ArrayList<NhaCungCap>) request.getAttribute("l_ncc");
                                        for (NhaCungCap ncc : lncc) {
                                            if (ncc.getMaNCC().equals(hh.getMaHH())) {
                                                out.print("<option value=\"" + hh.getMaHH() + "\" selected=\"selected\">" + ncc.getTenNCC() + "</option>");
                                            } else {
                                    %>

                                    <option value="<%= ncc.getMaNCC()%>"><%=ncc.getTenNCC()%></option>
                                    <%
                                            }
                                        }
                                    %>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputText3" class="col-sm-2 control-label">Thuộc tính</label>
                            <div class="col-md-10">
                                <textarea class="form-control" rows="3" placeholder="Thêm mô tả" name="attribute1" id="inputText3" >
                                    <%= hh.getThuocTinh()%>
                                </textarea>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <div class="box box-info">
                    <div class="box-header with-border">
                        <h3 class="box-title">Điền thông tin</h3>
                    </div>
                    <div class="box-body">
                        <div class="form-group">
                            <label for="inputText0" class="col-sm-2 control-label">Số lượng <span style="color:red"><i>*</i></span></label>
                            <div class="col-sm-10">
                                <input type="number" class="form-control" id="inputText0" placeholder="Số lượng" name="sl" value="<%=hh.getSoLuong()%>">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputText1" class="col-sm-2 control-label">Đơn vị tính <span style="color:red"><i>*</i></span></label>
                            <div class="col-sm-10">

                                <select class="form-control" id="inputText1" name="dvt">
                                    <option value="<%= hh.getDonViTinh()%>" selected="selected"><%=hh.getDonViTinh()%></option>
                                    <option value="cái">Cái</option>
                                    <option value="chiếc">Chiếc</option>
                                    <option value="kg">Kg</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputText2" class="col-sm-2 control-label">Giá bán <span style="color:red"><i>*</i></span></label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="inputText2" placeholder="Giá bán" name="outprice" value="<%=hh.getGiaBan()%>">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputText2" class="col-sm-2 control-label">Giá nhập <span style="color:red"><i>*</i></span></label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="inputText2" placeholder="Giá Nhập" name="inprice" <%=hh.getGiaNhap()%> >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputText3" class="col-sm-2 control-label">Ghi chú</label>
                            <div class="col-md-10">
                                <textarea class="form-control" rows="3" placeholder="Thêm mô tả" name="attribute2" id="inputText3">
                                    <%=hh.getGhiChu()%>
                                </textarea>
                            </div>
                        </div>
                        <div class="box-footer">
                            <a href="danhsach"><button type="reset" class="btn btn-default">Hủy</button></a>
                            <button type="submit" class="btn btn-info pull-right" >Lưu</button>
                        </div>
                    </div>
                </div>
            </div>
        </form>
    </section>
</div>
<%@include file="frame/footer.jsp"%>
