package com.zyh;

public class EmployeeBean {
	private String eno;
	private String ename;
	private String ecompany;
	
	public EmployeeBean() {}

	public EmployeeBean(String eno, String ename, String ecompany) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.ecompany = ecompany;
	}

	public String getEno() {
		return eno;
	}

	public void setEno(String eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEcompany() {
		return ecompany;
	}

	public void setEcompany(String ecompany) {
		this.ecompany = ecompany;
	}
	
	
}
