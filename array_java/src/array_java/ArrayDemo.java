package array_java;

public class ArrayDemo {

	public ArrayDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int [] intarray;
		
		intarray=new int[8];
		System.out.println("before adding data");
		//display(intarray);
		display(intarray);
		int [] arrtest={5, 1, 23, 21, 17, 2, 3, 9, 12};
		int tetstotal=18;
		System.out.println("WE ARE TESTING DUPLICATE");
		System.out.println(testForSum(arrtest,tetstotal));
		
		for (int x=0;x<intarray.length;x++) {
			System.out.println ("we are inputing"+x+" in memory index "+x);
			
			intarray[x]=x;
		}		
		
	      System.out.println();
	      System.out.println("after adding data");
	      display(intarray);
	      intarray[5]=10;
	      System.out.println("after updaing array"+5);
	      int value=4;
	      for(int x=0;x<intarray.length;x++) {
	    	  if (intarray[x]==value){
	    		  System.out.println(intarray[x]+ "is equal to "+value);
	      }
	      }
	      
	      
	      
		
	}
	private static void  display(int[] intarray)
    {
  	//  System.out.println("Array : [" );
  	  System.out.println("Array : [");
        for(int i = 0; i< intarray.length; i++)
        {
           // display value of element at index i. 
           System.out.print(" "+intarray[i]);
        }
        System.out.println(" ]");
        System.out.println();
       // return "sam";
     }
	/* The return type of the method is boolean

			c. The method returns true if and only if there are distinct integers i, j, k such that intArr[i] + intArr[j] + intArr[k] equals testInt.

			Test your method in a main method, which passes the following input values
			{5, 1, 23, 21, 17, 2, 3, 9, 12}, 22
			into the method testForSum, and which outputs the return value to the console.
	*/
	private static boolean testForSum(int[] arrint, int testInt) {
		boolean containint=false;
		for(int x=0;x<arrint.length;x++)
		{
			for(int y=x;y<arrint.length && y+2<arrint.length ;y++)
			{
				if(arrint[x]+arrint[y+1]+arrint[y+2]==testInt) {
					containint=true;
					break;
				}
			}
			for(int y=x;y<arrint.length && y+2<arrint.length ;y++)
			{
				if(arrint[x]+arrint[x+1]+arrint[y+2]==testInt) {
					System.out.println(" loop2");
					containint=true;
					break;
				}
			}
			
		}
		
		return containint;
		
	}

}
