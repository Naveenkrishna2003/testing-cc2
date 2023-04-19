package cc2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class NewTest {
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver;
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  driver=new ChromeDriver(co);
	  
	  driver.navigate().to("https://www.yatra.com/");
	  
	  driver.manage().window().maximize();
	  
	  WebElement flight=driver.findElement(By.xpath("//*[@id=\"booking_engine_flights\"]/div"));
	  flight.click();
	  
	  WebElement depart_from=driver.findElement(By.xpath("//*[@id=\"BE_flight_origin_city\"]"));
	  depart_from.sendKeys("n");
	  
	  WebElement depart_from1=driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[1]/div[2]/ul/li[1]/ul/li[1]/div/div/ul/div/div/div/li[1]"));
	  depart_from1.click();	
	  
//	  WebElement back1=driver.findElement(By.xpath(""));
//	  back1.click();
	  
	  WebElement going_to=driver.findElement(By.xpath("//*[@id=\"BE_flight_arrival_city\"]"));
	  going_to.sendKeys("m");
	  

	  WebElement going_to1=driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[1]/div[2]/ul/li[1]/ul/li[1]/div/div/ul/div/div/div/li[1]"));
	  going_to1.click();
	  
	  WebElement date=driver.findElement(By.xpath("//*[@id=\"BE_flight_origin_date\"]"));
	  date.click();
	  
	  WebElement date1=driver.findElement(By.xpath("//*[@id=\"21/04/2023\"]"));
	  date1.click();
	  
	  WebElement back=driver.findElement(By.xpath("//*[@id=\"booking_engine_modues\"]/div/div[3]/div/i"));
	  back.click();
	  
	  WebElement tc=driver.findElement(By.xpath("//*[@id=\"BE_flight_paxInfoBox\"]/span"));
	  tc.click();
	  
	  WebElement add=driver.findElement(By.xpath("//*[@id=\"BE_flight_passengerBox\"]/div[1]/div[1]/div/div/span[2]"));
	  add.click();
	  
	  WebElement business=driver.findElement(By.xpath("//*[@id=\"BE_flight_passengerBox\"]/div[1]/div[1]/div/div/span[2]"));
	  business.click();
	  
	  WebElement nsf=driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[3]/div[1]/div[1]/a/i"));
	  nsf.click();
	  
	  WebElement search=driver.findElement(By.xpath("//*[@id=\"BE_flight_flsearch_btn\"]"));
	  search.click();
	  

}
}