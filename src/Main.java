public class Main {
    public static void main(String[] args) {
        Human grandpa = new Human("Ely",58, true);
        Human grandma = new Human("Gera",54, false);
        Human grandpa1 = new Human("Cory",57, true);
        Human grandma1 = new Human("Lida",55, false);
        Human father = new Human("Noah",37, true, grandma, grandpa);
        Human mother = new Human("Rachel",32,false, grandma1, grandpa1);
        Human father1 = new Human("Oliver",35,true, grandma, grandpa);
        Human mother1 = new Human("Eho",28,false, grandma1, grandpa1);
        Human kid = new Human("Anna",12,false, mother, father);
        Human kid1 = new Human("Rita",10,false, mother, father);
        Human kid2 = new Human("Vlad",8,false, mother1, father1);

        Human [] family = new Human[7];

        family[0] = kid;
        family[1] = kid1;
        family[2] = kid2;
        family[3] = father;
        family[4] = mother;
        family[5] = grandpa;
        family[6] = grandma;

        for (Human human : family) {
            System.out.println(human.toString());
        }
    }
}