package 챕터6.strategyPattern;

public class StrategyGrenade implements Strategy {
    @Override
    public void runStrategy() {
        System.out.println("호안에 수류탄!!!!");
    }
}
