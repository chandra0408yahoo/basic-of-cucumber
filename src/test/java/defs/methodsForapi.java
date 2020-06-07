package defs;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.apache.http.HttpStatus.SC_CREATED;
import static org.apache.http.HttpStatus.SC_OK;
import static org.assertj.core.api.Assertions.assertThat;

public class methodsForapi {

    public Response response;

    public void apitest(){

        SerenityRest.reset();

        response = SerenityRest.given() .relaxedHTTPSValidation()
                .contentType(ContentType.JSON).baseUri("https://reqres.in/")
                .request()
                .get("/api/users/2");



      /*   SerenityRest.reset();
        return response = SerenityRest
                .given()
                .relaxedHTTPSValidation()
                .contentType(ContentType.JSON)
                .auth().oauth2(getAuthToken(UserCredentials.getUsername(), UserCredentials.getPassword()))
                .baseUri(baseUrl)
                .request()
                .log().all()
                .get(endpoint);
        */


    }

    public void apitestgetallusers(){

        SerenityRest.reset();

        response = SerenityRest.given() .relaxedHTTPSValidation()
                .contentType(ContentType.JSON).baseUri("https://reqres.in/")
                .request()
                .get("/api/users?page=2");

          List<Object> id =response.jsonPath().get("data.email");

          for(Object x:id){
              System.out.println(x);
          }



    }


    public void  createuser(){


        SerenityRest.reset();

         response = SerenityRest
                .given()
                .relaxedHTTPSValidation()
                .contentType(ContentType.JSON)
                .baseUri("https://reqres.in/")
                .body(createIncidentParams())
                .request()
                .log().all()
                .post("/api/users?page=2");

    }

    public void verifyThatResponseWasCreated() {
        System.out.println(response.then().extract().statusCode()+"<<<<<");
        assertThat(response.then().extract().statusCode()).isEqualTo(SC_OK);
    }



    public Map<String, Object> createIncidentParams() {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("name","morpheus" );
        params.put("job", "leader");
       // params.put("incidentLocation", ImmutableList.of(

        return params;
    }


   /* public Map<String, Object> createIncidentParams() {
        Map<String, Object> params = new HashMap<>();
        params.put("name", (getCurrentDateTime()));
        params.put("incidentLocation", ImmutableMap.of(
                "type", "OTHER",
                "value", getRandomTestName(),
                "lat", getLatitude(),
                "lon", getLongitude()));

        return params;
    }*/

    public void verifyThatResponseWasCreated1() {
        assertThat(response.then().extract().statusCode()).isEqualTo(SC_CREATED);
    }

}
