package adapter;

public class DuckTestDrive {

    public static void main(String[] args){
        MallardDuck mallardDuck = new MallardDuck();

        WildTuKey tuKey = new WildTuKey();
        Duck turkeyAdapter = new TurkeyAdapter(tuKey);


        tuKey.deddung();
        tuKey.fly();
        tuKey.gobble();

        System.out.println("거위 어댑터를 사용해보지요~~~~~~~~~~");
        System.out.println("");

        testDuck(turkeyAdapter);

        //뒤뚱메서드는 어댑터를 이용해서 출력하면 된다.
        ((TurkeyAdapter) turkeyAdapter).turKey.deddung();

    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();

    }

}
