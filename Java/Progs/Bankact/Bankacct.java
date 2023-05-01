package Bankact;

public class Bankacct {
	private int actno;
	private double balance;
	private String name,type;
	public Bankacct(int actno, double balance, String name, String type) {
		super();
		this.actno = actno;
		this.balance = balance;
		this.name = name;
		this.type = type;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getActno() {
		return actno;
	}
	public double getBalance() {
		return balance;
	}
	@Override
	public String toString() {
		return "Bankacct [actno=" + actno + ", balance=" + balance + ", name=" + name + ", type=" + type + "]";
	}
	
	@Override
	public boolean equals(Object o)
	{
		
		if(o instanceof Bankacct)
		{
			return this.actno==((Bankacct)o).actno  ;
		}
		return false;
		
	}
	
}
