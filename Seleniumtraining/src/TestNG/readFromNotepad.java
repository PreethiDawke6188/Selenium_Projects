package TestNG;

import java.io.*;

public class readFromNotepad {
	
	public static void main(String[] args) throws Exception
    {
 
        // File path is passed as parameter
        File file = new File(
            "C:\\Users\\PreethiDawke\\OneDrive - Aureus Tech Systems\\Desktop\\Selenium_screenshots\\notepad.txt");
 
        // Note:  Double backquote is to avoid compiler
        // interpret words
        // like \test as \t (ie. as a escape sequence)
 
        // Creating an object of BufferedReader class
        @SuppressWarnings("resource")
		BufferedReader br
            = new BufferedReader(new FileReader(file));
 
        // Declaring a string variable
        String st;
        // Condition holds true till
        // there is character in a string
        while ((st = br.readLine()) != null)
 
            // Print the string
            System.out.println(st);
    }
}


