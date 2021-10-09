package week1.day2;

public class Calculator 
{
	public int add(int num1, int num2, int num3) 
	{
		int sum;
		sum=num1+num2+num3;
		System.out.println("The Added value is " +sum);
		return sum;		
	}
	public  int sub(int num1, int num2) 
	{
		int sub;
		sub=num1-num2;
		System.out.println("The Subtracted value is " + sub);
		return sub;	
	}

	public  double mul(double num1, double num2) 
	{
		double mul;
		mul=num1*num2;
		System.out.println("The Multiplied value is " +mul);
		return mul;
	}
	public  float divide(float num1, float num2) 
	{
		float divide;
		divide=num1/num2;
		System.out.println("The Divided value is " +divide);
		return divide;	
	}
	public static void main(String[] args) 
	{
		System.out.println("This is a Calculator");
	}
}
