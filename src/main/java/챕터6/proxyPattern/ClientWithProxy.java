package 챕터6.proxyPattern;

public class ClientWithProxy {
    public static void main(String[] args) {
        // 프록시를 이용한 호출
        IService proxy = new proxy();
        System.out.println(proxy.runSomething());
    }
}
