package UserLogin;

import java.util.Scanner;

public class Home extends UserLogin
{
public static void main(String[] args) 
{ 
	Home ob=new Home();
	Scanner sc=new Scanner(System.in);
	int ch;
	int uid;
	String upassword;

  
  do
	{
		System.out.println("***** Library Management  Application *****");
		System.out.println("1 .Login");
		System.out.println("2 .Sign up");
		System.out.println("3 .Exit");
	    System.out.println("Enter Any Option");
	    ch=sc.nextInt();
   
	switch (ch) {
	case 1:
		System.out.println("Enter User Id");
		uid=sc.nextInt();
		System.out.println("Enter Password");
		 upassword=sc.next();
		ob.check(uid,upassword);
		break;
	case 2:
		System.out.println("Enter User Id");
	    uid=sc.nextInt();
	    System.out.println("Enter Password");
	    upassword=sc.next();
		ob.SignUp(uid, upassword);
		break;
	case 3:
		break;
	default:
		System.out.println("Invalid Input");
		break;
	}
	}while(ch!=3);
	
	
}
}
