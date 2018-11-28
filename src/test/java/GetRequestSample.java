import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import org.testng.Assert;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by Kostya on 28.11.2018.
 */
public class GetRequestSample {

    //BaseURI
   public static String baseURI = "https://maps.googleapis.com";

    public static void main(String args[]){
        RestAssured.baseURI = baseURI;

        given().
                param("location", "-33.8670522,151.1957362").
                param("radius", "500").
                param("type", "restaurant").
        when().get("/maps/api/place/nearbysearch/json").
        then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
                and().body("results[0].geometry.viewport.northeast.lat", equalTo("44"));
        System.out.println("Request is executed");
    }
}
