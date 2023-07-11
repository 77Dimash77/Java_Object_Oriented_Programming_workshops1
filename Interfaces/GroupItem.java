package ru.gb.homework1_famly_tree.Interfaces;

import ru.gb.homework1_famly_tree.Model.Human;

import java.time.LocalDate;

public interface GroupItem {
    String getSurname();
    int getAge();

    LocalDate getDateOfBirth();

    Human getName();
}
