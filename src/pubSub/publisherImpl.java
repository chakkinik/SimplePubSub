package pubSub;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class publisherImpl implements publisher {

	// have executor which trigger
	
	private String topicName;
	
	  public final ScheduledExecutorService sche = Executors.newScheduledThreadPool(10);
	  
	 
	  
	  public publisherImpl(String topicName) {
		  
		  this.topicName =topicName;
	}
	  
	public void publish() {
		// publisher should publish the message at certain frequency
		
		new publishTask();
		
		
	}
	
	


}

class publishTask implements Runnable
{

	@Override
	public void run() {
		
		//generate random number
		
		 Math.random();
		
		
		
	}
	
}

