package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MainPagePF {

    WebDriver driver;

    public MainPagePF (WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    private final String baseURL = "https://telex.hu";

    public void navigation()
    {
        driver.navigate().to(baseURL);
    }

}
