package utilities;

import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class ScreenShot   {
    public WebDriver driver;
    public ScreenShot(WebDriver driver) throws IOException {
        this.driver = driver;

    }
    public void takeScreeShot(){
    Screenshot screenshot = new AShot().takeScreenshot(driver);

            try{
                Random rand = new Random();
                int randomNumber = rand.nextInt(100);
                String path = "src/main/resources/Image"+randomNumber+".png";
                ImageIO.write(screenshot.getImage(),"PNG",new File(path));

            }

        catch(
    IOException ioe){
        System.out.println("Catching: " + ioe.getMessage());
    }

    }
}

