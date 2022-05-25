package com.cg.application;

import com.cg.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc
{

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried)
	{
		super(accNo, accNm, accBal, isSalaried);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() 
	{
		return String.format("MMSavingAcc [toString()=%s]", super.toString());
	}
	

}
