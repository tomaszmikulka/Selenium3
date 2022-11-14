import io.cucumber.java.BeforeAll;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class Selenium3 {

    private WebDriver driver;
    //private String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @Before
    //@BeforeClass
    //public static void setUP(){
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void testSelenium3(){
        //driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //driver.navigate().to(url);
        //driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
        driver.findElement(By.tagName("button")).click();
        Assert.assertEquals("Dashboard",driver.findElement(By.tagName("h6")).getText());
        //driver.close();
    }

    @Test
    public void testSelenium3_1(){
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
        driver.findElement(By.tagName("button")).click();
        Assert.assertEquals("Dashboard",driver.findElement(By.tagName("h6")).getText());
        //driver.close();
    }

    @Test
    public void testZadanie6() throws InterruptedException {
        driver.navigate().to("https://www.bbc.com");
        Thread.sleep(3000);
        WebElement link = driver.findElement(By.tagName("a"));

        //MOJE
        //driver.findElement(By.tagName("a"));
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Ilość znalezionych linków: "+ links.size());
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Ilość obrazków: " + images.size());
        System.out.println(images.get(1).getText());

        int[] tablica = {1,2,3};
        System.out.println(tablica[1]); //Drugi element z tablicy

    }


    @After
    //@AfterClass
    //public static void tearDown(){
    public void tearDown(){
        driver.close();
    }
}
