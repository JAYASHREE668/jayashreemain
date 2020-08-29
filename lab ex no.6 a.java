/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance1;


public class abstdemo {
    public static void main(String[] args){
        shape obj=new Rectangle();
        obj.printArea();
        shape obj1=new Triangle();
        obj1.printArea();
        shape obj2=new Circle();
        obj2.printArea();
    }
    
}
abstract class shape {
    int r=5,b=4;   //variable r can be consider as length of rectangle,height of triangle,radius for circle 
    abstract void printArea();
   
}
class Rectangle extends shape
{
    public void printArea()
    {
       System.out.println("Area of the Rectangle is "+r*b);
    }
}
class Triangle extends shape
{
    public void printArea()
    {
        System.out.println("Area of the Triangle is "+0.5*r*b);
    }
}
class Circle extends shape
{
    public void printArea()
    {
        System.out.println("Area of the Circle is "+3.14*r*r);
    }
}

   