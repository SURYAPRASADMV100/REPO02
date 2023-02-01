package projectInvoiceNinja;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class General_Actions {
	
	WebDriver sp;
	Demowebshopelements_Address dr;
	
	SoftAssert sassert=new SoftAssert();
	// @Test(groups = "smoke")
	
 	//public void login() {
 		String expectedurl = "https://demowebshop.tricentis.com/";
 		String expectedemailname ="suryaprasadmv135@gmail.com";
 		String expectedpasswordname="Newsales@11";
 		String expectedproductname = "Build your own cheap computer";
        String expectedproductcategory = "Desktops";
        
        
      //  @Test(groups = "smoke",priority = 1)
        public void login() {
 		
		sp=new ChromeDriver();
		sp.manage().window().maximize();
		sp.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		WebDriverWait explicitwait=new WebDriverWait(sp, 15);
		sp.get("https://demowebshop.tricentis.com/");
		String actualresult = sp.getCurrentUrl();
		assertEquals(expectedurl, actualresult);
		 
		
		
		dr=new Demowebshopelements_Address(sp);
		dr.getLoginlink().click();
		dr.getEmailtextbox().sendKeys("suryaprasadmv135@gmail.com");
		String actualemailname = dr.getEmailtextbox().getText();
		sassert.assertEquals(expectedemailname, actualemailname);
		
		dr.getPasswordtextbox().sendKeys("Newsales@11");
		String actualpasswordname = dr.getPasswordtextbox().getText();
		sassert.assertEquals(expectedpasswordname, actualpasswordname);
		
		
		dr.getLoginbutton().click();
		System.out.println("login was successful");
		
		
	}
 	
 //       @Test(groups = "smoke",priority = 2)
 	    public void logout() {
 	    	dr.getLogout().click();
 	    	Reporter.log("logout was successful",true);
 	    	sp.quit(); 
 	    }
 	    
	
		@Test(groups="smoke",priority = 3)
		public void addbooktocart() {
		this.login();
		sp.findElement(By.id("pollanswers-1")).click();
		sp.findElement(By.id("vote-poll-1")).click();
		sp.findElement(By.linkText("YouTube")).click();
		//sp.findElement(By.partialLinkText("APPAREL & SHOES")).click();
	//	sp.findElement(By.partialLinkText(expectedemailname)).click();;
		
	//	Thread.sleep(30000);)
	//	dr.getBooks().click();
	//	dr.getComputingandinternetbook().click();
		
	//	dr.getAddtocartcomputingandinternet().click();
	//	Reporter.log("product was added to cart successfully",true);
	//	sp.quit();
		}
		
				
	//	@Test(groups = "smoke",priority = 4)
		public void addcomputerstocart() {
			this.login();
			dr.getComputers().click();
			dr.getDesktops().click();
			dr.getBuildyourowncheapcomputer().click();
		    String actualproductname = dr.getBuildyourowncheapcomputertext().getText();
		    sassert.assertEquals(expectedproductname, actualproductname);
		    Reporter.log("product:Buildyourowncheapcomputer was added to cart successfully");
		    
			dr.getAddtocartcomputer().click();
			this.logout();
			sp.quit();
			
		}
		
		
		
		
	

}
