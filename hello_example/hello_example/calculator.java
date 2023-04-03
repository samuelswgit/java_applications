package hello_example;

import java.util.Arrays;
use Node.java;

import javax.swing.plaf.TextUI;

public class calculator {
 

	public calculator() {
		// TODO Auto-generated constructor stub
		 int	alist[] =new int[5];
		// alist[]=(1,2,3,4,5);
	}
	public void addnumber()
	{
		int [] list;
		list=new int[5];
		list=new int[] {1,2,3,4,5};
		
		
	}
	public static int[] f(int[]first ,int []second)
	{
		int [] common=new int[3];
		if( first.length==0|| second.length==0)
				return common;
		for(int i=0;i<first.length;i++)
		{
			for(int s=0;s<second.length;s++)
			{
				if(first[i]==second[s])
					common[i]=first[i];
			}
			
		}
		return common;
	}
	public static int a4(int n)
	{
		int sign=1;
		if(n==0) return 0;
		if(n<0) {
			sign=-1;
			n=-n;
		}
		int reverse=0;
		while(n !=0)
		{
			reverse=(reverse*10)+ (n%10);
			n  /=10;
		}
		return sign*reverse;
	}
	

	public static void main(String[] args) {
		 int	alist[] =new int[5];
		// alist[]=(1,2,3,4,5);
		 //you entrered the following
		 BinaryTree tree = new BinnaryTree();
		 tree.root=new Node(1);
		 tree.root.left=new Node(2);
		 tree.root.right=new Node(3);
		 tree.root.left.left=new Node(4);
		 System.out.print("\n Binary tree:" );
		 tree.traverseTree(tree.root);
		
		 for(String item: args)
		 {
		 System.out.println("you entered"+ item + "in commandline interface");
		 }
		// TODO Auto-generated method stub
		System.out.println(a4(21));
		int first[]= {1,2,4,5};
		int second[]= {1,3,4};
		System.out.println(Arrays.toString(f(first,second)));
		TextUI("enter up to 100 numbers integeeeeers entr 0 to end");
		
		for (int x=0;x<alist.length;x++)
		{
			System.out.println(alist[x]);
			
		}
		
	}
	private static void TextUI(String string) {
		// TODO Auto-generated method stub
		
	}
	     


}
