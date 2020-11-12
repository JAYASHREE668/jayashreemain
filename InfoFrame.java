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





public class InfoFrame extends JFrame{



	private InfoPanel infoPanel;

	

	public InfoFrame(){

		super("Customer Info");

		setSize(530, 280);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		infoPanel = new InfoPanel();

		this.setLocation(500, 500);

		add(infoPanel);

	}



	public void addToDisplay(String info){

		infoPanel.addToDisplay(info);

	}

	

	public boolean getBack(){

		return infoPanel.getBack();

	}

	

	public void setBackFalse(){

		infoPanel.setBackFalse();

	}

	

	public void clearDisplay(){

		infoPanel.clearDisplay();

	}

/*	public void addToAccountBox(String acct){

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

*/	



}
