package TestNG;

import java.util.Scanner;

import org.testng.annotations.Test;

public class biggestNumber {
	
	@Test
	public void bigestNumber() {
		System.out.println("Enter 5 numbers and hit enter after each number");
		int [] input = new int[5];
		
		for (int i=0;i<input.length;i++)
		{
		    
			@SuppressWarnings("resource")
			Scanner in = new Scanner(System.in); 
		    	input[i]  = in.nextInt();
		    
		}
		int biggestNumber=input[0];
		for (int j:input) {
			if(j>=biggestNumber) {
				biggestNumber = j;
			}
						
		}
		System.out.println("biggest number is "+biggestNumber);
}

}
