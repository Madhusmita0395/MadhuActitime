package generics;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 
{
	public static void takeElementScreenshot(WebElement element , String fileName) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)element;
		File srcFile=ts.getScreenshotAs(OutputType.FILE);		
		FileHandler.copy(srcFile, new File("./elementscreenshot/" +fileName+ ".png"));
	}
}