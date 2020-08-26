package net.mock.ma;

public class CMNDModelAttribute {
	private String so_cmnd;
	private String anh1;

	public String getSo_cmnd() {
		return so_cmnd;
	}

	public void setSo_cmnd(String so_cmnd) {
		this.so_cmnd = so_cmnd;
	}

	public String getAnh1() {
		return anh1;
	}

	public void setAnh1(String anh1) {
		this.anh1 = anh1;
	}

	public CMNDModelAttribute(String so_cmnd, String anh1) {
		super();
		this.so_cmnd = so_cmnd;
		this.anh1 = anh1;
	}

	public CMNDModelAttribute() {
		super();
	}

}
