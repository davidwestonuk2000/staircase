import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class StairsTest extends BaseStaircaseTest {

    @Test
    public void basicPingTest() {
        given().when().get("/stairs/").then().statusCode(200);
    }

    @Test
    public void oneStair() {
        given().when().get("/stairs/1").then()
                .body(containsString("1"));
    }

    @Test
    public void twoStairs() {
        given().when().get("/stairs/2").then()
                .body(containsString("2"));
    }

    @Test
    public void fourStairs() {
        given().when().get("/stairs/4").then()
                .body(containsString("5"));
    }

    @Test
    public void numberOfWaysSequence() {
        String inputList = "1,2,3,4,5,6,7,8,9,10,11";
        String outputList = "1,2,3,5,8,13,21,34,55,89,144";
        List<String> input = Arrays.asList(inputList.split("\\s*,\\s*"));
        List<String> expectedOutput = Arrays.asList(outputList.split("\\s*,\\s*"));

        // for each item in the input list check the expected result
        for (int i = 0; i < input.size(); i++) {
            given().when().get("/stairs/"+input.get(i)).then()
                  .body(containsString(expectedOutput.get(i)));
        }
    }

    @Test
    public void invalidNumberOfStairs() {
        given().when().get("/stairs/abc")
                .then().statusCode(404);
    }

}
