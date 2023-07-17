package ru.gb.homework1_famly_tree.V;



import ru.gb.homework1_famly_tree.M.Enums.Gender;
import ru.gb.homework1_famly_tree.P.Presenter;

import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleUI implements View{
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    private MainMenu menu;
    public ConsoleUI(){
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
        menu = new MainMenu(this);
    }
    @Override
    public void printAnswer(String text) {
        System.out.println(text);
    }

    @Override
    public void start() {
        System.out.println("Привет\n");
        while (work) {
            System.out.println(menu.menu());
            String line = scanner.nextLine();
            // metod proverki dannih chilsko v nuzhnom diapozone
            int choice = Integer.parseInt(line);
            menu.execute(choice);
        }
    }

    public void finish() {
        System.out.println("Finish");
        work = false;

    }

    public void sortByAge() {
        presenter.sortByAge();
    }

    public void sortByName() {
        presenter.sortByName();
    }

    public void getHumanListInfo() {
        presenter.getHumanListInfo();

    }

    public void addHuman(){
        System.out.println("Введите фамилию человека");
        String surname = scanner.nextLine();
        System.out.println("Введите имя человека");
        String name = scanner.nextLine();
        System.out.println("Введите пол человека");
        String genderst = scanner.nextLine();
        System.out.println("Введите дату рождения человека");
        LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine());
        System.out.println("Введите дату с человека");
        LocalDate dateOfd = LocalDate.parse(scanner.nextLine());
        System.out.println("Введите поколение человека");
        Integer generation = scanner.nextInt();
        Gender gender = Gender.valueOf(genderst.toUpperCase());
        presenter.addHuman(surname,name,gender,dateOfBirth,dateOfd,generation);
    }
}
