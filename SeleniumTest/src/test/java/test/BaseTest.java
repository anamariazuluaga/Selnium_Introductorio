package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


public class BaseTest  {

    private String PATHDRIVER = "src\\test\\resources\\drivers\\";
    private String baseURL = "http://automationpractice.com/index.php";
    static WebDriver driver;


    @BeforeMethod (alwaysRun = true)

    public void setUp() {

        System.setProperty("webdriver.chrome.driver", PATHDRIVER + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php");

    }

/*
    public void waitForPageLoad() {
        Wait<WebDriver> wait = new WebDriverWait(driver, 30L);
        wait.until(new Function<WebDriver, Boolean>() {
            public Boolean apply(WebDriver driver) {
                System.out.println("Current Window State       : " + String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState", new Object[0])));
                return String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState", new Object[0])).equals("complete");
            }
        });
    }
*/



    /*
    @Test
    public void testBuscarRemera(){
        PagePrincipal pagePrincipal = new PagePrincipal(driver);
        //pagePrincipal.setUp();
        pagePrincipal.searchObject("T-shirt");
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/h1/span[1]")).getText().contains("T-SHIRT"));
    }


    @Test
    public void testBuscarVestido(){
        PagePrincipal pagePrincipal = new PagePrincipal(driver);
        //pagePrincipal.setUp();
        pagePrincipal.searchObject("Dresses");
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/h1/span[1]")).getText().contains("DRESSES"));

    }
    */


}



