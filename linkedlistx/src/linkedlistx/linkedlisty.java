package linkedlistx;
import java.util.LinkedList;

public class linkedlisty {

	public linkedlisty() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> names = new LinkedList<String>();
		names.add(0,"Straight");
		names.add(1,"Bent");
		names.add(2,"Equals");
		names.add(3,"Well");
		names.add(4,"Storm");
		System.out.println(names);
		//names.find("Well");
		names.addFirst("sam");
		names.addLast("kk");
		System.out.println(names);
		
	}
	

}
