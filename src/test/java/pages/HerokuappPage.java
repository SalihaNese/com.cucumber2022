package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.xml.xpath.XPath;

public class HerokuappPage {
    public HerokuappPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
  @FindBy(xpath = "//*[text()=‘Add Element’]")
    public WebElement addButon;



    @FindBy(xpath = "//button[text()='Delete']")
    public WebElement deleteButton;




}
