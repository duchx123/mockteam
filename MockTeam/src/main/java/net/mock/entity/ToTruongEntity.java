package net.mock.entity;

public class ToTruongEntity {
	private String username;
	private String id_nk;
	private String pw;
	private int id_todanpho;

	public ToTruongEntity() {
		super();
	}

	
	public ToTruongEntity(String username, String id_nk, String pw, int id_todanpho) {
		super();
		this.username = username;
		this.id_nk = id_nk;
		this.pw = pw;
		this.id_todanpho = id_todanpho;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getId_nk() {
		return id_nk;
	}

	public void setId_nk(String id_nk) {
		this.id_nk = id_nk;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getId_todanpho() {
		return id_todanpho;
	}

	public void setId_todanpho(int id_todanpho) {
		this.id_todanpho = id_todanpho;
	}

}
