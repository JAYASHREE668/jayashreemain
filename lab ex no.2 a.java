
import java.util.Scanner;
 class student
{
   public static void main(String args[])
   {
       
   
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the name:");
    String name=scan.nextLine();
    System.out.println("enter the email");
    String email=scan.nextLine();
    System.out.println("enter the gender");
    char gender=scan.next().charAt(0);
    System.out.println(name+" "+email+" "+gender);
    
   
    
        
           }
}
