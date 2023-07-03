package animal;

import java.util.List;

public class Seal extends Animal{
    public Seal(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("ouv oouvw");
    }
}
