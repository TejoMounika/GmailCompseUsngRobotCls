package testDriverEmail;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Email {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kuchipudi\\Desktop\\testing\\webdrivers\\chromedriver.exe");
		WebDriver C=new ChromeDriver(); 
		
	//navigate to email
		C.navigate().to("http://www.gmail.com");
		
		//enter email id
		C.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		C.findElement(By.cssSelector("#identifierId")).sendKeys("automationselenium0@gmail.com");
		
		//click on next button
		C.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		C.findElement(By.cssSelector("#identifierNext > content")).click();
		//enter password
		C.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		C.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("selenium0");
		//click next
		C.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		C.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
		
		//click compose
		C.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		C.findElement(By.cssSelector(".aic .z0 div")).click();
		
		//enter the to mail id
		C.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		C.findElement(By.cssSelector(".oj div textarea")).sendKeys("automationselenium0@gmail.com");
		//Adding subject to email
		C.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		C.findElement(By.cssSelector(".aoD.az6 input")).sendKeys("send Email");
		//Adding body to email
		C.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		C.findElement(By.cssSelector(".Ar.Au div")).sendKeys("automation test sample");
		//click on attach icon
		C.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		C.findElement(By.cssSelector(".a1.aaA.aMZ")).click();
		
		StringSelection ss = new StringSelection("C:\\Users\\Kuchipudi\\Desktop\\testing\\fnd-agile-syllabus_ga.pdf");
	    //place string on clip board
		//upload file using RobotClass
	     //attach path where file is located
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	     Robot robot = new Robot();
	     Thread.sleep(5000);
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     robot.keyRelease(KeyEvent.VK_V);
	     Thread.sleep(6000);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	    
	     Thread.sleep(20000);
	     
	     //click on send
		
		C.findElement(By.cssSelector("tr.n1tfz td:nth-of-type(1) div div:nth-of-type(2)")).click();
		
	      
		//click on logout
		Thread.sleep(6000);
		C.findElement(By.cssSelector("#gb > div.gb_hf.gb_fg > div.gb_ib.gb_fg.gb_R.gb_eg.gb_T > div.gb_sc.gb_fg.gb_R > div.gb_fb.gb_Wc.gb_fg.gb_R > div.gb_Dc.gb_hb.gb_fg.gb_R > a")).click();
				
	    Thread.sleep(6000);
		C.findElement(By.cssSelector("#gb_71")).click();
		
		Thread.sleep(6000);
		C.close();
			
	}

}
