package sword.offer;

import org.junit.Assert;
import org.junit.Test;

public class PowerTest {

    @Test
    public void powerWithUnsignedExponentTest() {
        Power power = new Power();
        Assert.assertEquals(power.power(0.5, 2), 0.25d, 0.000000001);
        Assert.assertEquals(power.power(0.5, -1), 2, 0.000000001);
        Assert.assertEquals(power.power(0, 1), 0, 0.000000001);
        Assert.assertEquals(power.power(1, 0), 1, 0.000000001);
        power.power(0, -1);
        Assert.assertEquals(power.isValid, false);

}
}
