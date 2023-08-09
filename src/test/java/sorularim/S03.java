package sorularim;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S03 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
     /*
1.Amazon sayfasina gidelim. https://www.amazon.com/
2.Sayfanin konumunu ve boyutlarini yazdirin
3.Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
4.Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
5.Sayfayi kapatin */
        //1. ADIM:
        driver.get("https://www.amazon.com/");
        //2.ADIM:
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        //3.ADIM:

        //4.ADIM:

        //5.ADIM:

    }
}
