package ru.gb.homework1_famly_tree.Presentor;

import ru.gb.homework1_famly_tree.Model.FamilyTree;
import ru.gb.homework1_famly_tree.Model.Human;
import ru.gb.homework1_famly_tree.Utils.HumanComporatorByAge;
import ru.gb.homework1_famly_tree.Utils.HumanComporatorByName;
import ru.gb.homework1_famly_tree.Model.Gender;


import java.time.LocalDate;

//package ru.gb.homework1_famly_tree.M;
//
//
//import ru.gb.homework1_famly_tree.M.Enums.Gender;
//import ru.gb.homework1_famly_tree.M.Model.Human;
//import ru.gb.homework1_famly_tree.M.Model.PhoneNumber;
//import ru.gb.homework1_famly_tree.M.Tree.FamilyTree;
//
//import java.time.LocalDate;
//import java.util.List;
//
//public class Service {
//    private long id;
//    private FamilyTree<Human> family;
//    private String surname;
//    private String name;
//    private Gender gender;
//    private LocalDate dateOfBirth;
//    private LocalDate dateOfd;
//    private Integer generation;
//    private List<Human> children;
//    private List<Human> parents;
//    private Human spouse;
//    private List<PhoneNumber> telephones;
//
//    public Service() {
//        family = new FamilyTree<Human>();
//    }
//        public void addHuman(String surname, String name, Gender gender, LocalDate dateOfBirth, LocalDate
//        dateOfd, Integer generation){
//            Human human = new Human(surname, name, gender, dateOfBirth, dateOfd, generation);
//            family.addHuman(human);
//        }
//        public String getHumanInfo() {
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("Humans:\n");
//            for (Human human : family) {
//                stringBuilder.append(human);
//                stringBuilder.append("\n");
//            }
//            return stringBuilder.toString();
//        }
//        public void sortByName() {
//            family.sortByName();
//        }
//        public void sortByAge() {
//            family.sortByAge();
//        }
//    }
public class Service  {



    private FamilyTree<Human> family;

    public Service() {
        this.family = new FamilyTree<Human>();
    }

    public void addHuman(String surname, String name, Gender gender, LocalDate dateOfBirth, LocalDate dateOfd, Integer generation) {
        Human human = new Human(surname, name, gender, dateOfBirth, dateOfd, generation);
        family.addHuman(human);
    }

    public String getHumanInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Humans:\n");
        for (Human human : family) {
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void sortByName() {
        family.sort(new HumanComporatorByName());
    }

    public void sortByAge() {
        family.sort(new HumanComporatorByAge());
    }
}
