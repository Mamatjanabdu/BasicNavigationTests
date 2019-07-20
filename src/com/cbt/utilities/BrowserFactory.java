

package com.cbt.utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {



    public static WebDriver getDriver(String browser){
            System.getProperties().list(System.out);


        if (browser.equals("edge")) {
            return null;
        }

        if (browser.equals("chrome")) {

            return new ChromeDriver();
        } else if (browser.equals("firefox")) {
//
            return new FirefoxDriver();
        } else if (browser.equals("firefox")) {
//
            return new FirefoxDriver();

        }

    }

}


    public static void main(String[] args) {




                WebDriver driver = BrowserFactory.getDriver(System.getProperties().list(System.out);
                driver.manage().window().maximize(); // command to maximize browser
                driver.get("http://practice.cybertekschool.com");

                String actualBrowser = "";
                String expectedBrowser = "Mac";
                if(actualBrowser.equals(expectedBrowser)){
                    System.out.println("Passed");
                }else {
                    System.out.println("Failed");
                    System.out.println("Expected title: "+expectedBrowser);
                    System.out.println("Actual title: "+actualBrowser);
                }
                String pageSource = driver.getPageSource();
                System.out.println(pageSource);



                driver.close();
            }

    }

/**
 *    private static WebDriver driver;
 *
 *     //to prevent object creation
 *     private BrowserFactory(){
 *
 *     }
 *     //synchronized needs to yield threads. So we will make that during parallel execution our tests will not break
 *     public synchronized static WebDriver getDriver(String browser){
 *         if(driver != null) {
 *             if (browser.equals("chrome")) {
 *                 System.setProperty("webdriver.chrome.driver", "/Users/cybertekstudio/Desktop/selenium dependecies/drivers/chromedriver");
 *                 driver =  new ChromeDriver();
 *             } else if (browser.equals("firefox")) {
 *                 System.setProperty("webdriver.gecko.driver", "/Users/cybertekstudio/Desktop/selenium dependecies/drivers/geckodriver");
 *                 driver =  new FirefoxDriver();
 *             } else {
 *                 throw new IllegalArgumentException("Wrong driver name");
 *             }
 *         }
 *         return driver;
 *     }
 *
 *
 *
 *        WebDriver driver = BrowserFactory.getDriver("chrome");
 *         driver.get("http://google.com");
 *         driver.navigate().to("http://amazon.com");
 *         driver.navigate().back(); // navigate back in browser history
 *         driver.navigate().forward(); //navigate forward in browser history
 *         driver.navigate().refresh(); // reload page
 *         driver.getTitle(); // to read title of the page <title>Some title</title>
 * //      Close the current window, quitting the browser if it's the last window currently open.
 *         driver.close();// to close browser at end of test, but ih there is 2 tabs, it will close only tab it has focus on
 *         driver.quit(); // quit will close all windows and tabs that webdriver opened
 *         //at end of execution we use quite() to make sure that we closed whatever selenium webdriver opened
 *         driver.getPageSource();//to read source code of the web page. Source code consist of html+css+javascript.
 * //        we will not see whole source code of the web application.
 * //        we will see only current page
 *         driver.manage().window().maximize(); // put this before get()
 *         driver.manage().window().fullscreen();// or this, before get
 * //        at work, we used maximize() not fullscreen()
 *         driver.switchTo().alert();//for pop up message
 *
 *
 *     }
 * }
 * }
 * /
 */


