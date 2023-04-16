package 챕터3;

import java.util.*;

public class MouseDriver {
    public static void main(String[] args) {
        Mouse mickey = new Mouse();
        mickey.name = "미키";
        mickey.age = 85;

        mickey.sing();

        mickey = null;

        Mouse jerry = new Mouse();
        jerry.name = "제리";
        jerry.age = 74;

        jerry.sing();
        System.out.println("제리의 꼬리는? " + Mouse.countOfTail);
        jerry = null;

    }
}
