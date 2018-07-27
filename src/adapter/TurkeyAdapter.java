package adapter;


/*
Duck 클래스를 확장해서 기능을 넣고
전혀 다른 기능의 거위클래스를 생성자로 받는다.
이러면 어댑터가 완성?
 */

public class TurkeyAdapter implements Duck{

    TurKey turKey;

    public TurkeyAdapter(WildTuKey wildTuKey) {
        this.turKey = wildTuKey;

        //turKey.deddung();
    }


    @Override
    public void quack() {
        turKey.gobble();
    }

    @Override
    public void fly() {
        for(int i=0; i < 5;i++){
            turKey.fly();
        }

    }


}
