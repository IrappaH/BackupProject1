package pages;


import uiauto.central.ContextConfiguration;
import uiauto.interfaces.Client;
import uiauto.lib.enums.ConfigType;
import uiauto.page.BasePage;

public class LoginPage extends BasePage{

	public LoginPage(ContextConfiguration conf, Client client) throws Exception {
		super(conf, client);
		goToLoginPage();
	}
	
	public void goToLoginPage() throws Exception {	
		System.out.println("URL   :   "+getConfig().getConfigValue(ConfigType.URL));
		getClient().getDriver().get(getConfig().getConfigValue(ConfigType.URL));
		
	}

}
