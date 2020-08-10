//program to generate electricity bill
import java.util.Scanner;
class Consumer
{
    
    public static void main(String args[])
    {
        System.out.println("enter 1 for domestic");
        System.out.println("enter 2 for commercial");
        Scanner scan =new Scanner(System.in);
        System.out.print("type the EB connection:");
        int connec= scan.nextInt();
        int num=101;
        String name="Jardly";
        int prev=23455;  //previous month reading
        int curr=23355;  //current month reading
        int diff=prev-curr;
       
        if(connec==1)
        {
            if(diff==100)
             System.out.println(diff*2);
            else if(diff<=200)
                System.out.println(diff*3.5);
            else if(diff<=500)
                System.out.println(diff*5);
            else 
                System.out.println(diff*6);
        }
        else
        {
           if(diff==100)
             System.out.println(diff*3);
            else if(diff<=200)
                System.out.println(diff*5.5);
            else if(diff<=500)
                System.out.println(diff*7);
            else 
                System.out.println(diff*8);  
        }
            
    }
}