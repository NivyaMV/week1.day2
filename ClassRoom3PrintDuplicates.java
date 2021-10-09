package week1.day2;

import java.util.Arrays;

public class ClassRoom3PrintDuplicates 
{

	public static void main(String[] args) 
	{
		int[] Arr = {12,10,15,28,12,48,68,28,95,78,57,28,16,12};
		int length=Arr.length;
		System.out.println("The length of the Array is " +length);
		Arrays.sort(Arr);
		System.out.println("The Duplicate elements in the array are ");
		for(int i=0;i<Arr.length;i++) 
		{
			for(int j=1+i;j<Arr.length;j++) 
			{
				if(Arr[i]==Arr[j]) 
				{
					System.out.println(Arr[i]+ " has a Duplicate");
				}
			}
		}
	}
}


