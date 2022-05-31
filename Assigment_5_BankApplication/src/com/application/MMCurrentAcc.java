package com.application;

import com.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc
{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float MINIBAL) {
		super(accNo, accNm, accBal, MINIBAL);
		// TODO Auto-generated constructor stub
	}

		@Override
	public String toString() {
		return String.format("MMCurrentAcc [toString()=%s]", super.toString());
	}

		@Override
		public void deposite(float accBal) {
			// TODO Auto-generated method stub
			
		}

}
