package com.kaiser.pages;

import com.kaiser.utilities.MyDriver;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class BasePage {
    //for all common methods we frequently used

    public  BasePage(){
        PageFactory.initElements(MyDriver.get(),this);
    }

    public void waitforelements() throws InterruptedException {
        Thread.sleep(3000);
    }

    /**
     * Web site was not allowing the automation browser
     * And I saw that browser was doing it with cookies and
     * I cleaned the cookies every page navigation to make sure
     * my automation works.
     */
    public static void clearCookiees() {

        Set<Cookie> a = MyDriver.get().manage().getCookies();
        System.out.println(a);
        //Delete all the cookies
        MyDriver.get().manage().deleteAllCookies();

    }
    public static void wait2() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void scrollDown(WebElement link){
        try {
            Thread.sleep(2000);
            //hard wait stops complete stop, implicit waits the certain time provided, explicit for specified web element, fluent wait for not specified tiem
        }
        catch (Exception e){

        }
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor)MyDriver.get();        //not visible   Not Enabled    No such element
        javascriptExecutor.executeScript("argument[0].scrollIntoView(true)",link);

    }
}

