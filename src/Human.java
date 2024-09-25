public class Human {

    private String name;
    private int age;
    private boolean isMale;
    private Human mother;
    private Human father;

    public Human(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    public Human(String name, int age, boolean isMale, Human father, Human mother) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.mother = mother;
        this.father = father;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String isMale() {
        String name = "Male";
        if(!isMale) name = "Female";
        return name;
    }

    public String getMother() {
        if (mother != null) {
            return mother.name;
        }
        return null;
    }

    public String getFather() {
        if(father != null) {
            return father.name;
        }
        return null;
    }
}
