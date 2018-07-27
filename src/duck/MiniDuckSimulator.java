package duck;

public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck duck = new MallardDuck();

        duck.display();
        duck.performQuack();
        duck.performFly();
        duck.swim();
    }
}
