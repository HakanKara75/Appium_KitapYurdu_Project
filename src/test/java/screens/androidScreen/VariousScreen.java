package screens.androidScreen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VariousScreen extends KitapYurduMainScreen{

    @FindBy(xpath = "//android.widget.TextView[@text='Film ve Müzik']")
    public WebElement filmTitle;
    @FindBy(xpath = "//android.widget.TextView[@text='CD']")
    public WebElement cdTitle;

}
