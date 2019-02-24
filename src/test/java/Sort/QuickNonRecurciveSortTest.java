package Sort;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class QuickNonRecurciveSortTest {

    @Test
    public void testSort1() {
        Integer[] arr = {3, 2, 1};
        Integer[] expected = {1, 2, 3};

        QuickNonRecurciveSort s = new QuickNonRecurciveSort(arr);
        s.Sort();

        Assert.assertEquals(s.arr,  expected);
    }

    @Test
    public void testSort2() {
        Integer[] arr = {8, 7, 6, 5, 4, 3, 2, 1};
        Integer[] expected = {1, 2, 3, 4, 5, 6, 7, 8};

        QuickNonRecurciveSort s = new QuickNonRecurciveSort(arr);
        s.Sort();

        Assert.assertEquals(s.arr,  expected);
    }
}