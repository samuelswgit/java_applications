package linkedlistx;

public class isTwinPairedclass {

	public isTwinPairedclass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //  int [] a={-6, 12, 1, 24, 3, 5};
        int [] a={3, 2, 1} ;
	
		System.out.println(isTwinPaired(a));
		
		//isTwinPaired
	}
	public static int isTwinPaired(int [] arraytotest)
	{
		int isTwinPaired=0;
		boolean evencheck=false;
		boolean oddnumbercheck=false;
		int [] even= new int[arraytotest.length];
		int [] oddnumber= new int[arraytotest.length];
		int even_position=0;
		int odd_position=0;
		//separate numbers into two arrays. even-valued  and odd and then test the order of the numbers
		for(int x=0;x<arraytotest.length;x++) {
			if(arraytotest[x]%2==0)
			{
				even[even_position]=(arraytotest[x]);
				even_position++;
			}
			else {
				oddnumber[odd_position]=(arraytotest[x]);
				odd_position++;
			}
		}
		for(int x=0;x<even.length-2;x++) {
			if (even[x]<even[x+1]) {
				evencheck=true;
			}
		}
		for (int y=0;y<oddnumber.length-2;y++)
		{
			if (oddnumber[y]<oddnumber[y+1]);
			{
				oddnumbercheck=true;
			}
		}
		if(oddnumbercheck==true && evencheck==true ) {
			isTwinPaired=1;	
		}
		
		return isTwinPaired;
		
	}
	
}
