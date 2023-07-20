package ru.gb.FINAL.final_famliy_tree.Utils;

import ru.gb.FINAL.final_famliy_tree.Model.Helpers.TreeItem;

import java.util.Comparator;

public class HumanComporatorByAge <T extends TreeItem> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
    }
}