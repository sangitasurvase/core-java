package admin;

import java.util.Scanner;

public class Student1
{
	int rno;
	String sname;
	String mno;

public int getRno() {
	return rno;
}
public void setRno(int rno)
{
	if(rno>0)
	{
	this.rno = rno;
	}
	else
	{
		System.out.println("enter the correct roll number");
	}
}
public String getName() {
	return sname;
}
public void setName(String sname) {
	this.sname = sname;
}
public String getMno() {
	return mno;
}
public void setMno(String mno)
{
	if(mno.matches("\\d{10}"))
	{
	this.mno = mno;
}
	else
	{
		System.out.println("Enter the Valid Mobile Number");
	}
	
}
   
	}





