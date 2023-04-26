package com.Bankenum;

public class BankAct {
	private int acctid;
	private static int acctidcounter;
	private String name;
	private double balance;
	private Actype actype;
	private Date date;
	private locker locker;
	
	static
	{
		acctidcounter=1001;
	}
	
	public BankAct(String name, double balance, Actype actype, Date d) {
		
		this.acctid=acctidcounter;
		acctidcounter++;
		this.name = name;
		this.balance = balance;
		this.actype = actype;
		this.date = d;
	}
	
	public String getName() {               //getter setter
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getAcctid() {
		return acctid;
	}

	public double getBalance() {
		return balance;
	}

	
	public void createlocker(int duration)     //createlocker
	{
		locker=new locker(duration);
	}
	
	public locker getLocker() {
		return locker;
	}
	
	@Override
	public String toString()
	{
		if(locker==null)
		{
			System.out.println("No locker assigned");
			return "Actid: "+this.acctid+" Name: "+this.name+" Balance:"+this.balance+" Account type:"+this.actype+" DOB:"+this.date;
		}
		else
		{
			return "Actid: "+this.acctid+" Name: "+this.name+" Balance:"+this.balance+" Account type:"+this.actype+" DOB:"+this.date+" "+locker;			
		}
	}


//------------------------------------------------------------------------------



	private static class locker                  //inner class
	{
		private int lockerid,duration;
		private static int lockeridcounter; 
		private double charges;
		private final double permonth=500;
		static
		{
			lockeridcounter=100;
		}
		
		public locker(int duration)
		{
			lockerid=lockeridcounter;
			lockeridcounter++;
			this.duration=duration;
			charges=this.duration*this.permonth;
		}
		
		public double getCharges()
		{
			return this.charges;
		}
		
		@Override
		public String toString()
		{
			return "Locker id:"+this.lockerid+" Charges:"+this.charges+" Duration:"+this.duration;
		}
			
	}//end innerclass
}
