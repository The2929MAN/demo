package com.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerthandling {
    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.name("proceed")).click();
        Thread.sleep(5000);
        
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());

        String text = alert.getText();

        //validation point
        if(text.equals("Please enter a valid user name"))
            System.out.println("Correct alert message");
        else
            System.out.println("In-correct alert message");    

        alert.accept(); // to click on "OK" Button

       // alert.dismiss();// to click on "Cancel" Button if available


       driver.quit();


    }

}
