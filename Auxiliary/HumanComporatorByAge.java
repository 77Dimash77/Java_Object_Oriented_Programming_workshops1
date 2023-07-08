package ru.gb.homework1_famly_tree.Auxiliary;

import ru.gb.homework1_famly_tree.Tree.Human;

import java.util.Comparator;

public class HumanComporatorByAge implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
    }
}