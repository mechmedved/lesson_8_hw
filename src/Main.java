public class Main {
    public static void main(String[] args) {
        Kid kid = new Kid("Anna",12,false,"Rachel","Noah");
        Kid kid1 = new Kid("Rita",10,false,"Rachel","Noah");
        Kid kid2 = new Kid("Vlad",8,false,"Rachel","Noah");
        Parent father = new Parent("Noah",37, true,"Gera","Ely");
        Parent mother = new Parent("Rachel",32,false,"Lida","Cory");
        GrandParent grandpa = new GrandParent("Ely",58, true);
        GrandParent grandma = new GrandParent("Gera",54, false);
        GrandParent grandpa1 = new GrandParent("Cory",57, true);
        GrandParent grandma1 = new GrandParent("Lida",55, false);

        Human [] family = new Human[5];

        family[0] = kid;
        family[1] = father;
        family[2] = mother;
        family[3] = grandpa;
        family[4] = grandma;

        for(int i=0; i < family.length; i++){
            HumanHelper.printHuman(family[i]);
        }

    }
}