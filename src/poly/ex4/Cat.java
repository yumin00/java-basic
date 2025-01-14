package ex4;

public class Cat implements Animal{
    @Override
    public void sound() {
        System.out.println("야옹");
    }

    @Override
    public void move() {
        System.out.println("고양이가 움직인다.");
    }
}
