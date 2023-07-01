package ru.gb.homework1_famly_tree;

import ru.gb.vending_machine_d.product.Product;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private String Rod;
    private List<Human> Humanlist;

    public FamilyTree(String Rod) {
        this.Rod = Rod;
        Humanlist = new ArrayList<>();
    }

    public void addHuman(Human human) {
        Humanlist.add(human);
    }

    public String getRodInfo(){
        StringBuilder StringBuilder = new StringBuilder();
        StringBuilder.append("Список людей:\n");
        for (Human human: Humanlist) {
            StringBuilder.append(human);
            StringBuilder.append("\n");
        }
        return StringBuilder.toString();
    }


    }

