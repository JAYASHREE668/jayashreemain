/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance1;


public class automobile {
 public static void main(String[] args)
 {
     car obj=new car("swift","7891",42.1f,2020,4,true,4,false,120,"12","yes");
     truck obj1=new truck("TATA","8721",23.4f,2019,4,true,"10",5);
     System.out.println(obj);
     System.out.println(obj1);
 }
}
class automob
{
    String maker;
    String vehicleidentificationnumber;
    float bluebookvalue;
    int year;
    int passengers;
    
    
}
class car extends automob
{
    boolean warranty;
    int doors;
    boolean imported;
    int topspeed;
    String size;
    String reardoor;
    car(String m,String v,float b,int y,int p,boolean w,int d,boolean i,int t,String s,String r)
    {
      maker=m;
      vehicleidentificationnumber=v;
      bluebookvalue=b;
      year=y;
      passengers=p;
      warranty=w;
      doors=d;
      imported=i;
      topspeed=t;
      size=s;
      reardoor=r;
    }
    public String toString()
    {
        return maker+" "+ vehicleidentificationnumber+" "+bluebookvalue+" "+year+" "+passengers+" "+warranty+" "+doors+" "+imported+" "+topspeed+" "+size+" "+reardoor;
      
    }
}
class truck extends automob
{
  
    boolean topper;
    String wheels;
    int racks;
    truck(String m,String v,float b,int y,int p,boolean t,String w,int r)
    {
        maker=m;
        vehicleidentificationnumber=v;
        bluebookvalue=b;
        year=y;
        passengers=p;
        topper=t;
        wheels=w;
        racks=r;
        
    }
    public String toString()
    {
       return maker+" "+ vehicleidentificationnumber+" "+bluebookvalue+" "+year+" "+passengers+" "+topper+" "+wheels+" "+racks;
       
      
    }
}
