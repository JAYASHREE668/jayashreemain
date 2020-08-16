/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package1.subpackage;


import java.util.Scanner;
public class NewClass {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the time in hours:");
        int hrs=scan.nextInt();
        int min=hrs*60;
        int sec=min*60;
        System.out.println(min+" minutes");
        System.out.println(sec+" seconds");
        
        
    }
}

