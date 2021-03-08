package com.kaiser.pages;

import com.kaiser.utilities.BrowserUtils;
import com.kaiser.utilities.ConfigReader;
import com.kaiser.utilities.MyDriver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(xpath = "//div[@class='[injected] slick-slide slick-current slick-active selected']")
    public WebElement whatsNew;

    @FindBy(xpath = "//input[@id='userid']")
public WebElement userName;

@FindBy (xpath = "//input[@id='password']")
WebElement passWord;
@FindBy(xpath = "//button[@id='Submit']")
    public WebElement signInButton;
@FindBy(xpath = "//a[normalize-space()='Forgot your user ID']")
    public WebElement ForgetId;
    @FindBy(xpath = "//a[normalize-space()='password']")
    public WebElement ForgetPassword;

    @FindBy(xpath = "//title[text()='Custom Care & Coverage Just For You | Kaiser Permanente']")
    public WebElement pageSubTitle;

    public LoginPage(){

        PageFactory.initElements(MyDriver.get(),this);
}

  public void login(){
    MyDriver.get().get(ConfigReader.getProperty("url"));
      System.out.println("Im on the login Page");
}

/*


/Reusable method to login method
 @param username
@param password
 */
public void login(String username,String password){

    username=ConfigReader.getProperty("username");
    password=ConfigReader.getProperty("password");
    userName.sendKeys(username);
    passWord.sendKeys(password,Keys.ENTER);

}

    public void invalidLogin(String invalidUsername, String invalidPassword){

        invalidUsername=ConfigReader.getProperty("invalidUsername");
        invalidPassword=ConfigReader.getProperty("invalidPassword");
        userName.sendKeys(invalidUsername);
        passWord.sendKeys(invalidPassword,Keys.ENTER);

    }

    /**
     * @return page name, for example: Dashboard
     */
    public String getPageSubTitle() {
        //ant time we are verifying page name, or page subtitle, loader mask appears

        BrowserUtils.waitForStaleElement(pageSubTitle);
        return pageSubTitle.getText();
    }

}