package com.example.demo.libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class WebDriverConfig {

    @Value("${selenium.browser:chrome}")
    private String browser;

    @Value("${selenium.url}")
    private String url;

    @Bean
    public WebDriver webDriver() {
        WebDriver driver = null;
        if(browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
            driver.get(url);
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
            driver.get(url);
        } else if(browser.equalsIgnoreCase("safari") || browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
            driver.get(url);
        }
        return driver;
    }


}
