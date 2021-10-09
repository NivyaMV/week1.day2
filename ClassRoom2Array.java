package week1.day2;

import java.util.Arrays;


public class ClassRoom2Array {

	public static void main(String[] args) {
		int [] Arr= {10,49,39,34,1,8}; //initializing
		int length = Arr.length;
		System.out.println("The Length of the Array is: " +length);

		System.out.println("All the elements of the array is");
		for(int i=0;i<Arr.length;i++) {
			System.out.println(Arr[i]);
		}

		Arrays.sort(Arr);
		System.out.println("The Sorted Output is ");
		for(int i=0;i<Arr.length;i++) {
			
			System.out.println(Arr[i]);
		}
			System.out.println("The Second Largest Number is");
			System.out.println(Arr[length-2]);
			System.out.println("The Second Smallest Number is");
			System.out.println(Arr[1]);
		}
	
	}

