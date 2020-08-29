/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance2;


public class intfdemo {
    public static void main(String[] args){
        Rectangle obj=new Rectangle();
        obj.print();
        SportsCar obj1=new SportsCar();
        obj1.print();
        Manager obj2=new Manager();
        obj2.print();
    }
    
}
interface printable
{
    void print();
}
class Rectangle implements  printable
{
     public void print()
    {
       System.out.println("length is:"+10+" breadth is:"+5+" Area is:"+50);
    }
}
class SportsCar implements  printable
{
    public void print()
    {
        System.out.println("brandname:"+"jeep"+" Model:"+"23Sr"+" price:"+235000);
    }
}
class Manager implements printable
{
    public void print()
    {
        System.out.println("name:"+"Raja"+" age:"+30+" EmployeID:"+"m012"+" Salary:"+"200000");
    }
}
}
