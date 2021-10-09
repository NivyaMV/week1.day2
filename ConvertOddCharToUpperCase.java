package week1.day2;

public class ConvertOddCharToUpperCase {

	public static void main(String[] args) {
		String test="changeme";
		char[] charTest= test.toCharArray();
		System.out.println(charTest);
		for(int i=0;i<charTest.length;i++) {
			if(i%2==1) 
			{
				charTest[i] = Character.toUpperCase(charTest[i]);
				System.out.println(charTest[i]);
			}
				else if(i%2==0)
				{
					System.out.println(charTest[i]);
				}
			}
		}
	}



