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
 
//program for booking cab

class NewClass1 extends Thread {
     public void run()
     {
         System.out.println("WELCOME");
         System.out.println("start booking");
         System.out.println("searching for the nearest cab");
         System.out.println("waiting for booking...");       
         System.out.println("your cab is booked!!!");
     }
    
     public static void main(String args[]){
         NewClass1 obj=new NewClass1();
         obj.start();
         
     }
     
}
