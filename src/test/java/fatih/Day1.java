package fatih;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
    public static void main(String[] args) {
       // web manager created:
        WebDriverManager.chromedriver().setup();

        // web driver created
        WebDriver driver=new ChromeDriver();

        // maximized the page:
        driver.manage().window().maximize();

        // go to the web page:
        driver.get("https://www.svt.se");










    }
}
