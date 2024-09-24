public class GrandParent extends Human{
    public GrandParent(String name,int age,boolean sex) {

        super(name,age,sex);

        System.out.println("Name: " + getName() + ", " +
                           "Sex: " + isSex() + ", " +
                           "Age: " + getAge());
    }
}
