package Package1;

public class ConstructorExample {
	
	public ConstructorExample() 
	{
		System.out.println("Default constructor");
	}
	
	public ConstructorExample(int a) 
	{
		System.out.println("One Parameterized  constructor");
	}
	
	public ConstructorExample(int a, int b) 
	{
		System.out.println("Two Parameterized  constructor");
	}
	
	public ConstructorExample(int a,int b, int c) 
	{
		System.out.println("Three Parameterized  constructor");
	}
	
	public static void main(String[] args) 
	{
 		System.out.println("main method");
		ConstructorExample obj=new ConstructorExample(1,2,3);
	}

}
