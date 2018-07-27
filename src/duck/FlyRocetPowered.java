package duck;

public class FlyRocetPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("로켓추진으로 날아 갑니다");
    }
}
