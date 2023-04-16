package 챕터6.adapterPattern;

public class ClientWithAdpater {
    public static void main(String[] args) {
        AdapterServicA asa1 = new AdapterServicA();
        AdapterServicB asb1 = new AdapterServicB();

        asa1.runService();
        asb1.runService();
    }
}
