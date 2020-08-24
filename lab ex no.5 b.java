/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance1;

public class NewClass {
    public static void main(String[] args)
    {
        Degree obj=new Degree();
        obj.getDegree();
        Undergraduate obj1=new Undergraduate();
        obj1.Undergraduate();
        Postgraduate obj2=new Postgraduate();
        obj2.Postgraduate();
    }
   
}
 class Degree
    {
        public void getDegree()
        {
            System.out.println("I got a degree");
        }
    }
class Undergraduate 
{
    public void Undergraduate()
    {
        System.out.println("I am an Undergraduate");
    }
}
class Postgraduate
{
    public void Postgraduate()
    {
        System.out.println("I am a Postgraduate");
    }
}