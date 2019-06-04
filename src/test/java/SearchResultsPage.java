import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchResultsPage extends BasePage {
    private WebElement searchResultsContainer;
    private List<WebElement> searchResultElements;



    public SearchResultsPage(WebDriver driver) {
            this.driver = driver;
            initElements();
        }
        private void initElements () {
            searchResultsContainer = driver.findElement(By.xpath("//div[@id='rcnt']"));
            searchResultElements = driver.findElements(By.xpath("//h3[@class='sA5rQ']"));
        }

    public List<String> getSearchResultsCount() {
        List<String> searchResultsList = new ArrayList<String>();
        for (WebElement searchResultElement : searchResultElements) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", searchResultElement);
            String searchResultText = searchResultElement.getText();
            searchResultsList.add(searchResultText);
        }
        return searchResultsList;
    }

    }


