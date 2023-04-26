package com.Bankenum;

public class Date {
private int date,month,year;
	
	public Date(int d, int m,int y)
	{
		this.date=d;
		this.month=m;
		this.year=y;
	}
	
	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date:("+date+"/"+month+"/"+year+")";
	}
	

}
