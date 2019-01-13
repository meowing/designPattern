package context;

import concretstrategy.FlyWithWings;
import concretstrategy.Quack;

public class MallardDuck extends Duck{
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck.");
    }
}
