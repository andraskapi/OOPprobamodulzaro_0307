package family;

import java.util.HashMap;
import java.util.Map;

public class FamilyTree {
    private Map<Person,String>relation = new HashMap<>();

    public FamilyTree() {

    }

    public void addRelation (Person person, String relation){
        this.relation.put(person,relation);
    }

    public void printFamilyTree(Person person, String relation){


    }

}
