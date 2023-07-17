package ru.gb.homework1_famly_tree.M.Model;

import ru.gb.homework1_famly_tree.M.Interfaces.Contactable;
import ru.gb.homework1_famly_tree.M.Enums.Gender;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Human implements Contactable, Serializable {
    private String surname;
    private String name;
    private Gender gender;
    private LocalDate dateOfBirth;
    private LocalDate dateOfd;
    private Integer generation;
    private List<Human> children;
    private List<Human> parents;
    private Human spouse;
    private List<PhoneNumber> telephones;

    public Human(String surname, String name, Gender gender, LocalDate dateOfBirth, LocalDate dateOfd, Integer generation) {
        this.surname = surname;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.dateOfd = dateOfd;
        this.generation = generation;
        this.children = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.telephones = new ArrayList<>();

    }

    public void addChild(Human child) {
        children.add(child);
    }
    public void addParents(Human parent){parents.add(parent);}

    public void addTelephone(PhoneNumber telephone){telephones.add(telephone);}

    public void addSpouse(Human spouse) {
        this.spouse = spouse;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
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

    public int getGeneration() {
        return generation;
    }

    public List<Human> getChildren() {
        return children;
    }

    public Human getSpouse() {
        return spouse;
    }
    public List<PhoneNumber> getTelephone(){
        return telephones;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Фамилия: ").append(surname).append("\n");
        sb.append("Имя: ").append(name).append("\n");
        sb.append("Пол: ").append(gender).append("\n");
        sb.append("Дата рождения: ").append(dateOfBirth).append("\n");
        sb.append("Дата смерти: ").append(dateOfd).append("\n");
        sb.append("Поколение: ").append(generation).append("\n");

        if (!children.isEmpty()) {
            sb.append("Дети: ");
            for (Human child : children) {
                sb.append(child.getName()).append(" ").append(child.getSurname()).append(", ");
            }
            sb.delete(sb.length() - 2, sb.length()); // Удаление лишней запятой и пробела
            sb.append("\n");
        } else {
            sb.append("Детей нет\n");
        }

        if (spouse != null) {
            sb.append("Супруг(а): ").append(spouse.getName()).append(" ").append(spouse.getSurname()).append("\n");
        } else {
            sb.append("Супруг(а) отсутствует\n");
        }
        if (!parents.isEmpty()) {
            sb.append("Родители: ");
            for (Human parent : parents) {
                sb.append(parent.getName()).append(" ").append(parent.getSurname()).append(", ");
            }
            sb.delete(sb.length() - 2, sb.length()); // Удаление лишней запятой и пробела
            sb.append("\n");
        } else {
            sb.append("Родители не указаны\n");
        }
        if(!telephones.isEmpty()) {
            sb.append("Телефоны: ");
            for (PhoneNumber number: telephones){
                sb.append(number.getNumber());
            }
        }else
        {sb.append("телефон не указан\n");
        }
        return sb.toString();
    }
    public String getChildrenNames() {
        StringBuilder sb = new StringBuilder();
        for (Human child : children) {
            sb.append(child.getName()).append(" ").append(child.getSurname()).append(", ");
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 2);
        }
        return sb.toString();
    }
@Override
    public  String getContactInfo () {
    StringBuilder sb = new StringBuilder();
    for (PhoneNumber number : telephones) {
        sb.append(number.getNumber());
    }
    return sb.toString();
}

    public int compareTo(Human o) {
        return name.compareTo(o.name);
    }
}

