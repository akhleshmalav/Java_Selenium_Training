package Package1;

public class Student {
	int rollno;
	int age;
	public void display1()
	{
		System.out.println("Welcome in automation world");
	}
	public void display2()
	{
		System.out.println("Automartion is very easy");
	}
	
	public static void main(String[] args) 
	{
		Student akkhi=new Student();
		akkhi.rollno=111;
		akkhi.age=32;
		System.out.println("My roll number:"+akkhi.rollno);
		System.out.println("My age:"+akkhi.age);
		akkhi.display1();
		akkhi.display2();
	}

}
