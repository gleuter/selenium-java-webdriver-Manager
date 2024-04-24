import java.time.Duration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

class ChromeCreateTest {

    WebDriver driver;

    @BeforeEach
    void setup() {
        driver = WebDriverManager.chromedriver().create();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    void test() throws InterruptedException {
       driver.get("https://github.com/bonigarcia/webdrivermanager?tab=readme-ov-file");
        driver.findElement(By.linkText("Selenium WebDriver")).click();
       Thread.sleep(3000);
    }

}