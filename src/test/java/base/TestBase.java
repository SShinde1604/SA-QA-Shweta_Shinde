package base;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBase {

	public static WebDriver driver; // make it static so that you can use same instance in Extent report manager
	public Properties p;

	@Parameters({"browser"})
	@BeforeClass(groups = { "Sanity", "Regression", "Master" })
	public void setup(@Optional("chrome") String br) throws IOException {
		
		FileReader Confgfile = new FileReader("./src//test//resources//config.properties");
		p = new Properties();
		p.load(Confgfile);

		switch (br.toLowerCase()) {
		case "chrome":
		    ChromeOptions options = new ChromeOptions();

		    Map<String, Object> prefs = new HashMap<>();
		    prefs.put("profile.password_manager_leak_detection", false);
		    prefs.put("credentials_enable_service", false);
		    prefs.put("profile.password_manager_enabled", false);
		    options.setExperimentalOption("prefs", prefs);

		    options.addArguments("--disable-notifications");

		    driver = new ChromeDriver(options);
		    break;

		case "edge": driver = new EdgeDriver(); break;
		case "firefox": driver = new FirefoxDriver(); break;
		default: System.out.println("Invalid browser names");
		return;
		}

		driver.manage().window().maximize();
		driver.get(p.getProperty("AppURL")); // reading url from properties file
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterClass(groups = { "Sanity", "Regression", "Master" })
	public void close() {
		driver.quit();
	}

}
