package 챕터6.factoryMethodPattern;

public class Cat extends Animal {
    @Override
    AnimalToy getToy() {
        return new CatToy();
    }
}
