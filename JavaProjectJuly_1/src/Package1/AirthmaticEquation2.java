package Package1;

public class AirthmaticEquation2 {
	//((((10/2)-2)*2)-2)+2)
	
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
		AirthmaticEquation2 obj = new AirthmaticEquation2();
		div=obj.div(10,2);
		sub=obj.sub(div,2);
		mulp=obj.mul(sub,2);
		sub=obj.sub(mulp,2);
		sum=obj.sum(sub,2);
	
		System.out.println("Final result of equation ((((10/2)-2)*2)-2)+2) is = "+sum);
	}


}
