import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BasePage {
    private WebDriver driver;

    public BasePage(){

        this.driver = driver;

    }

    public void setUp(){
        DesiredCapabilities caps = new DesiredCapabilities();
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        //driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.navigate().to("http://automationpractice.com/index.php");

    }

}
