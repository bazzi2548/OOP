package 챕터3;

public class 참새 extends 조류 implements 날수있는{
    public 참새() {
        myClass = "조류";
    }

    @Override
    public void fly() {
        System.out.println(myClass + " 날고 있삼.. 슈웅!!! 슈웅!!!");
    }
}
