package com.kaiser.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class LandingPage {
    public static void main(String[] args) {


       /* WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://kp.org");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            Thread.sleep(2000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        WebElement userNAme=driver.findElement(By.xpath("//input[@id='userid']"));
        WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
        WebElement signin=driver.findElement(By.xpath("//button[normalize-space()='Sign in']"));
        userNAme.sendKeys("elisalegacy");
        pass.sendKeys("");
        signin.click();*/
        System.out.println("/n==============");
        Scanner sc =new Scanner(System.in) ;
        System.out.println("Enter the multiplication number: ");
        int table=sc.nextInt();
        for (int i=0;i<=10;i++){
            System.out.println(i+"*"+table+"="+table*i);
        }

        int k=1; while (k<=10){
            System.out.println(k);
            k +=2;
        }
        System.out.println("/n==============");
//infinite loop
        int l=100;while (l<150){
            System.out.println(l+1);
            l--;
        }


    }
}
