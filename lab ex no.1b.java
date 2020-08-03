//java program to find odd or even in an array//


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    int n,i;
	    Scanner s=new Scanner(System.in);
	    System.out.print("enter the no. of elements in an array:");
	    n=s.nextInt();
	    int a[]=new int[n];
	    System.out.println("enter the elements:");
	    for(i=0;i<n;i++)
	    {
	        a[i]=s.nextInt();
	    }
	    System.out.print("odd numbers:");
	    for(i=0;i<n;i++)
	    {
	        if(a[i]%2!=0)
	        {
	            System.out.print(a[i]+"  ");
	        }
	    }
	    System.out.println(" ");
	    System.out.print("even numbers:");
	    for(i=0;i<n;i++)
	    {
	        if(a[i]%2==0)
	        {
	            System.out.print(a[i]+"  ");
	            }
	    }
	}
}
