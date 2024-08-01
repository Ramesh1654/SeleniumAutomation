package Selenium; //##################//

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practisejava {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
       
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1600)", "");

		List<WebElement> listOfPageNums = driver.findElements(By.xpath("//*[@id='pagination']/li")); // common XPath for all																																															// pageNumbers
		System.out.println("listOfPageNums: " + listOfPageNums.size()); //4

		for (int i = 1; i <= listOfPageNums.size(); i++) {
			WebElement pageNum = driver.findElement(By.xpath("//*[@id='pagination']/li[" + i + "]")); // iteration all
																										// pageNumbers
			pageNum.click(); // clicking pageNumbers

			List<WebElement> rowCount = driver.findElements(By.xpath("//*[@class='table-container']/table/tbody/tr")); // common XPath for all rows																																																					
			System.out.println("rowCount: " + rowCount.size()); //5
			
			for (int j = 1; j <= rowCount.size(); j++) { 
				Thread.sleep(1500);
				String id = driver.findElement(By.xpath("//*[@class='table-container']/table/tbody/tr[" + j + "]/td[1]")).getText(); // iteration rows to retrive 'id'
//				System.out.print(id + "  ");
				int id2 = Integer.parseInt(id);
				if(id2%2!=0) {
					System.out.print(id + "  ");
				String name = driver.findElement(By.xpath("//*[@class='table-container']/table/tbody/tr[" + j + "]/td[2]")).getText(); // iteration rows to retrive 'name'
				System.out.print(name + "  ");

				String price = driver.findElement(By.xpath("//*[@class='table-container']/table/tbody/tr[" + j + "]/td[3]")).getText(); // iteration rows to retrive 'price'
				System.out.println(price);
												
				WebElement checkBox = driver.findElement(By.xpath("//*[@id='productTable']/tbody/tr[" + j + "]/td[4]/input")); // iterating checkboxes by row count
				checkBox.click(); // clicking checkboxes
				
				}
				}
			}
			Thread.sleep(2000);
		
		driver.quit();
	}

}







