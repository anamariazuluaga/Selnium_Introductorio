package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PrincipalPage {

    private WebDriver driver;
    private By searchField;
    private By searchButton;

    //Constructor
    public PrincipalPage(WebDriver driver){
        this.driver = driver;
        searchField = By.id("search_query_top");
        searchButton = By.name("submit_search");
    }

    public void searchObject(String objectSearch) {

        driver.findElement(searchField ).sendKeys(objectSearch);//Identificamos el objeto con el que trabajamos
        driver.findElement(searchButton).click();// Identificamos el objeto para submitear la busqueda
        Base base = new Base(driver);//En caso de algún error generamos un try catch para que nos devuelva posible error
        base.sleepSeconds(4);
    }



}
