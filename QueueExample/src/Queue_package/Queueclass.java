package Queue_package;
import java.util.AbstractQueue;
import java.util.*; 

public class Queueclass {

	public Queueclass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> priorityqu= new PriorityQueue<String>();
		//PriorityQueue<String> queue=new PriorityQueue<String>();  
		
		priorityqu.add("am");
		priorityqu.add("m");
		priorityqu.add("sa");
		priorityqu.add("sxx");
		System.out.println("head "+priorityqu.element());
		//System.out.println("head:"+queue.element()); 
		System.out.println("head " + priorityqu.peek());  
		
      
	}

}
