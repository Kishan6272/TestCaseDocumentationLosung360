package TestCase2;

//import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;

public class OrangeHrm {

    public String baseURL= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    public WebDriver driver;

    //@Test
    @BeforeTest
    public void setUp()
    {
        System.out.println("befor test executed");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//        driver.findElement(By.xpath("//input[@placeholder=\'Username\']"))
//                .sendKeys("Admin");
//
//        driver.findElement(By.xpath("//input[@placeholder=\'Password\']"))
//                .sendKeys("admin123");
//
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    public void logIn()
    {
        driver.findElement(By.xpath("//input[@placeholder=\'Username\']"))
                .sendKeys("Admin");

        driver.findElement(By.xpath("//input[@placeholder=\'Password\']"))
                .sendKeys("admin123");

        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    // login with  valid credentials
    @Test(priority = 2,enabled = false)
    public void loginTestWithValidCredentials() throws InterruptedException {
        driver.findElement(By.xpath("//input[@placeholder=\'Username\']"))
                .sendKeys("Admin");

        driver.findElement(By.xpath("//input[@placeholder=\'Password\']"))
                .sendKeys("admin123");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String pageTitle=driver.getTitle();
        System.out.println(pageTitle);
        if(pageTitle.equals("OrangeHRM"))
        {
            System.out.println("login sucessfully");
        }
        else
        {
            System.out.println("not sucessfully");
        }
        Thread.sleep(2000);

        Assert.assertEquals("OrangeHRM",pageTitle);

    }

    // login with in valid credentials
    @Test(priority = 1,enabled = false)
    public void loginTestWithInvalidCredentials()
    {
        driver.findElement(By.xpath("//input[@placeholder=\'Username\']"))
                .sendKeys("Admin11");

        driver.findElement(By.xpath("//input[@placeholder=\'Password\']"))
                .sendKeys("admin123");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String messageExpected="Invalid credentials";
        String messageAcutal= driver.
                findElement(By.xpath("//div[@class=\"oxd-alert-content oxd-alert-content--error\"]"))
                .getText();
        Assert.assertEquals(messageAcutal,messageExpected);
    }

    // adding employee

    @Test(priority = 3,enabled = false)
    public void addEmployee() throws InterruptedException {

        driver.findElement(By.xpath("//span[text()='PIM']")).click();
        driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
        driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("Mahendra");
        driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("dhoni");
        driver.findElement(By.xpath("//input[@name=\"middleName\"]")).sendKeys("singh");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[normalize-space()=\'Save\' ]")).click();


        String actualMsg=driver.
                findElement(By.xpath("//h6[normalize-space()='Personal Details']")).getText();
        if(actualMsg.contains("Personal Details"))
        {
            System.out.println("record created ");
        }
        else
        {
            System.out.println("fail");
        }

    }



    // searching employee by name
    @Test(priority = 4,enabled = false)
    public void recordfoundByName() throws InterruptedException {
        logIn();
        driver.findElement(By.xpath("//span[text()='PIM']")).click();
        driver.findElement(By.xpath("//a[text()='Employee List']")).click();

        driver.findElements(By.tagName("input")).get(1).sendKeys("Kishan");
        //button[normalize-space()='Search']
        driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
        Thread.sleep(1000);

       List<WebElement> elemsntsList=driver.findElements(By.xpath("//span[@class=\"oxd-text oxd-text--span\"]"));



        String msgExp="Record Found";
        String  actMsg=elemsntsList.get(0).getText();
        System.out.println(actMsg);
        Assert.assertEquals(actMsg,msgExp);




        logout();




    }

    //searching employee by id

    @Test(priority = 5,enabled = false)
    public void assertById() throws InterruptedException {
        logIn();
        driver.findElement(By.xpath("//span[text()='PIM']")).click();
        driver.findElement(By.xpath("//a[text()='Employee List']")).click();

        driver.findElements(By.tagName("input")).get(2).sendKeys("0371");
         Thread.sleep(1000);
        driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();

        List<WebElement> elementList=driver.findElements(By.xpath("//div[@class=\"oxd-table-cell oxd-padding-cell\"]"));
        String msg="0371";

        String actmsg=elementList.get(1).getText();
        Assert.assertEquals(actmsg,msg);

        Thread.sleep(1000);
        logout();
    }

    // deleting employee by Id

    @Test(priority = 6)
    public void deleteEmployeeById() throws InterruptedException {
        logIn();
        driver.findElement(By.xpath("//span[text()='PIM']")).click();
        driver.findElement(By.xpath("//a[text()='Employee List']")).click();
        driver.findElements(By.tagName("input")).get(1).sendKeys("Orange");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();

        //List<WebElement> elementListButton=driver.findElements(By.xpath("//button[@type=\"button\"]"));
        // click on delete icon
        Thread.sleep(1000);
          driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-trash\"]")).click();
        //Thread.sleep(1000);
         //elementListButton.get(5).click();
        // driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin\"]"))
                        .click();
        String msg=driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span\"])[1]")).getText();

        Assert.assertEquals(msg,"No Records Found");
        Thread.sleep(2000);
         logout();

    }




    public void logout() throws InterruptedException {
            driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
           List<WebElement> elementList= driver.findElements(By.xpath("//a[@class=\"oxd-userdropdown-link\"]"));

//           for (int i=0;i<elementList.size();i++)
//           {   Thread.sleep(2000);
//               System.out.println(i+":"+elementList.get(i).getText());
//           }
           elementList.get(3).click();
        }



    @AfterTest
    public void tearDown() throws InterruptedException {
       //logout();
       Thread.sleep(1000);// wait for 5 second befor quit


       driver.close();
       driver.quit();
    }

}
