package admin;

import java.util.Scanner;

public class ManageBook
{
	int RollNo;
	String Bname;
	String ReturnBname;
	String sName;
	public static void main(String[] args)
	 {
	
     }
	public  void manageBookRecords()
	{
		ManageBook mob=new ManageBook();
		ManageBook[]mArray=new ManageBook[2];
		ManageBook[]rArray=new ManageBook[1];
		 Scanner sc=new Scanner(System.in);
		 int ch;
		 do {
			 	 
		 System.out.println(" ****** Manage Book Page *****");
		 System.out.println("1. Issue Books ");
		 System.out.println("2.Return Books");
		 System.out.println("3. Exit");
		 System.out.println("Enter any option");
		 ch=sc.nextInt();
		 switch (ch) {
		case 1:
			mob.IssueBook(mArray);
			break;
		case 2:
			mob.returnBook(rArray);
			break;
		case 3:
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
		 
		 }while(ch!=3);
	}
	
	void IssueBook(ManageBook[]mArray)
	{
		
		System.out.println("Issue Book to Student");
		ManageBook ob1=new ManageBook();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Roll No:");
		ob1.RollNo=sc.nextInt();
		System.out.println("Enter Book Name :");
		ob1.Bname=sc.next();
		
		
		ManageBook ob2=new ManageBook();
		System.out.println("Enter Student Roll No:");
		ob2.RollNo=sc.nextInt();
		System.out.println("Enter Book Name :");
		ob2.Bname=sc.next();
		
		
		mArray[0]=ob1;
		mArray[1]=ob2;
		System.out.println("List of Issue Book Name And Student Roll No :");
		for(int i=0;i<mArray.length;i++)
		{
			ManageBook tmp=mArray[i];	
			System.out.println("Book Name :"+tmp.Bname+" "+"Roll No:"+tmp.RollNo);
		}
		
	}
	void returnBook(ManageBook[]rArray)
	{   
		Scanner sc=new Scanner(System.in);
		ManageBook mbo=new ManageBook();
		System.out.println("Enter Return Book Name :");
		mbo.ReturnBname=sc.next();
		System.out.println("Enter Student Name :");
		mbo.sName=sc.next();
		rArray[0]=mbo;
		System.out.println("List of Return Book name And Student Name :");
		for(int i=0;i<rArray.length;i++)
		{
			ManageBook mtmp=rArray[i];
			System.out.println("Return Book Name :"+mtmp.ReturnBname+" "+"Student Name:"+mtmp.sName);
			
		}
	}
	
}
