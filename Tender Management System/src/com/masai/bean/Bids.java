package com.masai.bean;

public class Bids {

	private int bidid;
	private int bvid;
	private int bidamount;
	private String Status;
	public Bids() {
		// TODO Auto-generated constructor stub
	}
	public Bids(int bidid, int bvid, int bidamount, String status) {
		super();
		this.bidid = bidid;
		this.bvid = bvid;
		this.bidamount = bidamount;
		Status = status;
	}
	public int getBidid() {
		return bidid;
	}
	public void setBidid(int bidid) {
		this.bidid = bidid;
	}
	public int getBvid() {
		return bvid;
	}
	public void setBvid(int bvid) {
		this.bvid = bvid;
	}
	public int getBidamount() {
		return bidamount;
	}
	public void setBidamount(int bidamount) {
		this.bidamount = bidamount;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "Bids [bidid=" + bidid + ", bvid=" + bvid + ", bidamount=" + bidamount + ", Status=" + Status + "]";
	}
	public Bids(int bidid, int bvid, int bidamount) {
		super();
		this.bidid = bidid;
		this.bvid = bvid;
		this.bidamount = bidamount;
	}
	
	
}
