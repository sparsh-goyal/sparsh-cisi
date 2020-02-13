package com.cisi.CompoundInterest;

public class CI {

	public double calcCI(double principle,double roi,double time)
	{
		return principle * Math.pow(1.0+roi/100.0, time);
	}		
}
