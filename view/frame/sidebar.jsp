<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<aside class="main-sidebar">

    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="${pageContext.request.contextPath}/images/avatar5.png" class="img-circle"
                     alt="User Image">
            </div>
            <div class="pull-left info">
                <p>Alexander Pierce</p>
                <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
            </div>
        </div>
        <ul class="sidebar-menu" data-widget="tree">
            <li class="active"><a href="home.jsp"> <i
                        class="fa fa-dashboard"></i> <span>Tổng quan</span>
                </a></li>
            <li class="treeview"><a href="#"> <i class="fa fa-dashboard"></i>
                    <span>Quản lí hàng hóa</span> <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">
                    <li class=""><a href="addproduct.jsp"><i
                                class="fa fa-circle-o"></i>Thêm mới</a></li>
                    <li><a href="nhaphang"><i
                                class="fa fa-circle-o"></i>Nhập hàng</a></li>
                    <li><a href="danhsach"><i
                                class="fa fa-circle-o"></i>Quản lí hàng hóa</a></li>
                    <li><a href="createhoadon"><i
                                class="fa fa-circle-o"></i>Bán hàng</a></li>
                    <li><a href="hoadon"><i
                                class="fa fa-circle-o"></i>Hóa đơn</a></li>
                    
                </ul></li>
            <li class="treeview"><a href="#"> <i class="fa fa-dashboard"></i>
                    <span>Nhà cung cấp</span> <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">
                    <li class=""><a href="danhsachnhacungcap"><i
                                class="fa fa-circle-o"></i>Quản lí</a></li>
                </ul></li>
            <li class="treeview"><a href="#"> <i class="fa fa-dashboard"></i>
                    <span>Khách hàng</span> <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">
                    <li class=""><a href="danhsachkhachhang"><i
                                class="fa fa-circle-o"></i>Quản lí</a></li>
                </ul></li>
            <li class="treeview"><a href="#"> <i class="fa fa-dashboard"></i>
                    <span>Nhân viên</span> <span class="pull-right-container"> <i
                            class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">
                    <li class=""><a href="danhsachnhanvien"><i
                                class="fa fa-circle-o"></i>Quản lí</a></li>
                    <li><a href="tinhluong.jsp"><i class="fa fa-circle-o"></i>Tính
                            lương</a></li>
                </ul></li>
            <li><a href="bangchamcong"> <i
                        class="fa fa-dashboard"></i> <span>Chấm công</span>
                </a></li>
            <li><a href="phieuchi.html"> <i
                        class="fa fa-dashboard"></i> <span>Danh mục phiếu chi</span>
                </a></li>
            <!-- NHÉT CÁI DANH MỤC NHÉ -->
        </ul>
    </section>
    <!-- /.sidebar -->
</aside>