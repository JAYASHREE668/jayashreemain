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
public class Sav_Acct extends Account implements java.io.Serializable{

	private double interest_rate;

	

	public Sav_Acct(int Account_Number, int total_accounts){

		

		super(Account_Number, total_accounts);

			interest_rate = 5;

		

			



		

		

	}

	

	void getInterest(){

		System.out.println("Interest Rate: " + interest_rate);

		

	}

	



	



}

