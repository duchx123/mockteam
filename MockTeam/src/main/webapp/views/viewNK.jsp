<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta>
<title>GOV HÒA HẢI</title>
<!-- LOGO TITLE -->
<link href="<c:url value='/resources/images/logo.png' />" rel="stylesheet" type="text/css" media="all"/>
<!-- BOOTSTRAP 4 -->
<link href="<c:url value='/resources/css/bootstrap.css' />" rel="stylesheet" type="text/css" media="all"/>

<!-- FONTAWESOME -->
<link href="<c:url value='/resources/css/font-awesome.css' />" rel="stylesheet" type="text/css" media="all"/>
<!-- OWL CAROUSEL -->
<link href="<c:url value='/resources/css/owl.carousel.css' />" rel="stylesheet" type="text/css" media="all"/>
<link href="<c:url value='/resources/css/owl.theme.default.css' />" rel="stylesheet" type="text/css" media="all"/>
<!-- MAIN CSS -->
<link href="<c:url value='/resources/css/index.css' />" rel="stylesheet" type="text/css" media="all"/>
</head>
<body>

	<%@include file="/includes/header.jsp"%>
  
        <!-- THÔNG TIN NHÂN KHẨU -->
        <div class="container ttnk ">
            <div class="row ">
                <div class="col nhankhau__title text-center">
                    <h1>THÔNG TIN CHUNG</h1>
                </div>
            </div>
            <div class="row border ttc pt-2 my-2" >
                <div class="col-12  col-sm-3">
                    <div class="img__personal">
                 
       
                        <img class="w-100 h-100" alt="imgNK" src='<c:url value="/resources/images/${nke.anh}"></c:url>'>
                    </div>
                </div>
                <div class=" col-12 col-sm-9">
                    <div class="row mb-3">
                        <div class="col-lg-3 col-sm-6">
                            <p>SỐ ĐỊNH DANH:</p>
                            <div class="border-item border">
                                <span >${nke.id_nk}</span>
                            </div>
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <p>HỌ TÊN:</p>
                            <div class="border-item border">
                                <span>${nke.ten}</span>
                            </div>
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <p>NGÀY SINH:</p>
                            <div class="border-item border">
                                <span>${nke.ngaySinh}</span>
                            </div>
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <p>GIỚI TÍNH:</p>
                            <div class="border-item border">
                                <span>Nam</span>
                            </div>
                        </div>
                    </div>
                    <div class="row mb-3">
                        <div class="col-lg-3 col-sm-6">
                            <p>DÂN TỘC:</p>
                            <div class="border-item border">
                                <span>${nke.danToc}</span>
                            </div>
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <p>TÔN GIÁO:</p>
                            <div class="border-item border">
                                <span>${nke.tonGiao}</span>
                            </div>
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <p>QUỐC TỊCH:</p>
                            <div class="border-item border">
                                <span>Việt Nam</span>
                            </div>
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <p>QUAN HỆ CHỦ HỘ:</p>
                            <div class="border-item border">
                                <span>${nke.quanHeCH}</span>
                            </div>
                        </div>
                    </div>
                    <div class="row mb-3">
                        <div class="col-lg-3 col-sm-6">
                            <p>CMND:</p>
                            <div class="border-item border">
                                <span>${cmnde.so_cmnd}</span>
                            </div>
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <p>NGÀY CẤP:</p>
                            <div class="border-item border">
                                <span>${cmnde.ngayCapCMND}</span>
                            </div>
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <p>NƠI CẤP:</p>
                            <div class="border-item border">
                                <span>${cmnde.noiCap}</span>
                            </div>
                        </div>
                     
                    </div>
                    <div class="row mb-3">
                        <div class="col-lg-3 col-sm-6">
                            <p> HỌC VẤN:</p>
                            <div class="border-item border">
                                <span>${cmnde.trinhDoVanHoa}</span>
                            </div>
                        </div>
                   
                        <div class="col-lg-3 col-sm-6">
                            <p>NGHỀ NGHIỆP :</p>
                            <div class="border-item border">
                                <span>${nke.ngheNghiep}</span>
                            </div>
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <p>NƠI LÀM VIỆC</p>
                            <div class="border-item border">
                                <span>${nke.noiLamViec}</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <h1>noi sinh, que quan, noi thuong tru, cho o hien tai</h1>
           
            <div class="row ">
                <div class="col nhankhau__title text-center mt-2">
                    <h1>QUÁ TRÌNH HOẠT ĐỘNG</h1>
                </div>
            </div>
            <div class="row border ttc pt-2 my-2" >
                <div class="col-12">
                    <div class="row mb-3">
                        <div class="col-sm-3 ">
                            <p>THỜI GIAN:</p>
                        </div>
                        <div class="col-sm-3 ">
                            <p>LÀM GÌ:</p>
                        </div>
                        <div class="col-sm-4 ">
                            <p>Ở ĐÂU :</p>
                        </div>
                        <div class="col-sm-2 ">
                            <p> CHỨC VỤ:</p>
                        </div>
                    </div>
                </div>
                <div class="col-12">
                    <div class="row mb-3">
                        <div class="col-sm-3 ">
                            <div class="border-item border">
                                <span >18/7/2010-18/7/2014</span>
                            </div>
                        </div>
                        <div class="col-sm-3 ">
                            <div class="border-item border">
                                <span>Học THCS TAM LỘC</span>
                            </div>
                        </div>
                        <div class="col-sm-4 ">
                            <div class="border-item border">
                                <span>Tam Lộc ,Phú Ninh ,Quảng Nam</span>
                            </div>
                        </div>
                        <div class="col-sm-2 ">
                            <div class="border-item border">
                                <span>Học Sinh</span>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-12">
                    <div class="row mb-3">
                        <div class="col-sm-3">
                            <div class="border-item border">
                                <span >18/7/2010-18/7/2014</span>
                            </div>
                        </div>
                        <div class="col-sm-3">
                            <div class="border-item border">
                                <span>Học THCS TAM LỘC</span>
                            </div>
                        </div>
                        <div class="col-sm-4">
                            <div class="border-item border">
                                <span>Tam Lộc ,Phú Ninh ,Quảng Nam</span>
                            </div>
                        </div>
                        <div class="col-sm-2">
                            <div class="border-item border">
                                <span>Học Sinh</span>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-12">
                    <div class="row mb-3">
                        <div class="col-sm-3">
                            <div class="border-item border">
                                <span >18/7/2010-18/7/2014</span>
                            </div>
                        </div>
                        <div class="col-sm-3">
                            <div class="border-item border">
                                <span>Học THCS TAM LỘC</span>
                            </div>
                        </div>
                        <div class="col-sm-4">
                            <div class="border-item border">
                                <span>Tam Lộc ,Phú Ninh ,Quảng Nam</span>
                            </div>
                        </div>
                        <div class="col-sm-2">
                            <div class="border-item border">
                                <span>Học Sinh</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row ">
                <div class="col nhankhau__title text-center mt-2">
                    <h1>LỊCH SỬ TẠM TRÚ</h1>
                </div>
            </div>
            <div class="row border ttc pt-2 my-2" >
                <div class="col-12">
                    <div class="row mb-3">
                        <div class="col-sm-3">
                            <p>THỜI GIAN:</p>
                        </div>
                        <div class="col-sm-3">
                            <p>TỈNH/TP:</p>
                        </div>
                        <div class="col-sm-6">
                            <p>ĐỊA CHỈ:</p>
                        </div>
                    </div>
                </div>
                <div class="col-12">
                    <div class="row mb-3">
                        <div class="col-sm-3">
                            <div class="border-item border">
                                <span >10/10/2018 - 10/10/2019</span>
                            </div>
                        </div>
                        <div class="col-sm-3">
                            <div class="border-item border">
                                <span>ĐÀ NẴNG</span>
                            </div>
                        </div>
                        <div class="col-sm-6">
                            <div class="border-item border">
                                <span>87 HOÀNG VĂN THÁI,HÒA KHÁNH NAM,LIÊN CHIỂU</span>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-12">
                    <div class="row mb-3">
                        <div class="col-sm-3">
                            <div class="border-item border">
                                <span >10/10/2018 - 10/10/2019</span>
                            </div>
                        </div>
                        <div class="col-sm-3">
                            <div class="border-item border">
                                <span>ĐÀ NẴNG</span>
                            </div>
                        </div>
                        <div class="col-sm-6">
                            <div class="border-item border">
                                <span>87 HOÀNG VĂN THÁI,HÒA KHÁNH NAM,LIÊN CHIỂU</span>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-12">
                    <div class="row mb-3">
                        <div class="col-sm-3">
                            <div class="border-item border">
                                <span >10/10/2018 - 10/10/2019</span>
                            </div>
                        </div>
                        <div class="col-sm-3">
                            <div class="border-item border">
                                <span>ĐÀ NẴNG</span>
                            </div>
                        </div>
                        <div class="col-sm-6">
                            <div class="border-item border">
                                <span>87 HOÀNG VĂN THÁI,HÒA KHÁNH NAM,LIÊN CHIỂU</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row ">
                <div class="col nhankhau__title text-center mt-2">
                    <h1>GHI CHÚ</h1>
                </div>
            </div>
            <div class="row border ttc p-2 my-2 " >
                <p class="text-dark">
                    Tôn giáo
                    Ghi rõ đạo Phật, đạo Thiên chúa, đạo Hồi, đạo Cao Đài, đạo Hoà Hảo… ghi cả chức sắc trong tôn giáo (nếu có), không theo đạo nào thì ghi Không.
                    Thành phần gia đình sau cải cách ruộng đất
                    Điền thông tin về thành phần của gia đình bạn theo đúng quy định của pháp luật, có thể là cố nông, bần nông, trung nông, địa chủ, viên chức hay công chức.
                    Thành phần bản thân gia đình hiện nay
                    Gia đình bạn thuộc thành phần nào sẽ điền thông tin vào đó như công nhân, công chức, viên chức…
                    Trình độ văn hóa
                    Viết rõ thông tin 12/12 chính quy hay 12/12 bổ túc văn hóa.
                    Trình độ ngoại ngữ
                    Ghi cụ thể các văn bằng có liên quan tới trình độ ngoại ngữ chẳng hạn như đại học Anh Ngữ, Pháp Ngữ hay Nga Ngữ.
                    Ngày kết nạp Đảng
                    Ngày và nơi kết nạp vào Đảng Cộng sản Việt Nam/ Đoàn thanh niên Cộng sản Hồ Chí Minh: Viết rõ ngày, tháng, năm và nơi kết nạp.
                </p>
            </div>
        </div>
			
			
				<div> <a href="viewCMND?id=${cmnde.so_cmnd}">View CMND</a></div>
				

    	<%@include file="/includes/footer.jsp"%>
	
</body>
</html>

