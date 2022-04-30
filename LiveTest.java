
import org.junit.*;
import static org.junit.Assert.*;
public class LiveTest
{
    @Test
    public void testTwoSum(){

        int[] input  ={ 2, 7 ,11, 15};
        int[] expected = {0 , 1};
        int target = 12;

        int[] output = Live.twoSum(input, target);

        assertArrayEquals(expected, output);

    }

}