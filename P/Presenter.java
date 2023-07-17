package ru.gb.homework1_famly_tree.P;


import ru.gb.homework1_famly_tree.M.Enums.Gender;
import ru.gb.homework1_famly_tree.M.Service;
import ru.gb.homework1_famly_tree.V.View;

import java.time.LocalDate;

public class Presenter {
    private View view;
    private Service service;
    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void addHuman(String surname, String name, Gender gender, LocalDate dateOfBirth, LocalDate
            dateOfd, Integer generation) {
        service.addHuman(surname,name,gender,dateOfBirth,dateOfd,generation);
        //kakoito ovet
        getHumanListInfo();

    }

    public void getHumanListInfo() {
        String info = service.getHumanInfo();
        view.printAnswer(info);
    }

    public void sortByAge() {
        service.sortByAge();
        getHumanListInfo();
    }

    public void sortByName() {
        service.sortByName();
        getHumanListInfo();
    }
}
