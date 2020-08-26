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
<link href="<c:url value='/resources/images/logo.png' />"
	rel="stylesheet" type="text/css" media="all" />
<!-- BOOTSTRAP 4 -->
<link href="<c:url value='/resources/css/bootstrap.css' />"
	rel="stylesheet" type="text/css" media="all" />

<!-- FONTAWESOME -->
<link href="<c:url value='/resources/css/font-awesome.css' />"
	rel="stylesheet" type="text/css" media="all" />
<!-- OWL CAROUSEL -->
<link href="<c:url value='/resources/css/owl.carousel.css' />"
	rel="stylesheet" type="text/css" media="all" />
<link href="<c:url value='/resources/css/owl.theme.default.css' />"
	rel="stylesheet" type="text/css" media="all" />
<!-- MAIN CSS -->
<link href="<c:url value='/resources/css/index.css' />" rel="stylesheet"
	type="text/css" media="all" />
</head>
<body>

	<%@include file="/includes/header.jsp"%>

	<!-- CMND MẶT TRƯỚC -->
	<div class="container offer-section ">
		<div class="row mb-5">
			<div class="col offer-title text-center">
				<h1>Thông Tin Chứng Minh Nhân Dân</h1>

			</div>
		</div>
		<div class="row text-center">
			<div class="col-2"></div>
			<div class="offer-item col-8 border  border-primary">
				<div class="row">
					<div class="col-4">
						<div class="cmnd  mt-5 pl-2 ml-2 mb-2 ">

							<img class="w-80 h-80" alt="imgNK"
								src='<c:url value="/resources/images/quochuy1.png"></c:url>'>
						</div>
						<div class="img__personal">
							<img class="w-70 h-70" alt="imgNK"
								src='<c:url value="/resources/images/${cmnde.anh1}"></c:url>'>
						</div>

					</div>
					<div class="col-8">
						<p>CỘNG HÒA XÃ HỘI CHỦ NGHĨA VIỆT NAM</p>
						<p class="">
							<u>Độc lập - Tự do - Hạnh phúc</u>
						</p>

						<H5 style="color: red;">
							<b>GIẤY CHỨNG MINH NHÂN DÂN</b>
						</H5>
						<div style="text-align: left;">
							<h5 class="pl-0" style="text-align: center; color: red;">Số
								CMND:${cmnde.so_cmnd}</h5>
							<H6 class="pl-0">Họ tên:${nke.ten}</H6>
							<H6 class="pl-0"></H6>
							<H6 class="pl-0">Sinh ngày:${nke.ngaySinh}</H6>
							<H6 class="pl-0">Nguyên Quán:${nke.queQuan}</H6>
							<H6 class="pl-0">Nơi DKHK thường trú: ${shke.diaChi}, Tổ
								${shke.toDanPho.id_todanpho}, Phường ${shke.phuong}</H6>

						</div>
					</div>

				</div>


			</div>
		</div>


		<!--CMND MẶT SAU -->

		<!--CMND MẶT SAU -->

		<div class="container offer-section ">
			<div class="row mb-5">
				<div class="col offer-title text-center">
					<h1>Mặt Sau</h1>

				</div>
			</div>
			<div class="row text-center ">
				<div class="col-2"></div>
				<div class="offer-item col-8 border  border-primary">
					<div class="row">
						<div class="col-6" style="text-align: left;">Dân
							tộc:${nke.danToc}</div>
						<div class="col-6" style="text-align: left;">Tôn
							giáo:${nke.tonGiao}</div>
					</div>
					<div class="row border  border-primary">
						<div class="col-4">
							<div class="row">
								<div class="col-12" style="width: 84px; height: 133px;">Dấu
									vân tay 1</div>
							</div>
							<H5 class=" border border-primary"></H5>
							<div class="row">
								<div class="col-12" style="width: 84px; height: 133px;">Dấu
									vân tay 2</div>
							</div>
						</div>
						<div class="col-8 border  border-primary">

							<div class="row">
								<div class="col-12" style="height: 133px;">
									<H5 class=" border border-info">DẤU VẾT RIÊNG VÀ DỊ HINH</H5>
									<div style="text-align: left;">
										<H6 class="pl-0">${cmnde.note}</H6>
										<H6 class="pl-0"></H6>
										<H6 class="pl-0"></H6>
									</div>
									<H5 class=" border border-primary"></H5>

								</div>

								<div class="row">
									<div class="col-12" style="height: 133px;">
										<div style="text-align: right;">
											<H6 class="pl-0">Ngày cấp:${cmnde.ngayCapCMND}</H6>
											<H6 class="pl-0">GIÁM ĐỐC CA:${cmnde.noiCap}</H6>

											<H6 class="pl-0">___________</H6>
											<H6 class="pl-0">____</H6>
										</div>
									</div>
								</div>
							</div>



						</div>
					</div>

				</div>


			</div>
		</div>





		<%@include file="/includes/footer.jsp"%>
</body>
</html>

