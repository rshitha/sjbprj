package sjb.timecomplexity;   

public class DemoRecursion {
	public static int fact(int n)
	{
//  	int f=1;
//		for(int i=1;i<n;i++) 
//		{
//			f=f*i;
//		}
//		return f;
		if(n==0||n==1)//base case
			return 1;
		return n*fact(n-1);//recursive case
	}

	public static void main(String[] args) {
		System.out.println(fact(4));

	}

}
