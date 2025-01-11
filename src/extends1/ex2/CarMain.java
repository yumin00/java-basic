package ex2;

public class CarMain {
    public static void main() {
        ElectricCar car1 = new ElectricCar();
        car1.move();
        car1.charge();

        GasCar car2 = new GasCar();
        car2.move();
        car2.fillUp();
    }
}

/*
자바에서는 다중 상속을 허용하지 않는다.
즉 한 클래스당 하나의 부모만 가질 수 있다.
 */

/*
상속을 사용함으로써 중복을 줄일 수 있고, 새로운 클래스가 생성될 때에도 편리하게 확장할 수 있다.
 */