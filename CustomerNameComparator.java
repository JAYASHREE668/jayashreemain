/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Jayashree
 */
import java.util.Comparator;



public class CustomerNameComparator implements Comparator<Customer> {

	@Override

	public int compare(Customer c1, Customer c2){

		

		return c1.getName().compareToIgnoreCase(c2.getName());

		

	}

	

	



}
