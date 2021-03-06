package WordpressFramework.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import WordpressFramework.Selenium.DriverClass;

import static WordpressTests.Utilities.WordpressTest.findElement;

/**
 * Created by SenthilKumar on 29/01/2016.
 * This is to view the newly added post using the Add button from the NewPostPage
 */
public class PostPage {

    public void goTo() throws InterruptedException {
        //Thread.sleep(5000);
      //  new WebDriverWait(DriverClass.driver,5);
        WebElement viewPost = findElement(DriverClass.driver, By.partialLinkText("View post"), 5);
        viewPost.click();
//        new WebDriverWait(DriverClass.driver,5).until(ExpectedConditions.elementToBeClickable(By.partialLinkText("View post")));

  //      WebElement viewPostLink = DriverClass.driver.findElement(By.partialLinkText("View post"));
   //     viewPostLink.click();

    }


    public String displayedHeaderText(){
        String headerText = DriverClass.driver.findElement(By.cssSelector("h1.entry-title")).getText();
        return headerText;
    }



}