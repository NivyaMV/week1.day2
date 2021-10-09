package week1.day2;

public class MyMobile {

	String shape;
	String colour;
	short mobileCost;
	double phoneNumber;
	byte weight;
	
public void phoneSpec()
{
	shape ="Rectangle";
	colour="Blue";
	weight= 50;
	System.out.println("The Shape of the Mobile is " +shape);
	System.out.println("The Coulur of the Mobile is "+ colour);
	System.out.println("The Weight of the Mobile is "+ weight);
}
private void payBills()
{
	mobileCost=30000;
	System.out.println("Mobile cost would be paid as " + mobileCost);
}

public void makingCalls()
{
	phoneNumber= 98409;
	System.out.println("The Mobile number to make call is " + phoneNumber);

}
public static void main(String[] args) 
{
	MyMobile obj = new MyMobile();
	obj.phoneSpec();
	obj.makingCalls();
	
	
	}

	
}
