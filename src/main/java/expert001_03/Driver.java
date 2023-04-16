package expert001_03;

public class Driver {
    public static void main(String[] args) {
        Car car = new Car();
        car.setTire(new KoreaTire());
        System.out.println(car.getTireBrand());
    }
}

