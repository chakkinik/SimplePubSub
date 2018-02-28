package pubSub;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class pubSubRegistryImpl {
	
	
	Map<String, Set<Subscriber>> subscribersTopicMap = new HashMap<String, Set<Subscriber>>();
 	
	Queue<Message> MessageQ = new LinkedList<Message>();
	
	
	
	
	
	
	// addmessageToQueue
	
	public void addMsgQueue(Message msg){
		
		MessageQ.add(msg);
	}
	
	
	//register To subscriber
	
	public void registerSubscriber(String topic, Subscriber s) {
		
		if(subscribersTopicMap.containsKey(topic)){
			
			 Set<Subscriber> subscriber = subscribersTopicMap.get(topic);
			 
			 subscriber.add(s);
			 
			 subscribersTopicMap.put(topic,subscriber);
			
		} else {
			
			Set<Subscriber> subscriber = new HashSet<Subscriber>();
			subscriber.add(s);
			subscribersTopicMap.put(topic, subscriber);
		}
	}
	
	
	public void unregisterSub(String topic, Subscriber s){
		
		if(subscribersTopicMap.containsKey(topic)) {
			
			Set<Subscriber> subscriber = subscribersTopicMap.get(topic);
			
			subscriber.remove(s);
			
			subscribersTopicMap.put(topic, subscriber);
			
		}
		
			
	}
	
	
	public void broadCast() {
		
		if(!MessageQ.isEmpty()) {
			
			
			
			
			
		}
		
		
		
		
	}
	
	
}
