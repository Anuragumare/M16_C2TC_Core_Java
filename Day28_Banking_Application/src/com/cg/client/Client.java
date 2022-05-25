package com.cg.client;

import java.util.Scanner;

import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class Client {

	public static void main(String[] args) 
	{
		 BankFactory s=new MMBankFactory();
		Object obj=s.getNewSavingAcc(11, "Anurag", 14000, false);
		 System.out.println(obj);
		// SavingAcc n=new MMSavingAcc(101, "Akki", 10000f, true);
		// CurrentAcc c1= new MMCurrentAcc(102,"Vipul", 10000, 20000);
		// System.out.println("Saving Account");
		// n.withdraw(1000);
	//	 System.out.println("Current Account");
		// c1.withdraw(2000);c1.getAccBal();
		// System.out.println(s.getNewSavingAcc(103, "Pratik", 15000, false));
		// System.out.println(s.getNewCurrentAcc(103, "Prajval", 20000, 23000f));
		// System.out.println(n);
		// System.out.println(c1);
		
		
	}

}
