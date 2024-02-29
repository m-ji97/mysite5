package com.javaex.vo;

public class UserVo {
	
	//필드
	private int no;
	private String id;
	private String password;
	private String name;
	private String hp;
	private String company;
	
	
	//생성자
	public UserVo() {
	}
	
	public UserVo(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public UserVo(int no, String id, String password, String name, String hp, String company) {
		this.no = no;
		this.id = id;
		this.password = password;
		this.name = name;
		this.hp = hp;
		this.company = company;
	}

	//메소드-gs
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	//메소드-일반
	@Override
	public String toString() {
		return "UserVo [no=" + no + ", id=" + id + ", password=" + password + ", name=" + name + ", hp=" + hp
				+ ", company=" + company + "]";
	}
}
