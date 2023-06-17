package com.syntax.review13;

import com.syntax.Utils.Constants;
import com.syntax.Utils.ExcelReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class EmployeeTester2 {
    public static void main(String[] args) {
        List<Map<String, String>> empData = ExcelReader.read(Constants.EXCEL_FILE_EMPLOYEES, "Sheet");


        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement logIn = driver.findElement(By.xpath("//*[@id='btnLogin']"));
        logIn.click();


        for (Map<String, String> map : empData) {
            WebElement pim = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
            pim.click();
            WebElement addEmp = driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']"));
            addEmp.click();
            driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(map.get("FirstName"));
            driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys(map.get("MiddleName"));
            driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(map.get("LastName"));
            WebElement saveBtn = driver.findElement(By.xpath("//input[@id='btnSave']"));
            saveBtn.click();
            WebElement editBtn = driver.findElement(By.xpath("//input[@value='Edit']"));
            editBtn.click();
            WebElement idInp = driver.findElement(By.xpath("//input[@id='personal_txtEmployeeId']"));
            idInp.clear();
            idInp.sendKeys(map.get("Employee Id"));
            driver.findElement(By.xpath("//input[@id='personal_txtLicenNo']")).sendKeys(map.get("Driver's License Number"));
            driver.findElement(By.xpath("//input[@id='personal_txtNICNo']")).sendKeys(map.get("SSN Number"));
            driver.findElement(By.xpath("//input[@id='personal_txtOtherID']")).sendKeys(map.get("Other Id"));
            driver.findElement(By.xpath("//input[@id='personal_txtLicExpDate']")).click();
            WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
            Select sel = new Select(month);
            String mon = map.get("LED-MONTH");
            sel.selectByVisibleText(mon);

            WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
            Select sel1 = new Select(year);
            sel1.selectByVisibleText(map.get("LED-YEAR"));

            List<WebElement> day = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
            for (WebElement a : day) {
                String d = map.get("LED-DAY");
                if (a.getText().equals(d)) {
                    a.click();
                }

            }
            driver.findElement(By.xpath("//input[@id='personal_txtSINNo']")).sendKeys(map.get("SIN Number"));
            if (map.get("Gender").equals("Male")) {
                driver.findElement(By.xpath("//input[@id='personal_optGender_1']")).click();
            } else {
                driver.findElement(By.xpath("//input[@id='personal_optGender_2']")).click();
            }

            WebElement nation = driver.findElement(By.xpath("//select[@id='personal_cmbNation']"));
            Select sel2 = new Select(nation);
            sel2.selectByVisibleText(map.get("Nationality"));

            WebElement matStat = driver.findElement(By.xpath("//select[@id='personal_cmbMarital']"));
            Select sel3 = new Select(matStat);
            sel3.selectByVisibleText(map.get("Marital Status"));

            driver.findElement(By.xpath("//input[@id='personal_DOB']")).click();
            WebElement month1 = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
            Select sel4 = new Select(month1);
            String mon4 = map.get("DB-Month");
            sel4.selectByVisibleText(mon4);

            WebElement year1 = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
            Select sel5 = new Select(year1);
            sel5.selectByVisibleText(map.get("DB-Year"));

            List<WebElement> day1 = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
            for (WebElement b : day1) {
                String c = map.get("DB-Day");
                if (b.getText().equals(c)) {
                    b.click();
                }
            }
            driver.findElement(By.xpath("//input[@id='personal_txtEmpNickName']")).sendKeys(map.get("Nick Name"));
            if(map.get("Smoker").equals("yes")){
                driver.findElement(By.xpath("//input[@id='personal_chkSmokeFlag']")).click();
            }
            driver.findElement(By.xpath("//input[@id='personal_txtMilitarySer']")).sendKeys(map.get("Military Service"));
            driver.findElement(By.xpath("//input[@id='btnSave']")).click();
        }
        driver.quit();
    }
}
