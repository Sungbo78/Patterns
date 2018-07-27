package adapter;

public class WildTuKey implements TurKey {
    @Override
    public void deddung() {
        System.out.println("가금류의 뒤뚱뒤뚱");
    }

    @Override
    public void gobble() {
        System.out.println("꽥글꽥글 가금류소리");
    }

    @Override
    public void fly() {
        System.out.println("나는 짧은 거리만 날아요 1미터요");
    }
}
