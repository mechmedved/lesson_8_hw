public class Parent extends Human{
    public Parent(String name,int age,boolean sex, String motherName, String fatherName) {

        super(name, age, sex, motherName, fatherName);

        System.out.println("Name: " + getName() + ", " +
                "Sex: " + isSex() + ", " +
                "Age: " + getAge() + ", " +
                "MotherName: " + getMotherName() + ", " +
                "FatherName: " + getFatherName());
    }
}
