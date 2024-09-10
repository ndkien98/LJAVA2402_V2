console.log("hello t3h")
const PAGE=0;
const SIZE = 3;
// đảm bảo chỉ khi toàn bộ file html được load xong mới thực thi đoạn code này
$(document).ready(function (){
    fetchClaim();
});


function fetchClaim(){

    // lấy dữ liệu trên màn hình
    let claimCode = $('#search-ma-yeu-cau').val() !== '' ? $('#search-ma-yeu-cau').val() : null ;
    let fromDate = $('#from-date').val() !== '' ? $('#from-date').val() : null;
    let toDate = $('#to-date').val() !== '' ? $('#to-date').val() : null;
    let statusCode = $('#trang-thai-yeu-cau').val() !== '' ? $('#trang-thai-yeu-cau').val() : null;

    // đưa vào object
    let requestClaimFilter = {
        claimCode,
        fromDate,
        toDate,
        statusCode
    }
    console.log(requestClaimFilter);

    // call api lấy danh sách claim
    $.ajax({
        url: 'http://localhost:8080/api/claim/all-claim?page='+PAGE+'&size='+SIZE,
        type:'POST',
        contentType: 'application/json',
        data: JSON.stringify(requestClaimFilter),
        success: function (response){
            console.log(response)
        },
        error: function (responseError){
            console.log(responseError)
        }
    })

}