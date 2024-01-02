package video1_MavenProjeOlusturma;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class IlkClass {

    public static void main(String[] args) {


        //WebDriverManager.chromedriver().setup(); // WebDriverManager kutuphanesinden chromedriver la ilgili tüm ayarları bize getirdi

        WebDriver driver = new ChromeDriver(); // driver ımızı olusturduk

        driver.get("https://www.amazon.com"); // amazona gitme islemi








    }



}
