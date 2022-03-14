package org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        // Setting the chromedriver path
        System.setProperty("webdriver.chrome.driver", "C:\\1.installers\\chromedriver_win32\\chromedriver.exe");

        //Invoking browser
        WebDriver driver = new ChromeDriver();
        {
            
        };
    }
}
