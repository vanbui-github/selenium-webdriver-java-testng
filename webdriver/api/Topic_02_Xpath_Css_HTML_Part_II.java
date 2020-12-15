package api;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Topic_02_Xpath_Css_HTML_Part_II {
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
			
		driver.get("http://live.demoguru99.com/index.php/customer/account/login/");
	  }
	  
	@Test
	public void TC_01_ID() throws InterruptedException {
		//Nhanh
		driver.findElement(By.id("email")).sendKeys("automationtest@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456");
		
		Thread.sleep(3000);
	}
	@Test
	public void TC_02_Class() throws InterruptedException {
		//Nhanh
		// chỉ lấy phần đầu class name tới trước khoảng trắng, class="input-text required-entry validate-password"
		driver.findElement(By.className("validate-password")).sendKeys("123456");
		driver.findElement(By.className("account-login")).isDisplayed();
		
		Thread.sleep(3000);
	}
	@Test
	public void TC_03_Name() throws InterruptedException{
		//Nhanh
		driver.findElement(By.name("login[username]")).sendKeys("");
		
		Thread.sleep(3000);
	}
	@Test
	public void TC_04_Tagname() throws InterruptedException{
		//thẻ HTML: dùng khi count các thẻ
		System.out.println("Tong so link tren trang" + driver.findElements(By.tagName("a"))); //gõ sysout và ctrl + space để ra nguyên câu system.out.println()
		
		Thread.sleep(3000);
	}
	@Test
	public void TC_05_LinkText() throws InterruptedException{
		//text của link tuyệt đối (toàn bộ chuỗi)
		//ít dùng
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(3000);
	}
	@Test
	public void TC_06_PartialLinkText() throws InterruptedException{
		//text của link tương đối (1 phần chuỗi)
		//ít dùng
		
		Thread.sleep(3000);
	}
	@Test
	public void TC_07_Css_selector() throws InterruptedException{
		//Synxtax: tagname[attribute=''], có thể kết hợp với ký tự đặc biệt
		//Nhanh. Đã bao hàm 6 phần trên
		//# = id. EX: #id_email
		//. = class, nếu class có mấy phần thì thêm . mấy phần. EX: .validate-password
		//Dùng Mobile
		//Không dùng dc với Text()
		
		driver.get("https://login.ubuntu.com/");		
		
		driver.findElement(By.cssSelector("input[id='id_email']")).sendKeys("automationfc@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='id_email']")).clear();
		
		driver.findElement(By.cssSelector("input[placeholder='Your email address']")).sendKeys("automationfc@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder='Your email address']")).clear();	
	}
	@Test
	public void TC_08_Xpath() throws InterruptedException{
		//Syntax: //tagname[@attribute='']
		//Chậm hơn. Đã bao hàm 7 phần trên
		//Usage: đi từ các hướng vẫn ok. Ko phải top down
		//Dùng build FW. Dùng web
		//Có thể dùng hàm
		//Dynamic locator
		
		driver.findElement(By.xpath("//form[@id='login-form']//input[@id='id_email']")).sendKeys("test1@gmail.com");
		sleepInSecond(3);
		driver.findElement(By.xpath("//form[@id='login-form']//input[@id='id_email']")).clear();
		
		//anh em
		driver.findElement(By.xpath("//label[@for='id_email']/following-sibling::input")).sendKeys("test2@gmail.com");
		sleepInSecond(3);
		driver.findElement(By.xpath("//label[@for='id_email']/following-sibling::input")).clear();
	}
	
	public void sleepInSecond (long time) {
		try {
			Thread.sleep(time * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  
	@AfterClass
	public void afterClass() {
	  
	}
}
