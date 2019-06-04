import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

    @Test
    public void basicSearchTest() {
        String searchTerm = "Selenium";

        GooglePage googlePage = new GooglePage(driver);

        SearchResultsPage searchResultsPage = googlePage.search(searchTerm);

        Assert.assertEquals(searchResultsPage.getSearchResultsCount(), 10,
                "Search results count is wrong.");

        SecondResultsPage secondResultsPage = new SecondResultsPage(driver);

        Assert.assertEquals(secondResultsPage.getSearchResultsCount(), 10,
                "Search results count is wrong.");
    }


}

