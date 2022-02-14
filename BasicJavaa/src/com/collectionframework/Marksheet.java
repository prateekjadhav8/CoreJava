package com.collectionframework;

public class Marksheet implements Comparable<Marksheet> {
	
	private String rollNo;
	private String Fname;
	private String Lname;
	private String phy;
	private String chem;
	private String math;
	
	public Marksheet() {}
	
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getPhy() {
		return phy;
	}
	public void setPhy(String phy) {
		this.phy = phy;
	}
	public String getChem() {
		return chem;
	}
	public void setChem(String chem) {
		this.chem = chem;
	}
	public String getMath() {
		return math;
	}
	public void setMath(String math) {
		this.math = math;
	}
	@Override
	public int compareTo(Marksheet o) {
		return this.rollNo.compareTo(o.rollNo);
		
	}
	

}