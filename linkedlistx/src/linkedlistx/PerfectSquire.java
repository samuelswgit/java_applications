package linkedlistx;

public class PerfectSquire {

	public PerfectSquire() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=6;
		System.out.println(Perfectnextsquere(x));

	}
	public static int Perfectnextsquere(int x)
	{
		//int squire=0;
		if(x < 0) return 0;
        int i, ans;
        for(i = 1; ; i++) {
            ans = i * i;
            if(x < ans) break;
        }
        return ans;
		
		
		//return squire;
	}
	

}
