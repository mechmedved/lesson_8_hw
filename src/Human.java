public class Human {

    private String name;
    private int age;
    private boolean sex;
    private String motherName;
    private String fatherName;

    public Human(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Human(String name, int age, boolean sex, String motherName, String fatherName) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.motherName = motherName;
        this.fatherName = fatherName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String isSex() {
        String name = "male";
        if(!sex) name = "female";
        return name;
    }

    public String getMotherName() {
        return motherName;
    }

    public String getFatherName() {
        return fatherName;
    }
}
