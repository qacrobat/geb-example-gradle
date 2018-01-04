import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver


reportsDir = new File("build/reports/tests/geb-reports")
reportOnTestFailureOnly = true

driver = {new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome())}

waiting {
	timeout = 5
}
atCheckWaiting = true

environments {
	firefox {
		driver = {
			new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.firefox())
		}
	}
	chrome {
		driver = {
			new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome())
		}
	}
}
