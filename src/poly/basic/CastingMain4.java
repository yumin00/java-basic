package basic;

public class CastingMain4 {
    public static void main() {
        Parent parent1 = new Parent();
        call(parent1);
        Parent parent2 = new Child();
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();

        if (parent instanceof Child child) {
            child.childMethod();
        }
    }
}
