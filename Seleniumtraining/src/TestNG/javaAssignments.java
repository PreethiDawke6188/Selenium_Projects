package TestNG;
import java.util.Date;
import java.util.Scanner;

import org.testng.annotations.Test;

public class javaAssignments{
	
	@Test(priority=1)
	
	public void javaVersion() {
	    System.out.println(System.getProperty("java.version"));
	    //System.out.println(System.getProperty("java.runtime.version"));
	    //System.out.println(System.getProperty("java.home"));
	    //System.out.println(System.getProperty("java.vendor"));
	    //System.out.println(System.getProperty("java.vendor.url"));
	    //System.out.println(System.getProperty("java.class.path"));
	}
	@Test(priority=2)
	public void currentDate() {

		      // Instantiate a Date object
		      Date date = new Date();

		      // display time and date using toString()
		      System.out.println(date.toString());
		   
		}
	@Test(priority=3)
	public void ispalindrome() {
		System.out.println("Enter a string");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); 
			String str= sc.nextLine();
			String reverseStr="";
			
			int strLength = str.length();

			for (int i = (strLength - 1); i >=0; --i) {
			  reverseStr = reverseStr + str.charAt(i);
			}

			if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
			  System.out.println(str + " is a Palindrome String.");
			}
			else {
			  System.out.println(str + " is not a Palindrome String.");
			}
		
	}
	@Test(priority=4)
	public void getStrAndPrintSum() {
		System.out.println("Enter 2 numbers");
		try (Scanner num = new Scanner(System.in)) {
			String number1= num.nextLine();
			String number2= num.nextLine();
			int num1 = Integer.parseInt(number1);
			int num2 = Integer.parseInt(number2);
			System.out.println(num1+num2);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	@Test(priority=5)
	public void thirdNumber() {
		
			System.out.println("Enter 5 string and hit enter after each string");
			String [] input = new String[5];
			
			for (int i=0;i<input.length;i++)
			{
			    
				@SuppressWarnings("resource")
				Scanner in = new Scanner(System.in); 
			    	input[i]  = in.nextLine();
			    
			}
			System.out.println("The third string entered is"+input[2]);
	}
}
