package 챕터6.templetMethodPattern;

public class Cat extends Animal {
    @Override
    // 추상 메서드 오버라이딩
    void play() {
        System.out.println("키야아아악!");
    }

    @Override
    // Hook(갈고리) 메서드 오버라이딩
    void runSomething() {
        System.out.println("키야아아아ㅏㄱ!");
    }
}
