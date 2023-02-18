# Appium
## Installation
#### 1- JDK (Intelij)
* pom.xml -> java client from mvnrepository
* pom.xml -> testng from mvnrepository
#### 2- Vysor or Android Studio
#### 3- Appium Server
* Edit Configurations>Environment Variables  
  - ANDROID_HOME : C:\Users\semih aldemir\AppData\Local\Android\Sdk  
  - JAVA_HOME : C:\Program Files\Java\jdk-17  
**AppData file is hidden file
#### 4- Appium Inspector

## Preparation For Test
````java
@Test
public void app(){
    DesiredCapabilities dC = new DesiredCapabilities();
    dC.setCapability("platformName","Android");
    dC.setCapability("platformVersion","6.0"); //version on my phone
    dC.setCapability("deviceName","HUAWEI VNS_L21"); //My phone name
    dC.setCapability("automationName","UiAutomator2");
    dC.setCapability("app","src/Apps/Calculator Vault_1.3.4_Apkpure.apk");
}
````

