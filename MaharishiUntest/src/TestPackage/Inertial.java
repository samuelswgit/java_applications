package TestPackage;

public class Inertial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arrx={-2, -4, -6, -8, -11};
		System.out.println(inertial(arrx));

	}
	public static Boolean inertial(int [] arra)
	{
		Boolean inertial=false;
		boolean condation1=false;
		boolean maximum_value=false;
		boolean t911greater=false;
		int maxnumber=0;
		int arraysize=arra.length;
		int [] even_numbers=new int[arraysize];
	//	int[] num= new int[5]; 
		int  i=0;
		//condation one it must have odd value divisble by two
		for(int x=0;x<arra.length;x++) {
			if(arra[x]%2==0)
			{
				condation1=true;
			}
			if(arra[x]>maxnumber) {
				maxnumber=arra[x];
			}
			//create even numbers array numbers less than 20
			if(arra[x]<20) {
				if(arra[x]<0 && arra[x]%2==0){
					even_numbers[i]=arra[x];
					i++;
				}
			}
			
				
		}
		if(maxnumber==20) {
			maximum_value=true;
			
		}
		for(int j=0;j<even_numbers.length;j++)
		{
			if (9>even_numbers[j]&& 11>even_numbers[j])
			{
				t911greater=true;	
			}
		}
	inertial=t911greater && maximum_value && condation1;
		
		
		
		return inertial;
		
		
	}

}
