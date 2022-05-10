package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/java/com/features",
		glue="com.stepdef",
		dryRun=false,//used for compilation
		monochrome= true,//used for op
		//tags={"~@jbk"},//used for avoid the scenario
		plugin= {"html:target"}//used for report generation
			)

public class Testrunner 
{
	

}
