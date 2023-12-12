package com.student.manage;

public class Student {

	private int sId;
	private String sname;
	private String sphone;
	private String scity;
	
	public Student(int sId, String sname, String sphone, String scity) {
		super();
		this.sId = sId;
		this.sname = sname;
		this.sphone = sphone;
		this.scity = scity;
	}

	public Student(String sname, String sphone, String scity) {
		super();
		this.sname = sname;
		this.sphone = sphone;
		this.scity = scity;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSphone() {
		return sphone;
	}

	public void setSphone(String sphone) {
		this.sphone = sphone;
	}

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sname=" + sname + ", sphone=" + sphone + ", scity=" + scity + "]";
	}
	
	
	
}
