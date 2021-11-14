package p1_two_sum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class TwoSumTest {

    private int[] nums;
    private int target;
    private int[] expectedResult;

    public TwoSumTest(TwoSumParameters parameters) {
        this.nums = parameters.nums;
        this.target = parameters.target;
        this.expectedResult = parameters.expectedResult;
    }

    @Parameters(name = "{index}: {0}")
    public static Collection<TwoSumParameters> data() {
        return Arrays.asList(
                new TwoSumParameters(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                new TwoSumParameters(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                new TwoSumParameters(new int[]{3, 3}, 6, new int[]{0, 1}));
    }

    @Test
    public void test() {
        // Act
        int[] result = new TwoSumSolution().twoSum(nums, target);

        // Assert
        assertArrayEquals(expectedResult, result);
    }
}

class TwoSumParameters {

    public int[] nums;
    public int target;
    public int[] expectedResult;

    TwoSumParameters(int[] nums, int target, int[] expectedResult) {
        this.nums = nums;
        this.target = target;
        this.expectedResult = expectedResult;
    }

    @Override
    public String toString() {
        return MessageFormat.format("nums: {0}, target: {1}, expected: {2}", Arrays.toString(nums), target, Arrays.toString(expectedResult));
    }
}