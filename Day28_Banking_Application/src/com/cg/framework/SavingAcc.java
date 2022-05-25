package com.cg.framework;

public abstract class SavingAcc extends BankAcc 
{
	private boolean isSalaried ;
   static final private float  creditLimit=0.0f;

	public SavingAcc(int accNo, String accNm, float accBal,boolean isSalaried) 
	{
		super(accNo, accNm, accBal);
		this.isSalaried=isSalaried;
	}
		
	public void withdraw(float accBal)
		{
		System.out.println("Account Num Is = :" +this.getAccNo()+"Account Name Is =:"+this.getAccNm()+" "+"accBal is :"+accBal);
		}              
	

	@Override
	public String toString() 
	{
		return String.format("SavingAcc [isSalaried=%s,toString=%s]", isSalaried,super.toString());
	}

}
