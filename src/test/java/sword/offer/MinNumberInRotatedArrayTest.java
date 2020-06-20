package sword.offer;

import org.junit.Assert;
import org.junit.Test;

public class MinNumberInRotatedArrayTest {

    @Test
    public void minTest(){

        MinNumberInRotatedArray minNumberInRotatedArray = new MinNumberInRotatedArray();
        Assert.assertEquals(minNumberInRotatedArray.min(new int[] {3, 4, 5, 1, 2}), 1);
        Assert.assertEquals(minNumberInRotatedArray.min(new int[] {1, 0, 1, 1, 1}), 0);
        Assert.assertEquals(minNumberInRotatedArray.min(new int[] {1, 2, 3, 4, 5}), 1);
        Assert.assertEquals(minNumberInRotatedArray.min(new int[] {1}), 1);
    }
}
