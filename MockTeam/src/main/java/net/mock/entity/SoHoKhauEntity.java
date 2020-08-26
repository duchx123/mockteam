package net.mock.entity;

import java.util.Date;




public class SoHoKhauEntity {
	


	private String id_shk;
	
	private String idCH;
	

	private String diaChi;
	

	private ToDanPhoEntity toDanPho;
	

	private String phuong;
	
	
	private Date ngayCapSo;




	public String getId_shk() {
		return id_shk;
	}


	public void setId_shk(String id_shk) {
		this.id_shk = id_shk;
	}


	public String getIdCH() {
		return idCH;
	}


	public void setIdCH(String idCH) {
		this.idCH = idCH;
	}


	public String getDiaChi() {
		return diaChi;
	}


	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}


	public ToDanPhoEntity getToDanPho() {
		return toDanPho;
	}


	public void setToDanPho(ToDanPhoEntity toDanPho) {
		this.toDanPho = toDanPho;
	}


	public String getPhuong() {
		return phuong;
	}


	public void setPhuong(String phuong) {
		this.phuong = phuong;
	}


	public Date getNgayCapSo() {
		return ngayCapSo;
	}


	public void setNgayCapSo(Date ngayCapSo) {
		this.ngayCapSo = ngayCapSo;
	}


	public SoHoKhauEntity(String diaChi, ToDanPhoEntity toDanPho, String phuong, Date ngayCapSo) {
		super();
		this.diaChi = diaChi;
		this.toDanPho = toDanPho;
		this.phuong = phuong;
		this.ngayCapSo = ngayCapSo;
	}


	public SoHoKhauEntity(String id_shk, String idCH, String diaChi, ToDanPhoEntity toDanPho, String phuong,
			Date ngayCapSo) {
		super();
		this.id_shk = id_shk;
		this.idCH = idCH;
		this.diaChi = diaChi;
		this.toDanPho = toDanPho;
		this.phuong = phuong;
		this.ngayCapSo = ngayCapSo;
	}


	public SoHoKhauEntity(String idCH, String diaChi, ToDanPhoEntity toDanPho, String phuong, Date ngayCapSo) {
		super();
		this.idCH = idCH;
		this.diaChi = diaChi;
		this.toDanPho = toDanPho;
		this.phuong = phuong;
		this.ngayCapSo = ngayCapSo;
	}


	public SoHoKhauEntity() {
		super();
	}


	@Override
	public String toString() {
		return "SoHoKhauEntity [id_shk=" + id_shk + ", idCH=" + idCH + ", diaChi=" + diaChi + ", toDanPho=" + toDanPho
				+ ", phuong=" + phuong + ", ngayCapSo=" + ngayCapSo + "]";
	}

	
}
