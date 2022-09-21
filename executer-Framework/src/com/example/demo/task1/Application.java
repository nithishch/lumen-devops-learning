package com.example.demo.task1;
import java.util.concurrent.*;




public class Application {
	public static void usingFixedThreadExecutor()
	{
		//// when using fixedthread random task will be assigned to the random thread 
		
		
		int processorCount =Runtime.getRuntime().availableProcessors();
		ExecutorService service=Executors.newFixedThreadPool(processorCount);
		UsingPrintString[] tasks=
			{
					new UsingPrintString("Idly","Sambar"),
					new UsingPrintString("Pizza","coke"),
					new UsingPrintString("Partha","Achar"),
					new UsingPrintString("vada","chutney")
			};
		for(UsingPrintString eachTask:tasks)
		{
			service.submit(eachTask);
		}
		
      service.shutdown();
		
		
	}
	
	
	
	public static void usingSingleThreadExecutor()
	{
		
		//when using the single thread executor sequentially the
		//tasks will be assigned to the single thread
		ExecutorService service=Executors.newSingleThreadExecutor();
		UsingPrintString[] tasks=
			{
					new UsingPrintString("Idly","Sambar"),
					new UsingPrintString("Pizza","coke"),
					new UsingPrintString("Partha","Achar")
					
					
			};
		for(UsingPrintString eachTask:tasks)
		{
			service.submit(eachTask);
		}
		
      service.shutdown();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
          // usingFixedThreadExecutor();
            usingSingleThreadExecutor();
	}
}
