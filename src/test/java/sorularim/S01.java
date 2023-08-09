package sorularim;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S01 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://facebook.com/");
        String faceTitle = driver.getTitle();
        if (driver.getTitle().contains("facebook")){
            System.out.println("test passed");
        }else System.out.println("test FAILED");

        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL yazdirin.
        String faceUrl =driver.getCurrentUrl();
        if (driver.getCurrentUrl().contains("facebook")){
            System.out.println("Test Passed");
        }else System.out.println("Test FAILED");

        //4.https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com/");

        //5.Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String walmartTitle =driver.getTitle();
        if (driver.getTitle().contains("Walmart.com")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //6,Tekrar “facebook” sayfasina donun
        driver.navigate().back();

        //7.Sayfayi yenileyin
        driver.navigate().refresh();

        //8.Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();

        //9.9.Browser’i kapatin
        driver.close();
    }
}
