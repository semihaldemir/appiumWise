import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class AppiumDay01 {

@Test
public void app(){
    DesiredCapabilities dC = new DesiredCapabilities();
    dC.setCapability("platformName","Android");
    dC.setCapability("platformVersion","");
    dC.setCapability("deviceName","HUAWEI VNS_L21");
    dC.setCapability("automationName","UiAutomator2");
    dC.setCapability("app","src/Apps/Calculator Vault_1.3.4_Apkpure.apk");



}

}
