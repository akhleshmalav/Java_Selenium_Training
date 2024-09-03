package Package1;

public class AirthmaticEquation1 {
	//(((((10+2)*2)-2)*2)/2) akhlesh malav
	
	public int sum(int a, int b)
	{
		int sumresult;
		sumresult=a+b;
		return sumresult;
	}
	
	public int sub(int p, int q)
	{
		int subresult;
		subresult=p-q;
		return subresult;
	}
	
	public int mul(int r, int s)
	{
		int mulsresult;
		mulsresult=r*s;
		return mulsresult;
	}
	
	public int div(int t, int u)
	{
		int divsresult;
		divsresult=t/u;
		return divsresult;
	}
	
	public static void main(String[] args) {
		
		int sum;
		int div;
		int sub;
		int mulp;
		AirthmaticEquation1 obj = new AirthmaticEquation1();
		sum=obj.sum(10,2);
		mulp=obj.mul(sum,2);
		sub=obj.sub(mulp,2);
		mulp=obj.mul(sub,2);
		div=obj.div(mulp,2);
		System.out.println("Final result of equation (((((10+2)*2)-2)*2)/2) = "+div);
	}


}
