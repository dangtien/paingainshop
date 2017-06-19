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
