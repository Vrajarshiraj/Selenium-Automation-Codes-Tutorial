package LoginPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class E2E
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/");

        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@data-testid='to-testID-origin'] //div //div //input")).sendKeys("Ahm");
        driver.findElement(By.xpath("//div[@data-testid='to-testID-destination'] //div //div //input")).sendKeys("Sura");
        driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[7]/div[2]/div[1]")).click();

        int i=1;
        while(i<=4)
        {
            driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
            i++;
        }

        driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();

        driver.findElement(By.xpath("//div[text()='Family & Friends']")).click();

        driver.findElement(By.cssSelector("//div[@data-testid='home-page-flight-cta']")).click();
    }
}
