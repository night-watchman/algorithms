package sword.offer;


import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {

    @Test
    public void SingletonTest() {
        Assert.assertTrue(Singleton.Singleton1.getINSTANCE() == Singleton.Singleton1.getINSTANCE());
        Assert.assertTrue(Singleton.Singleton2.getINSTANCE() == Singleton.Singleton2.getINSTANCE());
        Assert.assertTrue(Singleton.Singleton3.getINSTANCE() == Singleton.Singleton3.getINSTANCE());
        Assert.assertTrue(Singleton.Singleton4.getINSTANCE() == Singleton.Singleton4.getINSTANCE());
        Assert.assertTrue(Singleton.Singleton5.getINSTANCE() == Singleton.Singleton5.getINSTANCE());
    }

}
