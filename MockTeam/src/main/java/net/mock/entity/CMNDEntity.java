package net.mock.entity;

import java.util.Date;



public class CMNDEntity {

	private String so_cmnd;

	
	private Date ngayCapCMND;


	private String noiCap;


	private String note;

	private String anh1;
	private String anh2;


	public String getSo_cmnd() {
		return so_cmnd;
	}
	public void setSo_cmnd(String so_cmnd) {
		this.so_cmnd = so_cmnd;
	}
	public Date getNgayCapCMND() {
		return ngayCapCMND;
	}
	public void setNgayCapCMND(Date ngayCapCMND) {
		this.ngayCapCMND = ngayCapCMND;
	}
	public String getNoiCap() {
		return noiCap;
	}
	public void setNoiCap(String noiCap) {
		this.noiCap = noiCap;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	public String getAnh1() {
		return anh1;
	}
	public void setAnh1(String anh1) {
		this.anh1 = anh1;
	}
	public String getAnh2() {
		return anh2;
	}
	public void setAnh2(String anh2) {
		this.anh2 = anh2;
	}
	
	public CMNDEntity(String so_cmnd, Date ngayCapCMND, String noiCap, String note) {
		super();
		this.so_cmnd = so_cmnd;
		this.ngayCapCMND = ngayCapCMND;
		this.noiCap = noiCap;
		this.note = note;
	}
	

	public CMNDEntity(String so_cmnd, Date ngayCapCMND, String noiCap, String note, String anh1, String anh2) {
		super();
		this.so_cmnd = so_cmnd;
		this.ngayCapCMND = ngayCapCMND;
		this.noiCap = noiCap;
		this.note = note;
		this.anh1 = anh1;
		this.anh2 = anh2;
	}
	
	public CMNDEntity(String so_cmnd, String anh1, String anh2) {
		super();
		this.so_cmnd = so_cmnd;
		this.anh1 = anh1;
		this.anh2 = anh2;
	}
	public CMNDEntity(String so_cmnd, String noiCap) {
		super();
		this.so_cmnd = so_cmnd;
		this.noiCap = noiCap;
	}
	public CMNDEntity() {
		super();
	}
	
	
}
