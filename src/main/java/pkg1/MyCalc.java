package pkg1;
public class MyCalc {	
	public int sum(int a, int b)
	{
		return (a+b);
	}
	public int sum2(int a, int b)
	{
		int c=3+5;
		int d;
		return c;
	}
	public static void main(String[] args) {
		
		MyCalc ob = new MyCalc();		
		System.out.println(ob.sum(10, 20));
		System.out.println(ob.sum2(10, 20));
	}
}