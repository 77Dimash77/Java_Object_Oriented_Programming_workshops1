package ru.gb.homework1_famly_tree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FamilyTree implements Serializable {
    private String family;
    private List<Human> humanList;

    public FamilyTree(String rod) {
        this.family = rod;
        humanList = new ArrayList<>();
    }

    public void addHuman(Human human) {
        humanList.add(human);
    }

    public String getFamilyInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список людей:\n");
        for (Human human: humanList) {
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    @Override
    public String toString(){
        return getFamilyInfo();
    }

    }

