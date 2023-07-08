package ru.gb.homework1_famly_tree.Auxiliary;

import ru.gb.homework1_famly_tree.Tree.Human;

import java.util.Iterator;
import java.util.List;

public class HumanIterator implements Iterator<Human> {
    private int index;
    private List<Human> humanList;

    public HumanIterator(List<Human> humanList) {
        this.humanList = humanList;
    }

    @Override
    public boolean hasNext() {
        return humanList.size()> index;
    }

    @Override
    public Human next() {
        return humanList.get(index++);
    }
}
