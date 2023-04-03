package BubbleSort;

public class BubbleSort {

	public BubbleSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] sortme= {12,4,7,-12,4,-5,18,55};
		for(int lastunsorted=sortme.length-1;lastunsorted>0;lastunsorted--)
		{ 
		for(int x=0;x<lastunsorted;x++) {
			
			if(sortme[x]>sortme[x+1])
			{
				sort(sortme,x, x+1);

	     }
		}
		}
		
		
		for(int h=0;h<sortme.length;h++) {
			System.out.print(sortme[h]+",");
		}
		
		
	}
	
	public static int [] sort(int [] sam,int x,int y) {
	 
		if(x==y) {
			return sam;
			
		}
		if(sam[x]>sam[y])
		{
			int temp=sam[y];
			sam[y]=sam[x];
			sam [x]=temp;
		}
		
		return sam;
		
	}

}
