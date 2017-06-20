/**
 * 
 */
function addDetail(value) {
    $("#sugges1").hide();
    $.get("addchitiethoadon",
            {maHH: value},
            function (data) {
                $('#hoadondetail').html(data);
            }
    );
}
function showHint(str) {
    if (str.length == 0) {
        $('#result1').html("");
        $("#sugges1").hide();
    } else {
        $.get("searchproduct",
                {txtsearch: str},
                function (data) {
                    $('#result1').html(data);
                    $("#sugges1").show();
                }
        );
    }
}
function showHintkh(str) {
    if (str.length == 0) {
        $('#result2').html("");
        $("#suggest2").hide();
    } else {
        $.get("searchkhachhang",
                {txtsearch: str},
                function (data) {
                    $('#result2').html(data);
                    $("#suggest2").show();
                }
        );
    }
}
function addinfobill(value) {
    $("#suggest2").hide();
    $.get("addcustomerbill",
            {maKH: value},
            function (data) {
                $('#infocustomer').html(data);
            }
    );
}


function addregister(){
	var manv = $("#MaNV").val();
	var ca = $("#MaCa").val();
	var gioBD = $("#timepicker1").val();
	var gioKT = $("#timepicker2").val();
	var tienphat ;
	if($("#exampleInputAmount1").val()==''){
		tienphat=0;
	} else tienphat= $("#exampleInputAmount1").val();
	var phucap ;
	if($("#exampleInputAmount2").val()==''){
		phucap=0;
	} else phucap= $("#exampleInputAmount2").val()
	var tamung ;
	if($("#exampleInputAmount3").val()==''){
		tamung=0;
	} else tamung= $("#exampleInputAmount3").val()
	$.get("addregister",
			{MaCa: ca, MaNV: manv,GioBD : gioBD, GioKT:gioKT, TienPhat: tienphat, PhuCap: phucap, TamUng: tamung},
			function(data){
				$("#msg").html(data);
				setTimeout(function(){location.reload()}, 3000);
			}
			);
}
function addCustomer(){
	var makh = $("#inputText0").val();
	var tenkh = $("#inputText1").val();
	var sodt = $("#inputText3").val();
	var diachi = $("#inputText2").val();
	var email = $("inputText4").val();
	
	$.get("addcustomer",
			{MaKH: makh, TenKH: tenkh, SDT: sodt, Adrress:diachi, Email: email},
			function(data){
				$("#msg").html(data);
				
				setTimeout(function(){location.reload()}, 3000);
			}
			);
}

function editBill(dt){
  
  var elem = $(dt).parent().parent();
  var mahh = elem.attr("for");
  var dg = elem.children().children()[0].value;
  var  sl =elem.children().children()[1].value;
  var gg =elem.children().children()[2].value;
  $.get("editbill",
  { MaHH:mahh, DonGia:dg, SoLuong:sl, GiamGia:gg },
  function(data){
      $('#hoadondetail').html(data);
  }
    );
  }

