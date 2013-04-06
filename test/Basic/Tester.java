package Basic;

import com.chp1.simuduck.v1.RubberDuck;
import org.junit.Test;

public class Tester {
    
    @Test
    public void test_simuduck() {
        RubberDuck rd = new RubberDuck();
        rd.quack();
        rd.display();
        rd.fly();
    }
}