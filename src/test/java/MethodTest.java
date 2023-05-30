import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.io.IOException;

public class MethodTest extends TestCase {
    @Test
    public void testingSolve(){
        for(int j = 0; j < 3; j++) {
            int a = 0, b = 0;
            switch (j){
                case 0 -> {a = -1; b = 0;}
                case 1 -> {a = -3; b = -2;}
                case 2 -> {a = 2; b = 3;}
            }
            Method method = new Method1(a, b, 0.001, false);
            for (int i = 0; i < 4; i++) {
                switch (i) {
                    case 0 -> method = new Method1(a, b, 0.001, false);
                    case 1 -> method = new Method2(a, b, 0.001, false);
                    case 2 -> method = new Method4(a, b, 0.001, false);
                    case 3 -> method = new Method5(a, b, 0.001, false);
                }

                try {
                    method.calculate();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                assertEquals((int) (Function.f(method.getX()) * 100L), 0);
            }
        }
    }
}