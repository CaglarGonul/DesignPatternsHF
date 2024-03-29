package Basic;

import com.chp1.designpuzzle.AxeBehaviour;
import com.chp1.designpuzzle.BowAndArrowBehaviour;
import com.chp1.designpuzzle.King;
import com.chp1.program.to.supertype.Animal;
import com.chp1.program.to.supertype.Cat;
import com.chp1.program.to.supertype.Dog;
import com.chp1.simuduck.v3.FlyNoWay;
import com.chp1.simuduck.v3.Squeak;
import com.chp2.observerpattern.custom.CurrentConditionsDisplay;
import com.chp2.observerpattern.custom.WheatherData;
import org.junit.Test;

public class Tester {

    public void test_simuduck_v1_v2() {
        com.chp1.simuduck.v1.RubberDuck rd1 = new com.chp1.simuduck.v1.RubberDuck();
        rd1.quack();
        rd1.display();
        rd1.fly();
        
        com.chp1.simuduck.v2.RubberDuck rd2 = new com.chp1.simuduck.v2.RubberDuck();
        rd2.quack();
        rd2.display();
    }
    
    public void test_animal(){
        Animal animal = new Dog();
        animal.makeSound();
        animal = new Cat();
        animal.makeSound();
    }
    
    public void test_simuduck_v3(){
        com.chp1.simuduck.v3.MallardDuck md = new com.chp1.simuduck.v3.MallardDuck();
        md.performQuack();
        md.performFly();
        
        //Lets change quack behaviour at run time
        md.setQuackBehaviour(new Squeak());
        md.performQuack();
        
        //Lets change fly behaviour at run time
        md.setFlyBehaviour(new FlyNoWay());
        md.performFly();
        
    }
    
    public void test_fighting_game(){
        
        King k = new King();
        //Lets change the weapon at run time
        k.setWeapon(new AxeBehaviour());
        k.fight();
        
        //Change again
        k.setWeapon(new BowAndArrowBehaviour());
        k.fight();
    }
    
    public void test_observer_custom(){
        WheatherData wd = new WheatherData();
        CurrentConditionsDisplay cd = new CurrentConditionsDisplay();
        
        cd.registerObserver(wd);
        
        wd.setMeasurements(80, 65, 30.4f);
        wd.setMeasurements(82, 70, 29.2f);
        wd.setMeasurements(78, 90, 29.2f);
    }
    
    @Test
    public void test_observer_builtin(){
        com.chp2.observerpattern.builtin.WeatherData wd= new com.chp2.observerpattern.builtin.WeatherData();
        com.chp2.observerpattern.builtin.CurrentConditionDisplay cd = new com.chp2.observerpattern.builtin.CurrentConditionDisplay();
        cd.registerObserver(wd);
        
        wd.setMeasurements(80, 65, 30.4f);
        wd.setMeasurements(82, 70, 29.2f);
        wd.setMeasurements(78, 90, 29.2f);
    }
}