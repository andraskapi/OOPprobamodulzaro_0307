package animal;

import java.util.List;

public class Lion extends Animal{
    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Roar...roar");
    }
}
