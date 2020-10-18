/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Jayashree
 */
public class NewClass3 {
     public static void main(String[] args) {

        // TODO code application logic here

        Integer num[] = {2, 5, 3, 7, 5 };

        Character ch[] = {'j', 'a', 'y', 'u' };

        Float fnum[]={1.9f,3.6f,4.4f,5.4f,6.4f};

        Double dnum[]={6.44,51.43,83.0,0.83};

        

        generic<Integer>obj1=new generic<>(num);

        System.out.println("Integer minimum :"+obj1.min());

        System.out.println("Integer maximum :"+obj1.max());

        

        generic<Character>obj2=new generic<>(ch);

        System.out.println("character minimum :"+obj2.min());

        System.out.println("character maximum :"+obj2.max());

        

        generic<Float>obj3=new generic<>(fnum);

        System.out.println("Float minimum :"+obj3.min());

        System.out.println("Float maximum :"+obj3.max());

        

        generic<Double>obj4=new generic<>(dnum);

        System.out.println("Double minimum :"+obj4.min());

        System.out.println("Double maximum :"+obj4.max());

        

    }

    

}





class generic<T extends Comparable<T>>{

 T[] vals;

 generic(T[] array) {

     vals = array; 

 }

 

 public T min() {

 T v = vals[0];

 for(int i=1; i < vals.length; i++){

     if(vals[i].compareTo(v) < 0) 

         v = vals[i];

 }

 

 return v;

 }

 

 public T max() {

 T v = vals[0];

 for(int i=1; i < vals.length; i++){

 if(vals[i].compareTo(v) > 0)

     v = vals[i];

 }

 return v;

 }

 

 

}



