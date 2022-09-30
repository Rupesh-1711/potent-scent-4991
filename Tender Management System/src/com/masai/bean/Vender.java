package com.masai.bean;

public class Vender {

	private int vid;
	private String vname;
	private String vemail;
	public Vender(String vname, String vemail, String password, String company, String address) {
		super();
		this.vname = vname;
		this.vemail = vemail;
		this.password = password;
		this.company = company;
		this.address = address;
	}

	private String password;
	private String company;
	private String address;
	
	 public Vender() {
	
	}

	public Vender(int vid, String vname, String vemail, String password, String company, String address) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.vemail = vemail;
		this.password = password;
		this.company = company;
		this.address = address;
	}

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getVemail() {
		return vemail;
	}

	public void setVemail(String vemail) {
		this.vemail = vemail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Vender [vid=" + vid + ", vname=" + vname + ", vemail=" + vemail + ", password=" + password
				+ ", company=" + company + ", address=" + address + "]";
	}
	
}
