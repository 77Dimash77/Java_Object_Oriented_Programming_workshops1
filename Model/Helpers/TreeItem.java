package ru.gb.FINAL.final_famliy_tree.Model.Helpers;

import ru.gb.FINAL.final_famliy_tree.Model.Human;

import java.time.LocalDate;

public interface TreeItem<T> {
    String getSurname();
    int getAge();

    LocalDate getDateOfBirth();

    Human getName();
}
