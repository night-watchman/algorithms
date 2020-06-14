package sword.offer;

import org.junit.Assert;
import org.junit.Test;

public class QueenWithTwoStacksTest {

    @Test
    public void operateTest() {
        QueenWithTwoStacks<String> queen = new QueenWithTwoStacks<String>();

        queen.appendTail("tail1");
        queen.appendTail("tail2");
        queen.appendTail("tail3");
        Assert.assertEquals(queen.deleteHead(), "tail1");
        queen.appendTail("tail4");
        Assert.assertEquals(queen.deleteHead(), "tail2");
        queen.appendTail("tail5");
        queen.appendTail("tail6");
        Assert.assertEquals(queen.deleteHead(), "tail3");
        Assert.assertEquals(queen.deleteHead(), "tail4");
        Assert.assertEquals(queen.deleteHead(), "tail5");
        Assert.assertEquals(queen.deleteHead(), "tail6");
        Assert.assertEquals(queen.deleteHead(), null);

    }
}
