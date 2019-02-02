package org.guru99paymentgateway;


import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\Guru99PaymentGteway\\Paymentgate.feature",plugin= {"json:AutomationSuite/jsonReport.json","html:target"}, glue = {"org.guru99paymentgateway"}, monochrome = true,dryRun = false)

public class TestRunner{
	
}