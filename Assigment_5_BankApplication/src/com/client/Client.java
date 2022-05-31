package com.client;

import com.application.MMBankFactory;
import com.application.MMCurrentAcc;
import com.application.MMSavingAcc;
import com.framework.BankFactory;
import com.framework.CurrentAcc;
import com.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		BankFactory obj=new MMBankFactory();
		SavingAcc a=new MMSavingAcc(153, "Soujan", 20000, true);
		CurrentAcc b=new MMCurrentAcc(152, "Rakshit", 5000, 500);
		System.out.println("Saving Account: ");
		a.withdraw(a.getAccBal());
		System.out.println();
		System.out.println("Current Account: ");
		b.withdraw(b.getAccBal());
		
		//System.out.println(b.getNewSavingAcc(153, "Rocky", 3000, true));
		//System.out.println(b.getNewCurrentAcc(200, "James", 50, 400));
		
		
		System.out.println(a);
		System.out.println();
		System.out.println(b);

	}

}
