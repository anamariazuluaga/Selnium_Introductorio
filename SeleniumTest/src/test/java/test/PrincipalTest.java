package test;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PrincipalPage;

public class PrincipalTest extends BaseTest {
// Ejercicio Simple

    private By searchField = By.id("search_query_top");
    private By searchButton = By.name("submit_search");


    @Test
    public void testBuscarRemera(){
        PrincipalPage principalPage = new PrincipalPage(driver);
        //pagePrincipal.setUp();
        principalPage.searchObject("T-shirt");
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/h1/span[1]")).getText().contains("T-SHIRT"));
    }


    @Test
    public void testBuscarVestido(){
        PrincipalPage principalPage = new PrincipalPage(driver);
        //pagePrincipal.setUp();
        principalPage.searchObject("Dresses");
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/h1/span[1]")).getText().contains("DRESSES"));

    }
}
