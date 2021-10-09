package week1.day2;

import java.util.Iterator;

public class LearnString {

	public static void main(String[] args) {
//initializing using Literal method
		String strTest= "Welcome to World";
		System.out.println(strTest);
		//finds length of the array
		int strlength= strTest.length();
		System.out.println(strlength);
		//finding a character in the string
		char findCharac= strTest.charAt(5);
		System.out.println(findCharac);
		//finding the index of a character
		int indexOfLetter= strTest.indexOf('o');
		System.out.println(indexOfLetter);
		//finding the last index of a character
		int lastPosition= strTest.lastIndexOf('o');
		System.out.println(lastPosition);
		//converting string to array
		System.out.println("Converted to character");
		char charArray[]= strTest.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
			
		
String[] split = strTest.split(" ");
for (int i = 0; i < split.length; i++) {
	System.out.println("split[" +i  +"]: " +split[i]);
	
}
	}

}
