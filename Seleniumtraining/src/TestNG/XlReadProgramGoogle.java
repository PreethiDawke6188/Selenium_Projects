package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XlReadProgramGoogle 
{
	
	public static int xlRows,xlCols;
	public static String xData[][];
	public static WebDriver myD;
	public static String vURL;
	public static String pTitle;
	public static String vSearch;
	

	public static void main(String[] args) throws Exception 
	{
		xlRead("C:/Users/PreethiDawke/OneDrive - Aureus Tech Systems/Desktop/Workspace/GoogleSearchDataFrameworks.xls");
		
		vURL="https://www.google.com/";
		
		for (int i=1;i<xlRows;i++)
		{
			
		if (xData[i][1].contains("Y") || xData[i][1].contains("y"))
		{
		vSearch=xData[i][2];	
			
		OPENAPP();
		SearchProduct();
		CaptureVerifyTitle();
		//UpdateFilePathName();
		CLOSEAPP();
		}
		}
		
		

	}
	
	public static void OPENAPP()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		myD=new ChromeDriver();
		myD.get(vURL);
		
	}
	
	public static void SearchProduct()
	{
		
		myD.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(vSearch);
		myD.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
		
	}
	
	public static void CaptureVerifyTitle()
	{
		pTitle=myD.getTitle();
		System.out.println(pTitle);
		
		if (pTitle.contains(vSearch))
		{
			System.out.println("PASS");
		}
		
		else
		{
			System.out.println("FAIL");
		}
		
		
	}
	
	/*public static void UpdateFilePathName() {
		
		
	}*/
	
	public static void CLOSEAPP()
	{
		myD.close();
	}
	
	
	
	public static void xlRead(String sPath) throws Exception
	{
		File myFile=new File(sPath);
		FileInputStream myStream=new FileInputStream(myFile);
		
		// ADD APACHE POI JAR FILE to the project
		// Link - http://www.java2s.com/Code/Jar/p/Downloadpoi39jar.htm
		
		HSSFWorkbook myWorkbook=new HSSFWorkbook(myStream);
		HSSFSheet mySheet=myWorkbook.getSheetAt(0);
		xlRows=mySheet.getLastRowNum()+1;
		xlCols=mySheet.getRow(0).getLastCellNum();
		System.out.println("Row Count is "+xlRows);
		System.out.println("Col Count is "+xlCols);
		
		//TwoD array is ROWS AND COLUMNS
		// XDATA[ROWS][COLS]
		
		xData =new String[xlRows][xlCols];
		
		// ROWS
		for (int i=0;i<xlRows;i++)
		{
			HSSFRow row=mySheet.getRow(i);
			
			//COLS
			for (short j=0;j<xlCols;j++)
			{
				HSSFCell cell=row.getCell(j);
				String value=cellToString(cell);
				xData[i][j]=value;
				System.out.print(xData[i][j]+"    ");
			}
			System.out.println();
		}
	}
	public static String cellToString(HSSFCell cell)
		{
		int type=cell.getCellType();
		Object result;
		switch(type)
		{
		case HSSFCell.CELL_TYPE_NUMERIC:
		result=cell.getNumericCellValue();
		break;
		case HSSFCell.CELL_TYPE_STRING:
		result=cell.getStringCellValue();
		break;
		case HSSFCell.CELL_TYPE_FORMULA:
		throw new RuntimeException("We cannot evaluate formula");
		case HSSFCell.CELL_TYPE_BLANK:
		result="-";
		case HSSFCell.CELL_TYPE_BOOLEAN:
		result=cell.getBooleanCellValue();
		case HSSFCell.CELL_TYPE_ERROR:
		result="This Cell has some error";
		default:
		throw new RuntimeException("We do not evaluate this data");
		}
		return result.toString();
		}
	

}

	
	


