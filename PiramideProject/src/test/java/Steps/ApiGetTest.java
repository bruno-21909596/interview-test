package Steps;

import Pages.ApiGet;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ApiGetTest {
	ApiGet apiget = new ApiGet();

	@Given("that I access api to get to consult an information")
	public void that_i_access_api_to_get_to_consult_an_information() {
		apiget.acessarApi("http://qainterview.pythonanywhere.com/factorial");
		
	}

	@Then("I validate return code")
	public void i_validate_return_code() {
		apiget.statusCode(200);

	}

}
