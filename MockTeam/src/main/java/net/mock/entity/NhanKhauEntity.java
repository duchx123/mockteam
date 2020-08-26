package net.mock.entity;

import java.util.Date;





public class NhanKhauEntity {

	private String id_nk;
	

	private String ten;
	

	private Date ngaySinh;
	

	private String noiSinh;
	

	private String queQuan;
	

	private String danToc;
	

	private String tonGiao;
	

	private String trinhDoVanHoa;
	

	private String ngheNghiep;
	

	private String noiLamViec;
	

	private Date dateDangKyThuongTru;
	

	private String quanHeCH;
	

	private CMNDEntity soCMND;
	

	

	private SoHoKhauEntity soHoKhau;
	private String anh;

	public String getId_nk() {
		return id_nk;
	}
	public void setId_nk(String id_nk) {
		this.id_nk = id_nk;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getNoiSinh() {
		return noiSinh;
	}
	public void setNoiSinh(String noiSinh) {
		this.noiSinh = noiSinh;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	public String getDanToc() {
		return danToc;
	}
	public void setDanToc(String danToc) {
		this.danToc = danToc;
	}
	public String getTonGiao() {
		return tonGiao;
	}
	public void setTonGiao(String tonGiao) {
		this.tonGiao = tonGiao;
	}
	public String getTrinhDoVanHoa() {
		return trinhDoVanHoa;
	}
	public void setTrinhDoVanHoa(String trinhDoVanHoa) {
		this.trinhDoVanHoa = trinhDoVanHoa;
	}
	public String getNgheNghiep() {
		return ngheNghiep;
	}
	public void setNgheNghiep(String ngheNghiep) {
		this.ngheNghiep = ngheNghiep;
	}
	public String getNoiLamViec() {
		return noiLamViec;
	}
	public void setNoiLamViec(String noiLamViec) {
		this.noiLamViec = noiLamViec;
	}
	public Date getDateDangKyThuongTru() {
		return dateDangKyThuongTru;
	}
	public void setDateDangKyThuongTru(Date dateDangKyThuongTru) {
		this.dateDangKyThuongTru = dateDangKyThuongTru;
	}
	public String getQuanHeCH() {
		return quanHeCH;
	}
	public void setQuanHeCH(String quanHeCH) {
		this.quanHeCH = quanHeCH;
	}

	public CMNDEntity getSoCMND() {
		return soCMND;
	}
	public void setSoCMND(CMNDEntity soCMND) {
		this.soCMND = soCMND;
	}
	public SoHoKhauEntity getSoHoKhau() {
		return soHoKhau;
	}
	public void setSoHoKhau(SoHoKhauEntity soHoKhau) {
		this.soHoKhau = soHoKhau;
	}
	
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	public NhanKhauEntity(String ten, Date ngaySinh, String noiSinh, String queQuan, String danToc, String tonGiao,
			String trinhDoVanHoa, String ngheNghiep, String noiLamViec, Date dateDangKyThuongTru, String quanHeCH,
			CMNDEntity soCMND, SoHoKhauEntity soHoKhau) {
		super();
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.noiSinh = noiSinh;
		this.queQuan = queQuan;
		this.danToc = danToc;
		this.tonGiao = tonGiao;
		this.trinhDoVanHoa = trinhDoVanHoa;
		this.ngheNghiep = ngheNghiep;
		this.noiLamViec = noiLamViec;
		this.dateDangKyThuongTru = dateDangKyThuongTru;
		this.quanHeCH = quanHeCH;
		this.soCMND = soCMND;
		this.soHoKhau = soHoKhau;
	}
	
	public NhanKhauEntity(String id_nk, String ten, CMNDEntity soCMND, String anh) {
		super();
		this.id_nk = id_nk;
		this.ten = ten;
		this.soCMND = soCMND;
		this.anh = anh;
	}
	
	
	public NhanKhauEntity(String id_nk, String ten, Date ngaySinh, String noiSinh, String queQuan, String danToc,
			String tonGiao, String trinhDoVanHoa, String ngheNghiep, String noiLamViec, Date dateDangKyThuongTru,
			String quanHeCH, CMNDEntity soCMND, SoHoKhauEntity soHoKhau, String anh) {
		super();
		this.id_nk = id_nk;
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.noiSinh = noiSinh;
		this.queQuan = queQuan;
		this.danToc = danToc;
		this.tonGiao = tonGiao;
		this.trinhDoVanHoa = trinhDoVanHoa;
		this.ngheNghiep = ngheNghiep;
		this.noiLamViec = noiLamViec;
		this.dateDangKyThuongTru = dateDangKyThuongTru;
		this.quanHeCH = quanHeCH;
		this.soCMND = soCMND;
		this.soHoKhau = soHoKhau;
		this.anh = anh;
	}
	public NhanKhauEntity(String id_nk, String anh) {
		super();
		this.id_nk = id_nk;
		this.anh = anh;
	}
	public NhanKhauEntity(String id_nk, String ten, Date ngaySinh, String noiSinh, String queQuan, String danToc,
			String tonGiao, String trinhDoVanHoa, String ngheNghiep, String noiLamViec, Date dateDangKyThuongTru,
			String quanHeCH, CMNDEntity soCMND, SoHoKhauEntity soHoKhau) {
		super();
		this.id_nk = id_nk;
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.noiSinh = noiSinh;
		this.queQuan = queQuan;
		this.danToc = danToc;
		this.tonGiao = tonGiao;
		this.trinhDoVanHoa = trinhDoVanHoa;
		this.ngheNghiep = ngheNghiep;
		this.noiLamViec = noiLamViec;
		this.dateDangKyThuongTru = dateDangKyThuongTru;
		this.quanHeCH = quanHeCH;
		this.soCMND = soCMND;
		this.soHoKhau = soHoKhau;
	}
	public NhanKhauEntity() {
		super();
	}
	
}

