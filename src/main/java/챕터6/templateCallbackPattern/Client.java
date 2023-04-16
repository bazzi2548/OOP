package 챕터6.templateCallbackPattern;

public class Client {
    public static void main(String[] args) {
        Soldier rambo = new Soldier();

        rambo.runContext(new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println("총 총총촟오총");
            }
        });

        System.out.println();

        rambo.runContext(new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println("칼 카가각카라");
            }
        });

        System.out.println();

        rambo.runContext(new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println("도끼! 도도독..독끼");
            }
        });
    }
}
