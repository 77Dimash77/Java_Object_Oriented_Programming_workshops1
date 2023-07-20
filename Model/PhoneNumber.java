package ru.gb.final_famly_tree.Model;

import java.io.Serializable;

public class PhoneNumber implements Serializable {
    private Integer number;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public PhoneNumber(Integer number) {
        this.number = number;
    }
}
