//java program to read a float display the condition given//


import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    float num;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the float type value:");
		num= scan.nextFloat();
		System.out.println("smallest integer ="+Math.floor(num));
		System.out.println("given number="+Math.abs(num));
		System.out.println("largest integer="+Math.ceil(num));
	}

}

