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
