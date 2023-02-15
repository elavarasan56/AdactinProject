package adactin.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class adactin {
		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("Webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\com.Javaa\\Drives\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://adactinhotelapp.com/index.php");
			
			driver.findElement(By.id("username")).sendKeys("dhanushkodi");
			driver.findElement(By.id("password")).sendKeys("Ela143va@");
			driver.findElement(By.id("login")).click();
			
			Thread.sleep(2000);
			
			WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
			Select l = new Select(location);
			l.selectByIndex(7);
			Thread.sleep(2000);
			WebElement Hotels = driver.findElement(By.id("hotels"));
			Select H = new Select(Hotels);
			H.selectByValue("Hotel Sunshine");
			Thread.sleep(2000);
			WebElement Room = driver.findElement(By.id("room_type"));
			Select r = new Select(Room);
			r.selectByVisibleText("Deluxe");
			Thread.sleep(2000);
			WebElement id = driver.findElement(By.id("room_nos"));
			Select f = new Select(id);
			f.selectByIndex(1);
			WebElement date = driver.findElement(By.id("datepick_in"));
			date.clear();
			driver.findElement(By.id("datepick_in")).sendKeys("02/02/2023");
			WebElement out = driver.findElement(By.id("datepick_out"));
			out.clear();
			driver.findElement(By.id("datepick_out")).sendKeys("14/02/2023");
			Thread.sleep(2000);	
			WebElement ad = driver.findElement(By.id("adult_room"));
			Select sc =new Select(ad);
			sc.selectByIndex(2);
			WebElement ch = driver.findElement(By.id("child_room"));
			Select c = new Select(ch);
			c.selectByIndex(3);
			driver.findElement(By.xpath("//input[@name='Submit']")).click();
			driver.findElement(By.id("radiobutton_0")).click();
			driver.findElement(By.id("continue")).click();
			
			driver.findElement(By.id("first_name")).sendKeys("Elava");
			driver.findElement(By.id("last_name")).sendKeys("Logu");
			driver.findElement(By.id("address")).sendKeys("6/18 108th st muthamizh nagar");
			
			driver.findElement(By.xpath("(//input[@class='reg_input'])[3]")).sendKeys("6545768901546789");
			
			WebElement cc = driver.findElement(By.id("cc_type"));
			Select F = new Select(cc);
			F.selectByIndex(3);
			
			WebElement d = driver.findElement(By.id("cc_exp_month"));
			Select g = new Select(d);
			g.selectByIndex(11);
			
			WebElement yy = driver.findElement(By.id("cc_exp_year"));
			Select u = new Select(yy);
			u.selectByIndex(5);
			
		    driver.findElement(By.id("cc_cvv")).sendKeys("87654362787654");
		    
		    driver.findElement(By.id("book_now")).click();
		    
			
			
			
		}

	}



