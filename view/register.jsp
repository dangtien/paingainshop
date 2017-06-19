<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="paingainshop.model.BangChamCong" %>
<%@ page import="java.util.ArrayList" %>
<%@include file="frame/header.jsp"%>
<%@include file="frame/sidebar.jsp"%>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Chấm công
        <small>Lịch chấm công</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="home.jsp"><i class="fa fa-dashboard"></i> Home</a></li>
        <li class="active">Chấm công</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">
    <span style="color:red"><i>${msg}</i></span>
    <form action="addcustomer" method="post">
      <div class="row">
        <div class="col-md-3">
          <!-- /. box -->
          <div class="box box-solid">
            <div class="box-header with-border">
              <h3 class="box-title">Thêm chấm công</h3>
            </div>
            <div class="box-body">
             
              <!-- /btn-group -->
              <div class="input-group">
              	<input class="form-control" id="nowdate" name="Ngay" type="text" style="margin-bottom: 7px" placeholder="Ngày hiện tại" disabled>
                <input id="Manv" type="text" class="form-control" style="margin-bottom: 7px" placeholder="Mã nhân viên" name="MaNV" required>
				
		              <div class="form-group" >
		                <select class="form-control select2"  style="margin-bottom: 7px; " multiple="multiple" data-placeholder="Chọn nhân viên" style="width: 100%;" name="TenNV" required>
		                  <% ArrayList<BangChamCong> list = (ArrayList<BangChamCong>)request.getAttribute("result");%>
	                <%
	                	if(list!=null){
	                		for(BangChamCong cc : list){
	                %>
		                  <option><%=cc.getTenNV() %></option>
		             <%
	                		}
	                	}
	                %>
		                </select>
		              </div>
				<select class="form-control input input2" style="margin-bottom: 7px" name="MaCa" required>
				  <option value="" disabled selected>Chọn ca làm việc</option>
				  <option value="1">Ca 1</option>
				  <option value="2">Ca 2</option>
				  <option value="3">Ca 3</option>
				</select>
				
					<div class="bootstrap-timepicker">
					<div class="form-group">
                  <div class="input-group" style="width : 100%">
                    <input type="time" class="form-control timepicker" id="timepicker1" name="GioBD" placeholder="Giờ bắt đầu" required>
                    <div class="input-group-addon">
                      <i class="fa fa-clock-o"></i>
                    </div>
                  </div>
                  <!-- /.input group -->
                </div>
                </div>
                <div class="bootstrap-timepicker">
                <!-- /.form group -->
                <div class="form-group" >
                  <div class="input-group" style="width : 100%">
                    <input type="time" class="form-control timepicker"id="timepicker2" name="GioKT" placeholder="Giờ kết thúc" required>
                    <div class="input-group-addon">
                      <i class="fa fa-clock-o"></i>
                    </div>
                  </div>
                  <!-- /.input group -->
                </div>
              </div>
				  <div class="form-group">
				    <label class="sr-only" for="exampleInputAmount">Tiền Phạt</label>
				    <div class="input-group">
				      <div class="input-group-addon">$</div>
				      <input type="text" class="form-control" id="exampleInputAmount1" placeholder="Tiền Phạt" name="TienPhat">
				      <div class="input-group-addon">.00</div>
				    </div>
				  </div>
			
				  <div class="form-group">
				    <label class="sr-only" for="exampleInputAmount">Tiền Phụ cấp</label>
				    <div class="input-group">
				      <div class="input-group-addon">$</div>
				      <input type="text" class="form-control" id="exampleInputAmount2" placeholder="Tiền Phụ cấp" name="PhuCap">
				      <div class="input-group-addon">.00</div>
				    </div>
				  </div>
				  <div class="form-group">
				    <label class="sr-only" for="exampleInputAmount">Tạm ứng</label>
				    <div class="input-group">
				      <div class="input-group-addon">$</div>
				      <input type="text" class="form-control" id="exampleInputAmount3" placeholder="Tạm ứng" name="TamUng">
				      <div class="input-group-addon">.00</div>
				    </div>
				  </div>
                
                <!-- /btn-group -->
              </div>
             <div class="input-group-btn">
                  <button id="add-new-event" type="button" style="float: right; margin-right: 20px; " class="btn btn-primary btn-flat">Thêm</button>
                </div>
              <!-- /input-group -->
            </div>
          </div>
        </div>
        <!-- /.col -->
        
        <div class="col-md-9">
          <div class="box box-primary">
            <div class="box-body no-padding">
              <!-- THE CALENDAR -->
              <div id="calendar"></div>
            </div>
            <!-- /.box-body -->
          </div>
          <!-- /. box -->
        </div>
        <!-- /.col -->
      </div>
      <!-- /.row -->
      </form>
    </section>
    <!-- /.content -->
  </div>


<%@include file="frame/footer.jsp"%>


<!-- fullCalendar 2.2.5 -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js"></script>
<script src="${pageContext.request.contextPath}/templates/plugins/fullcalendar/fullcalendar.min.js"></script>
<!-- Select2 -->
<script src="${pageContext.request.contextPath}/templates/plugins/select2/select2.full.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js"></script>


<!-- Page specific script -->
<script>

  $(function () {
	 
    /* initialize the calendar
     -----------------------------------------------------------------*/
    //Date for the calendar events (dummy data)
   
     $('#calendar').fullCalendar({
    	selectable:false,
    	selectHelper:false,
    	editable:false,
    	droppable: false,
      header: {
        left: 'prev,next today',
        center: 'title',
        right: 'month,agendaWeek,agendaDay'
      },
      buttonText: {
        today: 'today',
        month: 'month',
        week: 'week',
        day: 'day'
      }
      //Random default events
<%--       var date = new Date();
      events: [
    	  <% ArrayList<BangChamCong> list2 = (ArrayList<BangChamCong>)request.getAttribute("result");%>
          <%
          	if(list!=null){
          		for(BangChamCong cc : list2){
          %>
          {
        	  id: <%=cc.getMaCC() %>,
              title: <%=cc.getTenNV() %>,
              start: new Date(<%=cc.getNgay() %>,<%=cc.getGioBD() %>,
              allDay: false,
              <% int a=cc.getMaCC()%5;
              	switch(a){
              	case 0:
              		%>backgroundColor: "#f56954", 
                    borderColor: "#f56954,
                    <%
                	break;
              	case 1: %>backgroundColor: "#f39c12", //yellow
                borderColor: "#f39c12", //yellow
                	<% break;
              	case 2: %>backgroundColor: "#0073b7", //Blue
                borderColor: "#0073b7", //Blue
                	<% break;
              	case 3: %> backgroundColor: "#00c0ef", //Info (aqua)
                borderColor: "#00c0ef",
                	<% break;
              	case 4: %>backgroundColor: "#00a65a", //Success (green)
                borderColor: "#00a65a", //Success (green)
                	<% break;
              	default: break; 
              	}
         	 %>
             
            },
           <%
          		}
          	}
          %> 
      ],
 --%>    }); 
    
      //Remove event from text input
      $(".select2").select2();
       
      //Timepicker
      $(".timepicker").timepicker();
  });
</script>
