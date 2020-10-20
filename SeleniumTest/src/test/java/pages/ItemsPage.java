package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemsPage extends Base {

    public WebDriver driver;

    private By addVestido1 = By.xpath("///*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img");

    public ItemsPage(WebDriver driver){

        super(driver);

    }

    public void seleccionarVestido(){

    }

    public void addCantidadVestidos(){

        return;

    }

}
