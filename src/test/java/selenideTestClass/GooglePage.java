package selenideTestClass;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GooglePage {
    public void searchFor(String text){
        $(By.cssSelector(".gLFyf.gsfi")).val(text).pressEnter();
    }
}
