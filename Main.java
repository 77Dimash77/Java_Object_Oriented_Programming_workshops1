package ru.gb.homework1_famly_tree;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree("Mukashev");
        Human human_1 = new Human("Mukashev","Dimash",Gender.Male, LocalDate.of(1992,8,2),null,1);
        Human human_2 = new Human("Mukashev","Bagdat",Gender.Male, LocalDate.of(1975,7,5),null,2);
        Human human_3 = new Human("Mukashev","Galia",Gender.female, LocalDate.of(1976,9,7),null,2);

        Human human_4 = new Human("Arifov","Sagdat",Gender.Male, LocalDate.of(1992,8,2),null,3);
        Human human_5 = new Human("Arifova","Fatima",Gender.female, LocalDate.of(1975,7,5),null,3);
        Human human_6 = new Human("Arifov","Dastan",Gender.Male, LocalDate.of(1976,9,7),null,2);

        human_1.addSpouse(null);
        human_2.addSpouse(human_3);
        human_3.addSpouse(human_2);
        human_2.addChild(human_1);
        human_3.addChild(human_1);

        human_4.addSpouse(human_5);
        human_5.addSpouse(human_4);
        human_4.addChild(human_3);
        human_5.addChild(human_3);
        human_4.addChild(human_6);
        human_5.addChild(human_6);

        familyTree.addHuman(human_1);
        familyTree.addHuman(human_2);
        familyTree.addHuman(human_3);
        familyTree.addHuman(human_4);
        familyTree.addHuman(human_5);
        familyTree.addHuman(human_6);

        System.out.println(familyTree.getRodInfo());
        System.out.println(human_2.getChildrenNames());
    }

}
