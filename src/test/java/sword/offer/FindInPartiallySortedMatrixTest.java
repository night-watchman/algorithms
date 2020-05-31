package sword.offer;

import org.junit.Assert;
import org.junit.Test;

public class FindInPartiallySortedMatrixTest {

    @Test
    public void findTest() {
        int[][] matrix = {
                {1,2,8 ,9 },
                {2,4,9 ,12},
                {4,7,10,13},
                {6,8,11,15}
        };

        FindInPartiallySortedMatrix findInPartiallySortedMatrix = new FindInPartiallySortedMatrix();
        // 数组中含有目标值
        // 测试中间值
        Assert.assertTrue(findInPartiallySortedMatrix.find(matrix, 7));
        // 测试最小值
        Assert.assertTrue(findInPartiallySortedMatrix.find(matrix, 1));
        // 测试最大值
        Assert.assertTrue(findInPartiallySortedMatrix.find(matrix, 15));

        // 数组中不含有目标值
        // 大于最大值
        Assert.assertFalse(findInPartiallySortedMatrix.find(matrix, 18));
        // 小于最小值
        Assert.assertFalse(findInPartiallySortedMatrix.find(matrix, -1));
        // 最大最小值之间
        Assert.assertFalse(findInPartiallySortedMatrix.find(matrix, 5));

        // 空指针
        Assert.assertFalse(findInPartiallySortedMatrix.find(null, -1));
    }
}
