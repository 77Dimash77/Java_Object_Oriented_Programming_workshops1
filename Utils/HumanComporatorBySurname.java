package ru.gb.homework1_famly_tree.Utils;


import ru.gb.homework1_famly_tree.Model.Helpers.TreeItem;

import java.util.Comparator;

public class HumanComporatorBySurname<T extends TreeItem> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getSurname().compareTo(o2.getSurname());
}
}
