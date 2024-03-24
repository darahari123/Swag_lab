package test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\swag.feature",glue="Org.steps",dryRun=false,plugin ="html:C:\\selenium work\\harikrishna1\\Cucumber_FrameworkProject\\Swag_lab\\test-output.html")

public class Testrunner extends AbstractTestNGCucumberTests {

}
