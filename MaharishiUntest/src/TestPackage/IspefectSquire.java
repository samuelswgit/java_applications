package TestPackage;
import java.lang.Math;
//java.lang.Math.sqrt()

public class IspefectSquire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=36;
		
		System.out.println( IsperfectSquirem(number));
		}
	
	public static int IsperfectSquirem(int n) {
		int isperfect=0;
		if(n>=0)
		{
	      double squire =Math.sqrt(n);
	      System.out.println(Math.sqrt(n));
		 double squires=(int)squire;
		
		  System.out.println(squires); 
		 double numberx=(squires+1.0);
		 double squirex=numberx*numberx;
		 isperfect=(int)squirex;
		}
		
		return isperfect;
	}

}
