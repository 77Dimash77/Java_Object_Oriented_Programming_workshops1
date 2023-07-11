package ru.gb.homework1_famly_tree.Tree;

import ru.gb.homework1_famly_tree.Comparators.HumanComporatorByAge;
import ru.gb.homework1_famly_tree.Comparators.HumanComporatorByName;
import ru.gb.homework1_famly_tree.Comparators.HumanComporatorBySurname;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree<E> implements Serializable,Iterable<E> {
    private String family;
    private List<E> humanList;

    public FamilyTree(String clan) {
        this.family = clan;
        humanList = new ArrayList<>();
    }

    public void addHuman(E human) {
        humanList.add(human);
    }

    public String getFamilyInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список людей:\n");
        for (E human : humanList) {
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
    public Iterator<E> iterator() {
        return humanList.iterator();
    }
}

