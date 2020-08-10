//program for performing counter function using static and non static variable
public class Main
{
	public static void main(String[] args) {
		Counter c1=new Counter();
	    Counter c2=new Counter();
	    Counter c3=new Counter();
	    
	}
}
class Counter{
    static int count=0;        //static variable
    int flag=6;                //non static variable
    Counter(){
        count++;
        flag++;
        System.out.println("count becomes  "+count);
        System.out.println("flag becomes  "+flag);
        
    }
}
