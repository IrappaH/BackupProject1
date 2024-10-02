package tests;

import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;

import pages.LoginPage;
import uiauto.lib.enums.ConfigType;
import uiauto.test.BaseTest;

public class InitialTestSetup extends BaseTest{

	@BeforeClass(alwaysRun = true)
	public void InitialTestSetupClass(ITestContext context) throws Exception {
		configureTestClass(context);
		System.out.println(" @BeforeClass InitialTestSetup Thread ID: "+Thread.currentThread().getId());
		
		//driver.getDriver().get(this.config.getConfigValue(ConfigType.URL));
		LoginPage loginPage = new LoginPage(getConfig(),getDriver());
	}
	
	
}
