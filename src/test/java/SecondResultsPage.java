import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SecondResultsPage extends BasePage {
    private WebElement secondResultsContainer;
    private List<WebElement> secondResultElements;



    public SecondResultsPage(WebDriver driver) {
        this.driver = driver;
        initElements();
    }
    private void initElements () {
        secondResultsContainer = driver.findElement(By.xpath("//div[@class='search-results-container']"));
        secondResultElements = driver.findElements(By.xpath("//li[contains(@class, 'search-result__occluded-item')]"));
    }

    public List<String> getSearchResultsCount() {
        List<String> searchResultsList = new ArrayList<String>();
        for (WebElement searchResultElement : secondResultElements) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", searchResultElement);
            String searchResultText = searchResultElement.getText();
            searchResultsList.add(searchResultText);
        }
        return searchResultsList;
    }

}

