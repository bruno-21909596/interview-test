package Runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import Steps.Post;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	   Post.class})

/*Other type of RunWith that is commonly used by me when using cucumber is: 
 * @CucumberOptions(
features = "src/test/resources",
tags = "@tags used"
glue = "Steps",
@plugin = {"pretty","html:target/report.html","json:target/report.json"},
dryRun = false,
monochrome = true
)*/

public class Execute {

}