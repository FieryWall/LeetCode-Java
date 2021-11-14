package p2_add_two_numbers;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class AddTwoNumbersTest {

    private int[] values1;
    private int[] values2;
    private int[] expectedValues;

    private LinkedListBuilder builder;

    public AddTwoNumbersTest(int[] values1, int[] values2, int[] expectedValues) {
        this.values1 = values1;
        this.values2 = values2;
        this.expectedValues = expectedValues;

        builder = new LinkedListBuilder();
    }

    @Parameters(name = "{index}")
    public static Collection<int[][]> data() {
        return Arrays.asList(new int[][][]{
                {{2, 4, 3}, {5, 6, 4}, {7, 0, 8}},
                {{0}, {0}, {0}},
                {{9,9,9,9,9,9,9}, {9,9,9,9}, {8,9,9,9,0,0,0,1}}
        });
    }

    @Test
    public void test() {
        // Arrange
        ListNode l1 = builder.Build(values1);
        ListNode l2 = builder.Build(values2);
        ListNode expectedResult = builder.Build(expectedValues);

        // Act
        ListNode result = new AddTwoNumbersSolution().addTwoNumbers(l1, l2);

        // Assert
        Assert.assertArrayEquals(expectedResult.asIntArray(), result.asIntArray());
    }

}
