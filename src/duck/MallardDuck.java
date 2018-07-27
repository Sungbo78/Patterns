package duck;

import duck.Duck;

public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("저는 청동 오리입니다.");
    }

    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

}
