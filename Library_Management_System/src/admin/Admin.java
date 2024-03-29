package admin;
import java.util.Scanner; 
import UserLogin.UserLogin;
public class Admin 
{
	public static void main(String[] args)
	{
		
    }

 public void adminInput()
{

		Admin Aobj=new Admin();
		Aobj.AdminData();
	  
}

 void AdminData()
 {	
	 Scanner sc=new Scanner(System.in);
		int ch;
		 do
		 {
			    System.out.println("*********** Admin page ************* ");
				System.out.println("1. Student Records");
				System.out.println("2.Book Records");
				System.out.println("3.Manage Books");
				System.out.println("4. Exits");
			    System.out.println("Enter Any Option");
			    ch=sc.nextInt();
			switch (ch) {
			case 1:
				StudentArray ob=new StudentArray();
				ob.StudentData();
				break;
	        case 2:
	        	Book bob=new Book();
	        	bob.BookRecords();
				break;
	        case 3:
	        	ManageBook mob=new ManageBook();
	    		mob.manageBookRecords();
				break;
	         case 4:
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
			 
		 }while(ch!=4);
 }}

 
 

