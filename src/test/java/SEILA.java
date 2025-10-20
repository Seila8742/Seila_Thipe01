import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SEILA {

    private static final Logger log = LoggerFactory.getLogger(SEILA.class);
    WebDriver driver;

    @BeforeTest
    public void launchBrowser(){
        driver = new ChromeDriver();
    }

    @Test
    public void startBrowser(){

        driver.get("https://www.ndosiautomation.co.za");
        driver.manage().window().maximize();

    }
    @Test(priority = 1)
    public void verifyHomePageISDisplayed() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/div/main/section/div[1]/h2")).isDisplayed();
        Thread.sleep(2000);

    }
    @Test(priority = 2)
    public void ClickLearningMaterial() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"nav-btn-practice\"]")).click();
        Thread.sleep(4000);

    }
    @Test(priority = 3)
    public void enterUsername() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"login-email\"]")).sendKeys("Seila@gmail.com");
        Thread.sleep(5000);

    }
    @Test(priority = 4)
    public void enterPassword() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"login-password\"]")).sendKeys("Seila874@");
        Thread.sleep(5000);

    }


    @Test(priority = 5)
    public void login() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"login-submit\"]")).click();
        Thread.sleep(5000);

    }

    @Test(priority = 6)
    public void automationbasicform() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"tab-btn-password\"]/span[2]")).click();
        Thread.sleep(5000);

    }
    @Test(priority = 7)
    public void Fullname() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Thipe");
        Thread.sleep(5000);
    }

    @Test(priority = 8)
    public void Email() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("seila@gmail.com");
        Thread.sleep(5000);
    }

    @Test(priority = 9)
    public void Age() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"age\"]")).sendKeys("22");
        Thread.sleep(5000);
    }

    @Test(priority = 10)
    public void DropdownSelectGender() throws InterruptedException {
       // driver.findElement(By.id("gender")).click();
        driver.findElement(By.xpath("//*[@id=\"gender\"]")).sendKeys("Male");
        Thread.sleep(5000);
    }

    @Test(priority = 11)
    public void DropdownSelectcountry() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys("South Africa");
        Thread.sleep(5000);
    }
    @Test(priority = 12)
    public void DropdownSelectExpirence() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"experience\"]")).sendKeys("Beginner");
        Thread.sleep(5000);
    }

    @Test(priority = 13)
    public void SelectSkill() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"skill-python\"]")).click();
        Thread.sleep(5000);
    }
    @Test(priority = 14)
    public void Addcomments() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"comments\"]")).sendKeys("Am very happy to be in this class");
        Thread.sleep(5000);
    }
    @Test(priority = 15)
    public void SelectTerms() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
        Thread.sleep(5000);
    }
    @Test(priority = 16)
    public void SelectSubmit() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")).click();
        Thread.sleep(5000);
    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();

    }

}
