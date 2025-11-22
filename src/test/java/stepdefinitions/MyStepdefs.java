package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class MyStepdefs {

    RequestSpecification r;
    ValidatableResponse vr;
    Response res;

    final static String URL="https://restful-booker.herokuapp.com";

    @Given("Verify using {string} and {string} and making a get Request")
    public void verifyUsingAndAndMakingAGetRequest(String url, String booking) {

        r= RestAssured.given();
        r.baseUri(URL);
        r.basePath(url+"/"+booking);
        r.contentType(ContentType.JSON);
        r.log().all();

       res=r.when().log().all().get();




    }

    @Then("Response code {string} status is fetched")
    public void responseCodeStatusIsFetched(String response) {
        vr=res.then().log().all();
        vr.statusCode(Integer.parseInt(response));
    }


}
