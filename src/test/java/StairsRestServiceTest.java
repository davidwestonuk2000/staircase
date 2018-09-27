import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class StairsRestServiceTest extends BaseStaircaseTest {

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

    // to test how the service handles empty input
    @Test
    public void emptyInputTest() {
        given().when().get("/stairs/")
                .then().statusCode(404);
    }

    // to test how the service handles invalid input
    @Test
    public void invalidNumberOfStairs() {
        given().when().get("/stairs/abc")
                .then().statusCode(404);
    }

}
