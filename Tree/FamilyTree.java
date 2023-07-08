package ru.gb.homework1_famly_tree.Tree;

import ru.gb.homework1_famly_tree.Auxiliary.HumanComporatorByAge;
import ru.gb.homework1_famly_tree.Auxiliary.HumanComporatorByName;
import ru.gb.homework1_famly_tree.Auxiliary.HumanComporatorBySurname;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree implements Serializable,Iterable<Human> {
    private String family;
    private List<Human> humanList;

    public FamilyTree(String clan) {
        this.family = clan;
        humanList = new ArrayList<>();
    }

    public void addHuman(Human human) {
        humanList.add(human);
    }

    public String getFamilyInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список людей:\n");
        for (Human human : humanList) {
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return getFamilyInfo();
    }
    public void sortByName() {
        humanList.sort(new HumanComporatorByName());
    }

    public void sortBySurname() {
        humanList.sort(new HumanComporatorBySurname());
    }
    public void sortByAge(){
        humanList.sort(new HumanComporatorByAge());
    }
    @Override
    public Iterator<Human> iterator() {
        return humanList.iterator();
    }
}

