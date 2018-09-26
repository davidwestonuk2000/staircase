import org.junit.Test;

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
    public void invalidNumberOfStairs() {
        given().when().get("/stairs/abc")
                .then().statusCode(404);
    }


}
