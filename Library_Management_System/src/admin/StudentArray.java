package admin;

import java.util.Scanner;

public class StudentArray
{
    
    public static void main(String[] args)
    {    	

//        StudentArray oba=new StudentArray();
//    	Student1[]stuArray=new Student1[4];
//
//    	Student1[] studentArray = new Student1[stuArray.length];
//      
      }
    	public void StudentData()
    	{

    		  StudentArray oba=new StudentArray();
    	  	  Student1[]stuArray=new Student1[4];
    	      int ch;
              Scanner sc=new Scanner(System.in); 
       do
     {
       System.out.println(" ****** Student Page *****");
       System.out.println("1. Add Students ");
       System.out.println("2. Display All Students");
       System.out.println("3. Exit");
       System.out.println("Enter Any Option ");
       ch=sc.nextInt();

       switch (ch)
       {
          case 1:
	             oba.addStudent(stuArray);
	             break;
          case 2:
        	    
        		oba.displayStudent(stuArray);
                break;
          case 3:
	            break;

           default:
	              System.out.println("Invalid Input");
	         break;
             }
              }while(ch!=3);
               }
    

    void addStudent(Student1[]stuArray) 
    
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Add Student Name,Roll Number and Mobile Number");
	
	Student1 obj1=new Student1();
	System.out.println(" Enter The Roll no:");
	obj1.setRno(sc.nextInt());
	System.out.println("Enter the Name :");
	obj1.setName(sc.next());
	System.out.println("Enter the Mobile No :");
    obj1.setMno(sc.next());	
    
    
	Student1 obj2=new Student1();
	System.out.println(" Enter The Roll no:");
	obj2.setRno(sc.nextInt());
	System.out.println("Enter the Name :");
	obj2.setName(sc.next());
	System.out.println("Enter the Mobile No :");
    obj2.setMno(sc.next());	
	
	Student1 obj3=new Student1();
	System.out.println(" Enter The Roll no:");
	obj3.setRno(sc.nextInt());
	System.out.println("Enter the Name :");
	obj3.setName(sc.next());
	System.out.println("Enter the Mobile No :");
    obj3.setMno(sc.next());	
	
	
	Student1 obj4=new Student1();
	System.out.println(" Enter The Roll no:");
	obj4.setRno(sc.nextInt());
	System.out.println("Enter the Name :");
	obj4.setName(sc.next());
	System.out.println("Enter the Mobile No :");
    obj4.setMno(sc.next());
    System.out.println();
    System.out.println("...................Data Saved Successfully................");
//	Student1[]stuArray=new Student1[4];
	stuArray[0]=obj1;
	stuArray[1]=obj2;
	stuArray[2]=obj3;
	stuArray[3]=obj4;
	for(int i=0;i<stuArray.length;i++)
	{
		Student1 tmp=stuArray[i];	
	}

}
 
 public void displayStudent(Student1[] tmp)
{
		System.out.println("*********** List of Students,Roll No & Mobile No ******* .");
	for(int i=0;i<tmp.length;i++)
	{
		Student1 sobj=tmp[i];
		System.out.println(sobj.rno);
		System.out.println(sobj.sname);
		System.out.println(sobj.mno);
		
	}
}
 }

