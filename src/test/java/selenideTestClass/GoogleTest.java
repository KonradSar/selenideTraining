package selenideTestClass;

import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {
    @Test
    public void userCanSearch(){
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Konrad\\IdeaProjects\\SelenuimCourse\\chromedriver");
//        System.setProperty("selenide.browser", "Chrome");
        Selenide.open();
        new GooglePage().searchFor("selenide java");
        SearchResultsPage resultsPage = new SearchResultsPage();
        resultsPage.getResults().shouldHave(sizeGreaterThan(1));
        resultsPage.getResult(0).shouldHave(text("Selenide: concise UI tests in Java"));
    }
}
