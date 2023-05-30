import java.io.FileWriter;
import java.io.IOException;
import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;

public class Method1 extends Method{
    public double x, delta = 1;
    public Method1(double a, double b, double e, boolean isConsole) {
        super(a, b, e, isConsole, 1);
    }

    @Override
    public void calculate() throws IOException {
        //printerTable.printHeader(isConsole, method, "a", "b", "x", "f(a)", "f(b)", "f(x)", "|a - b|");

        while(delta > e) {
            x = (a + b) / 2;

            //printerTable.printLine(isConsole, method, iteration++, a, b, x, Function.f(a), Function.f(b), Function.f(x), Math.abs(a - b));

            if (Function.f(b) * Function.f(x) < 0)
                a = x;
            else
                b = x;

            delta = Math.max(Math.abs(a - b), Math.abs(Function.f(x)));
        }

        //finalOutput(x);
    }

    /*@Test
    public void testingSolve(){
        /*test(-1, 0);
        test(-3, -2);
        test(2, 3);
        //assertEquals(0, 0);
    }

    public void test(double a, double b){
        this.a = a;
        this.b = b;
        e = 0.001;
        isConsole = false;
        try {
            calculate();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        assertEquals(((int)x * 10L)/10, 0);
    }*/

}
