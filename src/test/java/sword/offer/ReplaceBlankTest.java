package sword.offer;

import org.junit.Assert;
import org.junit.Test;

public class ReplaceBlankTest {


    @Test
    public void replaceBlankTest() {


        char[] chars = new char[10];
        char[] result = new char[10];

        ReplaceBlank replaceBlank = new ReplaceBlank();

        // 空格在开头
        chars[0] = ' ';
        chars[1] = 'A';
        chars[2] = 'S';
        chars[3] = 'D';

        result[0] = '%';
        result[1] = '2';
        result[2] = '0';
        result[3] = 'A';
        result[4] = 'S';
        result[5] = 'D';
        replaceBlank.replaceBlank(chars, 4);
        Assert.assertArrayEquals(chars, result);

        // 空格在结尾
        chars = new char[10];
        result = new char[10];
        chars[0] = 'A';
        chars[1] = 'S';
        chars[2] = 'D';
        chars[3] = ' ';

        result[0] = 'A';
        result[1] = 'S';
        result[2] = 'D';
        result[3] = '%';
        result[4] = '2';
        result[5] = '0';
        replaceBlank.replaceBlank(chars, 4);
        Assert.assertArrayEquals(chars, result);

        // 中间连续多个空格
        chars = new char[10];
        result = new char[10];
        chars[0] = 'A';
        chars[1] = 'S';
        chars[2] = ' ';
        chars[3] = ' ';
        chars[4] = 'D';

        result[0] = 'A';
        result[1] = 'S';
        result[2] = '%';
        result[3] = '2';
        result[4] = '0';
        result[5] = '%';
        result[6] = '2';
        result[7] = '0';
        result[8] = 'D';

        replaceBlank.replaceBlank(chars, 5);
        Assert.assertArrayEquals(chars, result);

        // 全为空格
        chars = new char[10];
        result = new char[10];
        chars[0] = ' ';
        chars[1] = ' ';
        chars[2] = ' ';

        result[0] = '%';
        result[1] = '2';
        result[2] = '0';
        result[3] = '%';
        result[4] = '2';
        result[5] = '0';
        result[6] = '%';
        result[7] = '2';
        result[8] = '0';
        replaceBlank.replaceBlank(chars, 3);
        Assert.assertArrayEquals(chars, result);

        // 空字符串
        chars = new char[10];
        replaceBlank.replaceBlank(chars, 0);
        Assert.assertArrayEquals(chars, new char[10]);
        // 空指针
        chars = null;
        replaceBlank.replaceBlank(chars, 10);
        Assert.assertEquals(chars, null);
    }
}
