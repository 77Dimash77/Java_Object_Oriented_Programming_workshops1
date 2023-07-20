package ru.gb.final_famly_tree.Presentor;


import ru.gb.final_famly_tree.Model.Gender;
import ru.gb.final_famly_tree.View.View;

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
