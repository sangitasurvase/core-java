package admin;

import java.util.Scanner;

public class Book
{
	 String Bname;
	
public static void main(String[] args) 
{
	
}
	
	public  void BookRecords()
	{
		  Book bob=new Book();
	  	  Book[]BookArray=new Book[5];

		  Scanner sc=new Scanner(System.in);
		 int ch;
		 do {
			 	 
		 System.out.println(" ****** Book Page *****");
		 System.out.println("1. Add Books ");
		 System.out.println("2. Display All Books");
		 System.out.println("3. Exit");
		 System.out.println("Enter Any Option :");
		  ch=sc.nextInt();
		 switch (ch) {
		case 1:
			bob.addBook(BookArray);
			break;
		case 2:
			bob.displayBook(BookArray);
			break;
		case 3:
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
		 
		 }while(ch!=3);
	}
	void addBook(Book[]BookArray)
	{
		Scanner sc1=new Scanner(System.in);
        Book ob1=new Book();
        System.out.println("Enter The Book Name-:");
        ob1.Bname=sc1.next();
        
        Book ob2=new Book();
        System.out.println("Enter The Book Name-:");
		ob2.Bname=sc1.next();
		
		Book ob3=new Book();
        System.out.println("Enter The Book Name-:");
		ob3.Bname=sc1.next();
		
		Book ob4=new Book();
        System.out.println("Enter The Book Name-:");
		ob4.Bname=sc1.next();
		
		Book ob5=new Book();
        System.out.println("Enter The Book Name-:");
		ob5.Bname=sc1.next();
		
		System.out.println("..................All Books Added Successfully................");
	    
	      BookArray[0]=ob1;
	      BookArray[1]=ob2;
	      BookArray[2]=ob3;
	      BookArray[3]=ob4;
	      BookArray[4]=ob5;
           for(int i=0;i<BookArray.length;i++)
           {
        	   Book tmp=BookArray[i];
           }
	
	
	}
	void displayBook(Book[]tmp)
	{
		System.out.println("********** List of Books Available In Library ********* :");
		for(int i=0;i<tmp.length;i++)
		{
			Book bobj=tmp[i];
		
			System.out.println(""+bobj.Bname );
			
			
		}

	}
}
