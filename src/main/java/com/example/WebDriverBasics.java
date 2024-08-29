package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 */
public  class WebDriverBasics {
       public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();

        //Account creation link
        driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        System.out.println(driver.getTitle());
        System.out.println();
        System.out.println();


        //Validation point

            
    //     if(driver.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
    //         System.out.println("Correct Title");
    //    else
    //         System.out.println("Incorrect Title");

        // to print current url    

        System.out.println(driver.getCurrentUrl());
        
        // to get page source 
        //System.out.println(driver.getPageSource());



        //use of Xpath in amazon
        /*driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("iPhone 15");
        driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();*/

        //use of id locator in account creation in amazon

                // driver.findElement(By.id("ap_customer_name")).sendKeys("Manohar Mishra");
                // driver.findElement(By.id("ap_phone_number")).sendKeys("9714405513");
                // driver.findElement(By.id("ap_password")).sendKeys("HHM123hhm");
                // driver.findElement(By.id("continue")).click();


        //use of link text

        driver.findElement(By.xpath("//*[@aria-label='Amazon']")).click();
        //driver.findElement(By.xpath("//*[@id='nav-logo-sprites']")).click();
        //Thread.sleep(5000);


        //handling of drop down menu
        //make object Select class
        Select select = new Select(driver.findElement(By.xpath("//*[@id='searchDropdownBox']")));

        
        select.selectByVisibleText("Electronics");
        Thread.sleep(2000);
        
                 




      driver.quit();


    }

   
}
