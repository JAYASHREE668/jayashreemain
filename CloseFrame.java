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





public class CloseFrame extends JFrame{



	private ClosePanel closePanel;

	

	public CloseFrame(){

		super("Close an Account");

		setSize(400, 200);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		closePanel = new ClosePanel();

		this.setLocation(500, 500);

		add(closePanel);

	}

	

	public void addToAccountBox(String acct){

		closePanel.addToAccountBox(acct);

	}

	

	public boolean getClose(){

		return closePanel.getClose();

	}

	

	public void setCloseFalse(){

		closePanel.setCloseFalse();

	}

	

	public String getCloseAccount(){

		return closePanel.getCloseAccount();

	}

	

	public void setCloseClear(){

		closePanel.setCloseClear();

	}

	/*	

	public String getSelectedAccount(){

		return depositPanel.getSelectedAccount();

	}

	

	public String getDepositAmount(){

		return depositPanel.getDepositAmount();

	}

	

	public void setDepositClear(){

		depositPanel.setDepositClear();

	}

*/ 	



}
