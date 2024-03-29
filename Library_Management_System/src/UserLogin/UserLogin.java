package UserLogin;
import admin.Admin;
public class UserLogin {

	public int userId;
	public String Password;

public void  check(int userId,String Password)
{
	if(userId==123 && Password.equalsIgnoreCase("pratiksha@12"))
	{
		System.out.println("Login successful : Welcome Admin");
		System.out.println();
	      Admin obj=new Admin();
          obj.adminInput();
		
	}
	else 
	{
		System.out.println("You have Entered Incorrect Id or Password ");
	    System.out.println("Login Unsuccessful.....");
	}

}
public void SignUp(int userId,String Password)
{
if(userId==123 && Password.equalsIgnoreCase("pratiksha@12"))
	{
		System.out.println("Registration successful!");
	}
	
}
	
}







