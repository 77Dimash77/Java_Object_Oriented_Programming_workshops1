package ru.gb.homework1_famly_tree;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Human {
    private String familia;
    private String imia;
    private Gender gender;
    private LocalDate dateOfBirth;
    private LocalDate dateOfd;
    private Integer pokolenie;
    private List<Human> children;
    private Human spouse;

    public Human(String familia, String imia, Gender gender, LocalDate dateOfBirth, LocalDate dateOfd, Integer pokolenie) {
        this.familia = familia;
        this.imia = imia;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.dateOfd = dateOfd;
        this.pokolenie = pokolenie;
        this.children = new ArrayList<>();

    }

    public void addChild(Human child) {
        children.add(child);
    }

    public void addSpouse(Human spouse) {
        this.spouse = spouse;
    }

    public String getFamilia() {
        return familia;
    }

    public String getImia() {
        return imia;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDate getDateOfDeath() {
        return dateOfd;
    }

    public int getPokolenie() {
        return pokolenie;
    }

    public List<Human> getChildren() {
        return children;
    }

    public Human getSpouse() {
        return spouse;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Фамилия: ").append(familia).append("\n");
        sb.append("Имя: ").append(imia).append("\n");
        sb.append("Пол: ").append(gender).append("\n");
        sb.append("Дата рождения: ").append(dateOfBirth).append("\n");
        sb.append("Дата смерти: ").append(dateOfd).append("\n");
        sb.append("Поколение: ").append(pokolenie).append("\n");

        if (!children.isEmpty()) {
            sb.append("Дети: ");
            for (Human child : children) {
                sb.append(child.getImia()).append(" ").append(child.getFamilia()).append(", ");
            }
            sb.delete(sb.length() - 2, sb.length()); // Удаление лишней запятой и пробела
            sb.append("\n");
        } else {
            sb.append("Детей нет\n");
        }

        if (spouse != null) {
            sb.append("Супруг(а): ").append(spouse.getImia()).append(" ").append(spouse.getFamilia()).append("\n");
        } else {
            sb.append("Супруг(а) отсутствует\n");
        }

        return sb.toString();
    }
    public String getChildrenNames() {
        StringBuilder sb = new StringBuilder();
        for (Human child : children) {
            sb.append(child.getImia()).append(" ").append(child.getFamilia()).append(", ");
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 2);
        }
        return sb.toString();
    }
}

