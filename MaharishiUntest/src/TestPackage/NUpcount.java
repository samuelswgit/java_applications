package TestPackage;

public class NUpcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] arrayv= {2,3,1,-6,8,-3,-1,2};
		int [] arrayv= {6,3,1};
		
		
		
		int n=6;
		System.out.println(nupcount(arrayv,n));

	}
	
	public static int nupcount(int [] arrayx,int n)	
	{
		int countx=0;
		int previoustotal=0;
		int currenttotal=0;
		for(int c=0;c<arrayx.length;c++)
		{
			currenttotal=currenttotal+arrayx[c];
			System.out.println(previoustotal+"-"+currenttotal+"xxxx");
			if(previoustotal<=n && currenttotal>n ) {
				System.out.println("am in");
				countx++;
				System.out.println(previoustotal+"-"+currenttotal);
			}
			previoustotal=currenttotal;
			
		}
		
		
		
		
		return countx;
	}

}
