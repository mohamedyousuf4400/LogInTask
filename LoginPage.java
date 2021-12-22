package logInCredit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class  LogInPage  {


	public static WebDriver driver ;
	public LogInPage(){ driver = new ChromeDriver(); }

	//public static void main(String[] args) {

	public void LogInCredit() {


		//Open ChromeDriver	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println("url is"+driver);

		

	}

}



