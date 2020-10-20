package base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

// Esta clase incluye todos los elementos que voy a utilizar en mi proyecto

public class Base {

    private String PATHDRIVER = "src\\test\\resources\\drivers\\";
    static WebDriver driver;

    public Base(WebDriver driver){

        this.driver = driver;

    }

    public WebDriver chromeDriverConnection(){

        System.setProperty("webdriver.chrome.driver",PATHDRIVER + "chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }
    public  void visit(String url){

        driver.get(url);
    }

    public WebElement findElement(By locator){
        //Busca un elemento por locator
        return driver.findElement(locator);
    }

    public List<WebElement> findElements(By locator){
        //Busca elementos por localizadores y crea una lista
        return driver.findElements(locator);
    }

    public String getText(WebElement elemente){
        //Toma el texto
        return elemente.getText();
    }

    // Hacer una Sobrecarga
    public String getText(By locator){
        //Encuenta el elemento por el locator que le pongamos y toma el texto
        return driver.findElement(locator).getText();
    }

    public void type(String inputText, By locator){

        driver.findElement(locator).sendKeys(inputText);
    }

    public void click(By locator){

        driver.findElement(locator).click();
    }

    public Boolean isDisplayed(By locator){
        try{
            return  driver.findElement(locator).isDisplayed();
        }catch (org.openqa.selenium.NoSuchElementException e){

            return false;
        }
    }


    public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {
        //Se crea con este nombre para que no haya imagenes con nombre duplicado
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        //Luego de tener el screenshot, se guarda en la siguiente ruta con el nombre y la fecha
        String destination = "C:\\Users\\anamaria.zuluaga\\Desktop\\Capacitación Selenium" + screenshotName + dateName + ".png";
        File finalDestination = new File(destination);
        FileHandler.copy(source, finalDestination);
        //Retorna la ruta del screenshot
        return destination;
    }
    protected void seleccionarElementoDeSelect(Select select, String nombreElementoABuscar) {
        List<WebElement> listaWE = select.getOptions();
        for (int i = 0; i < listaWE.size(); i++) {
            if (listaWE.get(i).getText().equalsIgnoreCase(nombreElementoABuscar)) {
                listaWE.get(i).click();
            }
        }
    }

    public void agregarItems(int cantidad, String locator){

        for(int i = 0; i < cantidad; i ++){
            driver.findElement(By.className(locator)).getAttribute("value");

        }

    }
    public void sleepSeconds(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    
}
