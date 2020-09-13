/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

//program to reverse the given String
public class Stringhandling1 {
    public static void main(String[] args)
    {
      
        //Creating a String in StringBuffer
        StringBuffer sb=new StringBuffer("Everybody");
        System.out.println("The given String is:"+sb);
       
        //to reverse the given String
        sb.reverse();
        
        //to print the reversed String
        System.out.println("The reversed order of the given String is:"+sb);
        
    }    
}
