import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class StairsUnitTests {


    // to test the response for valid inputs
    @Test
    public void positiveValidIntTest() {

        String outputList = "1,2,3,5,8,13,21,34,55,89,144";
        List<String> expectedOutput = Arrays.asList(outputList.split("\\s*,\\s*"));

        // for each item in the input list check the expected result
        for (int i = 0; i < expectedOutput.size(); i++) {
            assert Stairs.countWays(i+1) == Integer.parseInt(expectedOutput.get(i));
        }
    }

    // to test how a negative input is handled
    @Test
    public void negativeTest() {
        assert Stairs.countWays(-1) == 0;
    }

    // to test how 0 is handled
    @Test
    public void zeroTest() {
        assert Stairs.countWays(0) == 1;
    }

//    // to test how a string that cannot be parsed as int is handled
//    @Test
//    public void nonIntStringTest() {
//        String[] arguments = new String[] {"test"};
//        assert(Stairs.main(arguments)==0);
//    }
//
//    // to test how an empty string is handled
//    @Test
//    public void emptyStringTest() {
//        String[] arguments = new String[] {""};
//        assert(Stairs.main(arguments)==0);
//    }
//
//    // to test how a double input is handled
//    @Test
//    public void doubleTest() {
//        String[] arguments = new String[] {"2.1"};
//        assert(Stairs.main(arguments)==2);
//    }
//
//    // to test how a null input is handled
//    @Test
//    public void nullInputTest() {
//        String[] arguments = new String[];
//        assert(Stairs.main(arguments)==0);
//    }
}
