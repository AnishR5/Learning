package Core;

import java.time.LocalDate;

import CustomExcep.BankingException;

public class BankAccount {
	
	private int Accno;
	private double balance;
	private String name;
	private Acctype type;
	private LocalDate createdOn;
	private LocalDate lastTransdate;
	private boolean isActive;
	
	public boolean isActive() {
		return isActive;
	}

	public Acctype getType() {
		return type;
	}

	public double getBalance() {
		return balance;
	}

	public BankAccount(int accno,String name, double balance, Acctype type, LocalDate createdOn,LocalDate lastTransdate) {
		super();
		Accno = accno;
		this.name=name;
		this.balance = balance;
		this.type = type;
		this.createdOn = createdOn;
		this.isActive = true;
		this.lastTransdate=lastTransdate;
	}

	@Override
	public String toString() {
		return "BankAccount [Accno=" + Accno +" Name:"+name+ ", balance=" + balance + ", type=" + type + ", createdOn=" + createdOn
				+ ", lastTransdate=" + lastTransdate + ", isActive=" + isActive + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public int getAccno() {
		return Accno;
	}
	
	public void deposit(double amt) throws BankingException
	{
		if(isActive) {
		this.balance=this.balance+amt;
		this.lastTransdate=LocalDate.now();
		}
		else
			throw new BankingException("BankAccount Inactive");
	}
	public void withdraw(double amt) throws BankingException
	{
		if(isActive)
		{
		this.balance=this.balance-amt;
		this.lastTransdate=LocalDate.now();
		}
		else
			throw new BankingException("BankAccount Inactive");
	}
	
	public void BankTransfer(BankAccount otheracct,double amt) throws BankingException
	{
		this.withdraw(amt);
		otheracct.deposit(amt);
	}
	
	
	
	
	
	
	
	
	
	

}
