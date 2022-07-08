package TestNG;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.testng.annotations.Test;

public class PrintThirdString {
	@Test(priority=1)
	public void third() {
		
			System.out.println("Enter 5 string and hit enter after each string");
			String [] input = new String[5];
			
			for (int i=0;i<input.length;i++)
			{
			    
				@SuppressWarnings("resource")
				Scanner in = new Scanner(System.in); 
			    	input[i]  = in.nextLine();
			    
			}
			System.out.println("The third string entered is "+input[2]);
	}

	@Test(priority=2)
	public void StringToUpper() {
		String lower= "given string is lowercase";
		String upper=lower.toUpperCase();
		System.out.println(upper);
		
	}
	
	@Test(priority=3)
	public void insertinList() {
		List<String> items = new ArrayList<String>();
				items.add("first");
				items.add("Second");
				items.add("Third");
				items.add("Fourth");
				items.add("fifth");
				items.add("sixth");
				items.add(0, "New first");
				System.out.println(items);				
		
	}
	@Test(priority=4)
	public void star() {
		int i, j;
		System.out.println("Enter the number of rows: ");
		Scanner rowsToBeSeen = new Scanner(System.in);
		int rows = rowsToBeSeen.nextInt();
		   for (i = 1; i <= rows; ++i) {
		      for (j = 1; j <= i; ++j) {
		    	  System.out.print("* ");
		      }
		      System.out.println();
		   }
		   
	}
	@Test(priority=5)
	public void multiplication() {
		int i;
		System.out.println("enter first number");
		int second = 5;
		   for (i = 1; i <= 20; i++) {
		      System.out.println(i+"*"+second+" = "+(i*second));
		      
		   }
		   
	}
}
