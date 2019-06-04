import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    protected GooglePage googlePage;

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "/C:\\Users\\darb\\Downloads\\chromedriver_win32/chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        googlePage = new GooglePage(driver);
    }

        //@AfterMethod
        //public void afterMethod() {driver.quit();}
    }

