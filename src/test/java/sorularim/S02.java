package sorularim;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S02 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        //Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın  (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://youtube.com/");
        String youtubeTitle= driver.getTitle();
        if (youtubeTitle.contains("youtube")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");
        //Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
        String youtubeUrl= driver.getCurrentUrl();
        if (youtubeUrl.contains("youtube")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");
       // URL'yi yazdırın.
        System.out.println("youtubeUrl = " + youtubeUrl);
        //Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //Youtube sayfasina geri donun
        driver.navigate().back();
        //Sayfayi yenileyin
        driver.navigate().refresh();
        //Amazon sayfasina donun
        driver.navigate().back();
        //Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();
        //Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa doğru
        //başlığı(Actual Title) yazdırın.
        String amazonTitle= driver.getTitle();
        if (amazonTitle.contains("youtube")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");
        //Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru

        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        String amazonUrl= driver.getCurrentUrl();
        if (amazonUrl.contains("youtube")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");
        //URL'yi yazdırın
        System.out.println(amazonUrl);
        //11.Sayfayi kapatin
        driver.close();
    }
}
