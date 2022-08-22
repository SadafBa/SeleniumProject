package alltests;

import Browser.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestNGListener;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePage;

import java.time.Duration;
@Listeners(value = TestListener.class)

public class HomePageTest extends BaseTest{
     WebDriver driver= Browser.getDriver();


     @Test
     public void test1(){
                startHomePage().registerUser();
     }
}
