package com.example.demo.task2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Application {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
		ExecutorService service =Executors.newFixedThreadPool(3);
		try {
			Callable<Integer> task= new CountNumber(10);
			
			
			service.submit(task);
			Future<Integer> responce =service.submit(task);
			//System.out.println("Is Task completed:="+responce.isDone());
		//	System.out.println("result:="+responce.get());
			while(!responce.isDone())
			{
				System.out.println("waiting to complete");
				
				TimeUnit.MILLISECONDS.sleep(1);
			//	responce.cancel(true);
				System.out.println("result:="+responce.get());
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		service.shutdown();
     
	}


}
