import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
//for hw8
public class MainPageTests extends BaseUI {

    @Test
    public void testMainPage(){

        driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        mainPage.startYouTubeVideo();
        driver.manage().timeouts().implicitlyWait(280, TimeUnit.SECONDS);
    }
}



