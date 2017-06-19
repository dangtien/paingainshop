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
<<<<<<< HEAD

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
=======
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
>>>>>>> 3fa13be0f5c73a92ea238a6bd5ec57158e20765b
