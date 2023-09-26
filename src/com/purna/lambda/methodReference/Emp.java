package com.purna.lambda.methodReference;

public class Emp {
	Integer eid;
	String ename;
	Double esal;
	
	public Emp(int eid, String ename, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
	public boolean salaryCheck()
	{
		return this.esal>=18;
	}
	
	public boolean nameCheck()
	{
		return this.ename.startsWith("v");
	}
	
	public double newSal()
	{
		return this.esal+500;
	}
	

}
