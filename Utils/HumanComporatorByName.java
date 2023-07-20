package ru.gb.FINAL.final_famliy_tree.Utils;


import ru.gb.FINAL.final_famliy_tree.Model.Helpers.TreeItem;

import java.util.Comparator;

public class HumanComporatorByName <T extends TreeItem<T>> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
