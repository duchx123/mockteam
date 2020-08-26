package net.mock.entity;




public class ToDanPhoEntity {


	private int id_todanpho;


	private String phuong;


	private String toTruong;
	

	public int getId_todanpho() {
		return id_todanpho;
	}

	public void setId_todanpho(int id_todanpho) {
		this.id_todanpho = id_todanpho;
	}

	public String getPhuong() {
		return phuong;
	}

	public void setPhuong(String phuong) {
		this.phuong = phuong;
	}

	public String getToTruong() {
		return toTruong;
	}

	public void setToTruong(String toTruong) {
		this.toTruong = toTruong;
	}

	public ToDanPhoEntity() {
		super();
	}

	public ToDanPhoEntity(int id_todanpho, String phuong, String toTruong) {
		super();
		this.id_todanpho = id_todanpho;
		this.phuong = phuong;
		this.toTruong = toTruong;
	}

	public ToDanPhoEntity(String phuong, String toTruong) {
		super();
		this.phuong = phuong;
		this.toTruong = toTruong;
	}

}
