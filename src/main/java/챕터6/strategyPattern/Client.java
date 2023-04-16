package 챕터6.strategyPattern;

public class Client {
    public static void main(String[] args) {
        Soldier rambo = new Soldier();

        // 총을 람보에게 전달해서 전투를 수행하게 한다.
        rambo.runContext(new StrategyGun());

        System.out.println();

        // 나이프를 람보에게 전달해서 전투를 수행하게 한다.
        rambo.runContext(new StrategyKnife());

        System.out.println();

        // 수류탄을 람보에게 전달해서 전투를 수행하게 한다.
        rambo.runContext(new StrategyGrenade());
    }
}
