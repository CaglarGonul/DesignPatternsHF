package Basic;



import com.chp1.simuduck.v3.Animal;
import com.chp1.simuduck.v3.Cat;
import com.chp1.simuduck.v3.Dog;
import org.junit.Test;

public class Tester {

    public void test_simuduck() {
        com.chp1.simuduck.v1.RubberDuck rd1 = new com.chp1.simuduck.v1.RubberDuck();
        rd1.quack();
        rd1.display();
        rd1.fly();
        
        com.chp1.simuduck.v2.RubberDuck rd2 = new com.chp1.simuduck.v2.RubberDuck();
        rd2.quack();
        rd2.display();
    }
    
    @Test 
    public void test_animal(){
        Animal animal = new Dog();
        animal.makeSound();
        animal = new Cat();
        animal.makeSound();
    }
    
}