//java program to generate 5 random numbers//

import java.util.Random;
public class Main
{
	public static void main(String[] args) 
	{
		Random randomNumGenerator= new Random();
		  for(int i=1;i<=5;++i)
		  {
		      int randomInt=randomNumGenerator.nextInt(100);
		      System.out.println("Random Number="+randomInt);
		  }
	}
}
