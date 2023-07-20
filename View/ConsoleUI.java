
package ru.gb.homework1_famly_tree.View;

import ru.gb.homework1_famly_tree.Model.Gender;
import ru.gb.homework1_famly_tree.Presentor.Presenter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ConsoleUI implements View {
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    private MainMenu menu;

    public ConsoleUI() {
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
            try {
                int choice = Integer.parseInt(line);
                if (choice >= 1 && choice <= menu.getSize()) {
                    menu.execute(choice);
                } else {
                    System.out.println("Некорректный выбор. Пожалуйста, введите число из доступного диапазона.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Пожалуйста, введите корректное числовое значение.");
            }
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

    public void addHuman() {
        System.out.println("Введите фамилию человека");
        String surname = scanner.nextLine();
        System.out.println("Введите имя человека");
        String name = scanner.nextLine();
        System.out.println("Введите пол человека (male/female)");
        String genderInput = scanner.nextLine().toLowerCase();
        Gender gender = Gender.valueOf(genderInput);

        System.out.println("Введите дату рождения человека (в формате MM.dd.yyyy)");
        String dateOfBirthInput = scanner.nextLine();
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthInput, DateTimeFormatter.ofPattern("MM.dd.yyyy"));

        System.out.println("Введите дату смерти человека (в формате MM.dd.yyyy)");
        String dateOfDeathInput = scanner.nextLine();
        LocalDate dateOfD = LocalDate.parse(dateOfDeathInput, DateTimeFormatter.ofPattern("MM.dd.yyyy"));

        System.out.println("Введите поколение человека (целое число)");
        int generation = scanner.nextInt();
        scanner.nextLine();

        presenter.addHuman(surname, name, gender, dateOfBirth, dateOfD, generation);
    }
}