package 챕터3;

public class 박쥐 extends 조류 implements 날수있는{
    public 박쥐() {
        myClass = "박쥐";
    }

    @Override
    public void fly() {
        System.out.println(myClass + " 날고 있삼.. 슈웅!!! 슈웅!!!");
    }
}
