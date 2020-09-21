package PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PQueueDemo {
	
	public static void main(String[] args) {
		
		
		  Queue<Person> queue=new PriorityQueue<>();
		  
		  queue.add(new Person("Nikhil",22));
		  queue.add(new Person("Ajay",38));
		  queue.add(new Person("Vijay",32)); 
		  queue.add(new Person("Pushpa",24));
		  
		  while(queue.peek()!=null) { 
			   System.out.println(queue.poll());//retrieve items 
		  }
 }
}


