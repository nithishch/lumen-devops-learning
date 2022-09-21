package com.example.demo.task2;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class CountNumber implements Callable<Integer> {
	private int countTo;
	
	public CountNumber(int countTo)
	{
		super();
		this.countTo=countTo;
	}

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		
		int total=0;
		for(int idx=0;idx<=10;idx++)
		{
			total+=idx;
		}
		
		TimeUnit.MILLISECONDS.sleep(2000);
		return total;
	}
	

}
