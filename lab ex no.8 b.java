/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

//program to print the first non repeated character in a string
import java.util.*;
public class StringHandling2 {
    public static void main(String[] args){
        String str1="monkeymonk";
        System.out.println("THe given String is:"+ str1);
        for(int i=0;i<str1.length();i++){
            boolean unique=true;
            for(int j=0;j<str1.length();j++){
                if(i!=j&&str1.charAt(i)==str1.charAt(j)){
                    unique=false;
                    break;
                }
            }
            if(unique){
                System.out.println("The first non repeated character in the given string is:"+str1.charAt(i));
                break;
            }
                   
            
        }
        
        
    }
    
}
