package linkedlistx;

public class PerfectSquire2 {

	public PerfectSquire2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nextsquire(36));

	}
	
	public static int nextsquire(int x)
	{
		int ans=0;
		if (x<0) {
			return ans;
		}
		for(int y=1;;y++) {
			ans=y*y;
			if(x<ans) {
				break;
				
			}
		}
		return ans;
		
	}

}
