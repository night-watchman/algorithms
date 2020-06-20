package sword.offer;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfOneInBinaryTest {

    @Test
    public void rightShiftCountTest() {
        NumberOfOneInBinary numberOfOneInBinary = new NumberOfOneInBinary();
        Assert.assertEquals(numberOfOneInBinary.rightShiftCount(0),0);
        Assert.assertEquals(numberOfOneInBinary.rightShiftCount(0xFFFFFFFF),32);
        Assert.assertEquals(numberOfOneInBinary.rightShiftCount(0x7FFFFFFF),31);
        Assert.assertEquals(numberOfOneInBinary.rightShiftCount(0x80000000),1);


    }

    @Test
    public void minusOneCountTest(){
        NumberOfOneInBinary numberOfOneInBinary = new NumberOfOneInBinary();
        Assert.assertEquals(numberOfOneInBinary.minusOneCount(0),0);
        Assert.assertEquals(numberOfOneInBinary.minusOneCount(0xFFFFFFFF),32);
        Assert.assertEquals(numberOfOneInBinary.minusOneCount(0x7FFFFFFF),31);
        Assert.assertEquals(numberOfOneInBinary.minusOneCount(0x80000000),1);

        //Assert.assertEquals(0x80000000,-1);
        // 0xFFFFFFFF 为-1 负数使用补码表示
        Assert.assertEquals(0xFFFFFFFF,-1);
        // 0xFFFFFFFF 加1 为0
        Assert.assertEquals(0xFFFFFFFF + 1,0);
    }
}
