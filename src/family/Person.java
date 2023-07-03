package family;

public class Person {
    private String name;
    private String mothersName;
    private String fathersName;

    public Person(String name, String mothersName, String fathersName) {
        this.name = name;
        this.mothersName = mothersName;
        this.fathersName = fathersName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", mothersName='" + mothersName + '\'' +
                ", fathersName='" + fathersName + '\'' +
                '}';
    }
}
