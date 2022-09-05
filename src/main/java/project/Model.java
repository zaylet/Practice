package project;

public class Model {

    private String age;
    private String name;
    private String lastName;

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }


    public Model(String age, String name, String lastName) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
    }
}
