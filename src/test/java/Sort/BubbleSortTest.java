package Sort;

import org.testng.Assert;

import static org.testng.Assert.*;

public class BubbleSortTest {

    @org.testng.annotations.Test
    public void testSort() {
        Integer[] arr = {8, 7, 6, 5, 4, 3, 2, 1};
        Integer[] expected = {1, 2, 3, 4, 5, 6, 7, 8};

        BubbleSort s = new BubbleSort(arr);
        s.Sort();

        Assert.assertEquals(s.arr,  expected);
    }
}