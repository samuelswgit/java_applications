package TestPackage;

public class PrimeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startx =-10;
		int endx =6;
		System.out.println(primeCount(startx,endx));

	}
	
	public static int primeCount(int startx,int endx)
	{
		int counts=0;
		boolean prime=false;
		if(startx<0) {
			startx=2;
		}
		for(int c=startx;c<=endx;c++)
		{
			prime=false;
			
			System.out.println("x" +c);
			for(int y=2;y<c;y++) {
				
				if(c%y==0) {
					
					prime=true;
					//break;
					
				}
				
				
			}
			if(!prime) {
				counts++;	
			}
			
			
		}
		return counts;
	}

}
