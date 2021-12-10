package Pages;

import static org.junit.Assert.assertEquals;
import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class methodsFactorial {

	public void findFactorialNumber(int value, String numberExpected, int statusCode) {
		String baseURI = "http://qainterview.pythonanywhere.com/factorial";

		Response response = RestAssured.given()
				.config(RestAssured.config()
			    .encoderConfig(EncoderConfig.encoderConfig()
			    .encodeContentTypeAs("x-www-form-urlencoded", ContentType.URLENC)))
				.contentType("application/x-www-form-urlencoded; charset=UTF-8")
				.formParam("number", value)
				.when()
				.post(baseURI).then().extract()
				.response();
		assertEquals(numberExpected, response.jsonPath().getString("answer"));
		assertEquals(statusCode, response.statusCode());
		System.out.print(response.asString());
		System.out.println(response.getStatusCode());
	}
}
