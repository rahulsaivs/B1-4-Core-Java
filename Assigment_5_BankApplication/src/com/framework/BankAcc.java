package com.framework;

public abstract class BankAcc {
	private int accNo;
	private String accNm;
	private float accBal;
	
	/**
	 * @param accNo
	 * @param accNm
	 * @param accBal
	 */
	public BankAcc(int accNo, String accNm, float accBal) {
		
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	public  abstract void withdraw(float accBal);
	public abstract void deposite(float accBal);
	{
		System.out.println(accBal);
	}
	public int getAccNo() {
		return accNo;
	}
	
	public String getAccNm() {
		return accNm;
	}
	
	public float getAccBal() {
		return accBal;
	}
	public float getAccBal1() {
		return accBal;
	}
	@Override
	public String toString() {
		return String.format("BankAcc [accNo=%s, accNm=%s, accBal=%s]", accNo, accNm, accBal);
	}
	
	
}
