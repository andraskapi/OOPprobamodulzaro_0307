package animal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Animal {
    private final String name;
    private List<String> nickName = new ArrayList<>();
    private static int animalCount;

    public Animal(String name) {
        this.name = name;

        animalCount++;
    }
    public static void numberOfAnimals(){
        System.out.println("A cirkuszban összesen: " + animalCount + " állat van");
    }
    public void addnickName(String nickname){

        nickName.add(nickname);
    }
    public void makeSound(){
        System.out.println("Állat hangja");
    }


    public String getName() {
        return name;
    }

    public List<String> getNickName() {
        return nickName;
    }

    public void setNickName(List<String> nickName) {
        this.nickName = nickName;
    }
}
