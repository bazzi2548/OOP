package 챕터6.templetMethodPattern;

public class Driver {
    public static void main(String[] args) {
        Dog bolt = new Dog();
        Cat kitty = new Cat();

        bolt.playWithOwner();

        System.out.println();
        System.out.println();

        kitty.playWithOwner();
    }
}
