import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestNG {
    WebDriver driver;
    @Test(priority = 1)
    void Openbrowser()
    {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\modin\\IdeaProjects\\TestNG1\\src\\test\\java\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
    }
    @Test(priority = 2)
    void Computer(){
        System.setProperty("webdriver.edge.driver", "C:\\Users\\modin\\IdeaProjects\\TestNG1\\src\\test\\java\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.get("https://demo.nopcommerce.com/computers");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
        driver.manage().window().minimize();
    }
    @Test(priority = 3)
    void AddtoCart(){
        System.setProperty("webdriver.edge.driver", "C:\\Users\\modin\\IdeaProjects\\TestNG1\\src\\test\\java\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.get("https://demo.nopcommerce.com/computers");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
    }
    @Test(priority = 4)
    void Shoppingcart(){
        System.setProperty("webdriver.edge.driver", "C:\\Users\\modin\\IdeaProjects\\TestNG1\\src\\test\\java\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.get("https://demo.nopcommerce.com/computers");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
        driver.findElement(By.className("cart-label")).click();
    }
    @Test(priority = 5)
    void Updatecart(){
        System.setProperty("webdriver.edge.driver", "C:\\Users\\modin\\IdeaProjects\\TestNG1\\src\\test\\java\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.get("https://demo.nopcommerce.com/computers");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
        driver.findElement(By.className("cart-label")).click();
        driver.findElement(By.id("updatecart")).click();
    }
    @Test(priority = 6)
    void Termcondition(){
        System.setProperty("webdriver.edge.driver", "C:\\Users\\modin\\IdeaProjects\\TestNG1\\src\\test\\java\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.get("https://demo.nopcommerce.com/computers");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
        driver.findElement(By.className("cart-label")).click();
        driver.findElement(By.id("updatecart")).click();
        driver.findElement(By.id("termsofservice")).click();
    }
    @Test(priority = 7)
    void checkout(){
        System.setProperty("webdriver.edge.driver", "C:\\Users\\modin\\IdeaProjects\\TestNG1\\src\\test\\java\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.get("https://demo.nopcommerce.com/computers");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
        driver.findElement(By.className("cart-label")).click();
        driver.findElement(By.id("updatecart")).click();
        driver.findElement(By.id("termsofservice")).click();
        driver.findElement(By.id("checkout")).click();

    }
    @Test(priority = 7)
    void Guest(){
        System.setProperty("webdriver.edge.driver", "C:\\Users\\modin\\IdeaProjects\\TestNG1\\src\\test\\java\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.get("https://demo.nopcommerce.com/computers");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
        driver.findElement(By.className("cart-label")).click();
        driver.findElement(By.id("updatecart")).click();
        driver.findElement(By.id("termsofservice")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.className("button-1 checkout-as-guest-button")).click();
    }
    @Test(priority = 8)
    void checkout1(){
        System.setProperty("webdriver.edge.driver", "C:\\Users\\modin\\IdeaProjects\\TestNG1\\src\\test\\java\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.get("https://demo.nopcommerce.com/computers");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
        driver.findElement(By.className("cart-label")).click();
        driver.findElement(By.id("updatecart")).click();
        driver.findElement(By.id("termsofservice")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.className("button-1 checkout-as-guest-button")).click();
        driver.findElement(By.className("button-1 new-address-next-step-button")).click();
    }
    }

