//java program to search a number in a array//

import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the number to search:");
		int num=scan.nextInt();
		int flag=0;
		int[] a={10,30,20,50,40};
		
		
		for(int i=0;i<a.length;i++)
		{
		    if(num==a[i])
		    {
		        flag=i;
		        break;
		    }
		}
		if(flag==0)
		{
		    System.out.println(num+"is not present");
		}
		else
		{
		    System.out.println(num+"is present in the array");
		}
	}
}
