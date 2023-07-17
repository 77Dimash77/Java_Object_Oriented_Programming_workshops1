package ru.gb.homework1_famly_tree.M.Comparators;

import ru.gb.homework1_famly_tree.M.Tree.TreeItem;

import java.util.Comparator;

public class HumanComporatorByAge <T extends TreeItem> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
    }
}