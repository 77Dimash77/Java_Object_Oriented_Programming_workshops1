package ru.gb.homework1_famly_tree.M.Tree;

import ru.gb.homework1_famly_tree.M.Model.Human;

import java.time.LocalDate;

public interface TreeItem<T> {
    String getSurname();
    int getAge();

    LocalDate getDateOfBirth();

    Human getName();
}
