package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class webconnector {

    public static WebDriver driver = null;
    public static String browser = null;
    private static EventFiringWebDriver e_driver;
    private static WebEventListener eventListener;
    //public static String browser;


    public static String getbrowsername() {

        return browser = "Chrome";

    }


    ///////////////////////////////////////OPEN BROWSER////////////////////////////////////////////////////////
    public static WebDriver open_browser() {

        if (driver == null) {

            if (getbrowsername().equalsIgnoreCase("Firefox")) {

                WebDriverManager.firefoxdriver().clearPreferences();
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();

            } else if (getbrowsername().equalsIgnoreCase("Chrome")) {


                WebDriverManager.chromedriver().clearPreferences();
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();

                e_driver = new EventFiringWebDriver(driver);

                // Now create object of EventListerHandler to register it with EventFiringWebDriver
                eventListener = new WebEventListener();

                e_driver.register(eventListener);

            }


        }

return e_driver;
    }

}
