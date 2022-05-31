package com.framework;

public abstract class CurrentAcc extends BankAcc {
	private final float MINIBAL;
	
	/**
	 * 
	 */
	public CurrentAcc(int accNo, String accNm, float accBal,float MINIBAL) {
		//this.creditLimit = creditLimit2;
		super(accNo,accNm,accBal);
		this.MINIBAL=MINIBAL;
		// TODO Auto-generated constructor stub
	}

	public void withdraw (float accBal) 
	{
		System.out.println("Account no: "+this.getAccNo()+"\n "+" Account name: "+this.getAccNm()+ "\n "+"Account Balance: "+(accBal+MINIBAL));
	}
	@Override
	public String toString() {
		return String.format("CurrentAcc [MINBAL=%s, toString()=%s]", MINIBAL,super.toString());
	}

	public char[] getNewCurrentAcc(int i, String string, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] getNewSavingAcc(int i, String string, int j, boolean b) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
