package duck;

public class MiniDuckSimulator02 {

    public static void main(String[] args){
        Duck model = new ModelDuck();

        model.display();
        model.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyRocetPowered());

        System.out.println("=============>날으는 기능을 바꾸다 동적으로");

        model.performFly();

    }

}
