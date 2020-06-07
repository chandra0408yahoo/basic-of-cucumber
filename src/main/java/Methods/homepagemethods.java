package Methods;

import Constants.homepageconstants;
import junit.framework.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Chandra on 8/18/2017.
 */
public class homepagemethods {



    @FindBy(xpath= homepageconstants.Arrangementbutton)
    public static WebElement clickOnArrangementbutton;

    @FindBy(xpath= homepageconstants.kidsbutton)
    public static WebElement clickOnkidsbutton;



    public static void click_on_Arrangement_tab() throws InterruptedException {

            Thread.sleep(5000);
            //    WebElement clickOnArrangementbutton = WebConnector.driver.findElement(By.xpath("//*[@id='top_navigation_left']/div[1]/ul/li[1]/a"));
            Assert.assertTrue(clickOnArrangementbutton.isEnabled());
            clickOnArrangementbutton.click();
        System.out.println("verify git");
    }


    public static void clickOnkidsbutton() throws InterruptedException {

        Thread.sleep(5000);
        //    WebElement clickOnArrangementbutton = WebConnector.driver.findElement(By.xpath("//*[@id='top_navigation_left']/div[1]/ul/li[1]/a"));
        Assert.assertTrue(clickOnkidsbutton.isEnabled());
        clickOnkidsbutton.click();

    }



}
