//java program to print prime numbers//

import java.util.Scanner;
public class Main   
{
	public static void main(String[] args)
	{
		int i,n,count;
		System.out.println("enter the number");
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println("prime numbers are");
		for(n=1;n<=num;n++)
		{
		    count=0;
		    for(i=2;i<=n/2;i++)
		    {
		        if(n%i == 0)
		        {
		            count++;
		            break;
		        }
		    }
		    if(count == 0 && n!= 1)
		    {
		        System.out.print(n+"  ");
		    }
		}
	}
}

