package ex2;

public class AnimalPolyMain1 {
    public static void main() {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

        /*
        다형석 참조 덕분에 animal 변수는 자식인 Dog, Cat, Cow 인스턴스를 참조할 수 있다. (부모는 자식을 담을 수 있다.)
        메서드 오버라이딩 덕분에 animal.sound()를 호출해도 Dog.sound(), Cat.sound(), Cow.sound()를 호출할 수 있다.
        */

        Animal[] animalArr = {dog, cat, cow};
//        Animal[] animalArr2 = new Animal[]{dog, cat, cow};  위 코드와 동일한 것이다.

        for (Animal animal: animalArr) {
            animal.sound();
        }

        /*
        Dog, Cat, Cow는 모두 Animal의 자식이기 때문에 Animal 타입이다. 따라서 animalArr에 넣을 수 있다.
         */

        // 위 코드를 한번 더 개선해보자.
        Animal[] animalArr3 = {new Dog(), new Cat(), new Cow()};
        for (Animal animal: animalArr3) {
            animal.sound();
        }
    }

    private static void soundAnimal(Animal animal) {
        animal.sound();
    }
}

/*

 */