package TestPackage;

public class IsMadhavArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arratest=	{6, 2, 4, 2, 2, 2, 1, 5, 0, 0};
		
		
		System.out.println(isMadhavArray(arratest));

	}
	
	public static boolean isMadhavArray(int [] arrayx) {
		boolean sMadhavArray=false;
		boolean sMadhavArray2=false;
		int initial_sum=arrayx[0];
		int number_of_cyle=2;
		for(int v=0;v<arrayx.length-2;v++) {
			
			int currentvalue=methodtwo(v,arrayx);
			System.out.println(currentvalue+"second"+initial_sum);
			
			if(initial_sum==currentvalue) 
			{
				sMadhavArray=true;
				//break;
			}
			else {
				sMadhavArray=false;
				break;
			}
			
			initial_sum=currentvalue;
			
			
		}
		
		return sMadhavArray; 
	}
	public static int methodtwo(int y,int [] arrayx) {
		int number=y+2;
		int currentsum=0;
		System.out.println(number+"numberxx");
		{
		 for (int h=1+y;h<=number;h++)
		 {
			 currentsum=currentsum +arrayx[h];
			 
			 System.out.println(h +"c");
			 
			 System.out.println(currentsum+"xxx"+arrayx[h]);
			 
		 }
		}
		System.out.println(currentsum+"first");
		return currentsum;
		
	}

}
