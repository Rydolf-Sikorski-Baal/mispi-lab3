import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class Method1Test extends TestCase {
    @Test
    public void testingSolve(){
        test(-1, 0);
        test(-3, -2);
        test(2, 3);
        Assert.assertEquals(0, 0);
    }

    public void test(double a, double b){
        Method1 method1 = new Method1(a, b, 0.001, false);

        try {
            method1.calculate();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        assertEquals((int)(Function.f(method1.x) * 10L), 0);
    }
}