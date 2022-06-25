package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	@FindBy(xpath="//span[@class='user-id']")	private WebElement actPN;


	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}



	//method with string return type 
	public String getKiteHomePageProfileName()
	{
		String actProfileName = actPN.getText();
		return actProfileName;
	}



	//public void verifyKiteHomePageProfileName(String expProfileName) 
	//{
//		String actProfileName = actPN.getText();	
	//	
//		if(actProfileName.equals(expProfileName)) 
//		{
//			System.out.println("Pass");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}
	//}


	}
