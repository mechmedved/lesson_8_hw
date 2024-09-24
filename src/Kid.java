public class Kid extends Human{

    public Kid(String name, int age, boolean sex, String motherName, String fatherName) {

        super(name, age, sex, motherName, fatherName);

        System.out.println("Name: " + getName() + ", " +
                "Sex: " + isSex() + ", " +
                "Age: " + getAge() + ", " +
                "MotherName: " + getMotherName() + ", " +
                "FatherName: " + getFatherName());
    }

}
