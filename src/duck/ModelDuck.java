package duck;

public class ModelDuck extends Duck{
    @Override
    public void display() {
        System.out.println("저는 모델 오리 가짜죠");
    }

    //이 클래스에 맞는 변경 가능한 기능을 붙였다.
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}
