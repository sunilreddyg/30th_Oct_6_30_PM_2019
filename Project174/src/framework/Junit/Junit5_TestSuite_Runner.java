package framework.Junit;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("framework")
@IncludePackages("framework.Junit")
class Junit5_TestSuite_Runner
{
	

}
