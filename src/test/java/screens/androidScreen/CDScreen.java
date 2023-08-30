package screens.androidScreen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CDScreen extends KitapYurduMainScreen {

    @FindBy(xpath = "//android.widget.TextView[@text='Tüm Ürünleri Göster']")
    public WebElement tumUrunleriGoster;
    @FindBy(xpath = "//android.widget.TextView[@text='Sırala']")
    public WebElement orderButton;
    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.mobisoft.kitapyurdu:id/textViewSortType']")
    public List<WebElement> orderOptions;


}
