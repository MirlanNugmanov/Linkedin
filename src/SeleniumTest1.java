package dev.selenium.hello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest1 {
        public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();

            driver.get("https://selenium.dev");

            driver.quit();
        }
}