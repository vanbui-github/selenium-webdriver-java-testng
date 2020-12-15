package api;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_02_Xpath_Css_HTML_Part_I {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://alada.vn/tai-khoan/dang-ky.html");
	}

	@Test
	public void TC_01_ValidateCurrentUrl() throws InterruptedException {
		//Hiểu dc HTML của 1 element
		//Tại sao lại phải bắt element
		//Bắt xong rồi làm gì thao tác ntn
		//Thao tác với ĐĂNG KÝ button
		driver.findElement(By.xpath("//form[@id='frmLogin']//button[text()='ĐĂNG KÝ']")).click();
				
		//driver: đại diện cho Selenium Webdriver - gọi thư viện ra để sử dụng
		Thread.sleep(3000);
		// cách 1: thêm throws exception vào hàm khi dùng Thread
		// cách 2: tự throw với chỗ call Thread
		
		//Nhập vào textbox HỌ TÊN
		driver.findElement(By.cssSelector("input[name='txtFirstname']")).sendKeys("Automation FC");
		Thread.sleep(3000);
		
		//Nhập vào textbox PASSWORD
		driver.findElement(By.id("txtPassword")).sendKeys("123456789");
		Thread.sleep(3000);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
