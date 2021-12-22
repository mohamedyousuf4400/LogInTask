package afterLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import logInCredit.LogInPage;

public class AfterLogInPage extends LogInPage {

	@Test
	public void DashboardPage() {
		AfterLogInPage N = new AfterLogInPage();
		N.LogInCredit();
		System.out.println("driver is " +N);

		//Admin UserName Enter
		WebElement AdminUserName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		AdminUserName.sendKeys("Admin");

		//Admin Password Enter
		WebElement AdminPassword = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		AdminPassword.sendKeys("admin123");

		//click Login
		WebElement LogInButton = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		LogInButton.click();

		WebElement ClickAdmin = driver.findElement(By.xpath("//*[text()='Admin']"));
		ClickAdmin.click();


		WebElement ClickPIM = driver.findElement(By.xpath("//*[text()='PIM']"));
		ClickPIM.click();
	}


}

