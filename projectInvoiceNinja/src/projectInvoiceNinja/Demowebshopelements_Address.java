package projectInvoiceNinja;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demowebshopelements_Address {
	
	

	public  Demowebshopelements_Address(WebDriver sp) {
		PageFactory.initElements(sp, this);
		
	}
		@FindBy(partialLinkText = "Log in")
		private WebElement loginlink;
		
		@FindBy(id = "Email")
		private WebElement emailtextbox;
		
		@FindBy(id = "Password")
		private WebElement passwordtextbox;
		
		@FindBy(xpath = "//input[@value='Log in']")
		private WebElement loginbutton;
		
		@FindBy(xpath = "//input[@value='Search store']")
		private WebElement searchbar;
		
		@FindBy(xpath  = "//strong[text()='Categories']/../..//a[contains(text(),'Books')]")
		private WebElement books;
		
		@FindBy(xpath  = "(//a[contains(text(),'Computers')])[3]")
		private WebElement computers;
		
		@FindBy(xpath  = "//img[contains(@title,'Desktops')]")
		private WebElement desktops;
		
		@FindBy(xpath  = "//a[@href='/build-your-cheap-own-computer']/../..//input[@value='Add to cart']")
		private WebElement Buildyourowncheapcomputer;
		
		@FindBy(id="add-to-cart-button-72")
		private WebElement addtocartcomputer;
		
		@FindBy(xpath  = "//h1[contains(text(),'Build your own cheap computer')]")
		private WebElement buildyourowncheapcomputertext;
		
		
		@FindBy(xpath  = "//strong[text()='Categories']/../..//a[contains(text(),'Electronics')]")
		private WebElement electronics;
		
		
		
		@FindBy(xpath  = "//strong[text()='Categories']/../..//a[contains(text(),'Apparel & Shoe')]")
		private WebElement ApparelsandShoe;
		
		@FindBy(xpath  = "//strong[text()='Categories']/../..//a[contains(text(),'Jewelry')]")
		private WebElement jewelry;
		
		@FindBy(xpath  = "//strong[text()='Categories']/../..//a[contains(text(),'Gift Card')]")
		private WebElement giftcards;
		
		@FindBy(partialLinkText  = "Computing and Internet")
		private WebElement computingandinternetbook;
		
		@FindBy(xpath = "//input[@value='Add to cart']")
		private WebElement addtocartcomputingandinternet;
		
		@FindBy(partialLinkText  = "Log out")
		private WebElement logout;

		public WebElement getLoginlink() {
			return loginlink;
		}

		public WebElement getEmailtextbox() {
			return emailtextbox;
		}

		public WebElement getPasswordtextbox() {
			return passwordtextbox;
		}

		public WebElement getLoginbutton() {
			return loginbutton;
		}

		public WebElement getSearchbar() {
			return searchbar;
		}

		public WebElement getBooks() {
			return books;
		}

		public WebElement getComputers() {
			return computers;
		}

		public WebElement getDesktops() {
			return desktops;
		}

		public WebElement getBuildyourowncheapcomputer() {
			return Buildyourowncheapcomputer;
		}

		public WebElement getAddtocartcomputer() {
			return addtocartcomputer;
		}

		public WebElement getBuildyourowncheapcomputertext() {
			return buildyourowncheapcomputertext;
		}

		public WebElement getElectronics() {
			return electronics;
		}

		public WebElement getApparelsandShoe() {
			return ApparelsandShoe;
		}

		public WebElement getJewelry() {
			return jewelry;
		}

		public WebElement getGiftcards() {
			return giftcards;
		}

		public WebElement getComputingandinternetbook() {
			return computingandinternetbook;
		}

		public WebElement getAddtocartcomputingandinternet() {
			return addtocartcomputingandinternet;
		}

		public WebElement getLogout() {
			return logout;
		}

		

		
		
     	 
	 
	 
	
}

	
	 