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
import java.awt.BorderLayout;

import java.awt.ComponentOrientation;

import java.awt.GridLayout;



import javax.swing.JFrame;





public class DepositFrame extends JFrame{



	private DepositPanel depositPanel;

	

	public DepositFrame(){

		super("Make A Deposit");

		setSize(400, 200);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		depositPanel = new DepositPanel();

		this.setLocation(500, 500);

		add(depositPanel);

	}

	

	public void addToAccountBox(String acct){

		depositPanel.addToAccountBox(acct);

	}

	

	public boolean getDeposit(){

		return depositPanel.getDeposit();

	}

	

	public void setDepositFalse(){

		depositPanel.setDepositFalse();

	}

	

	public String getSelectedAccount(){

		return depositPanel.getSelectedAccount();

	}

	

	public String getDepositAmount(){

		return depositPanel.getDepositAmount();

	}

	

	public void setDepositClear(){

		depositPanel.setDepositClear();

	}

	



}


