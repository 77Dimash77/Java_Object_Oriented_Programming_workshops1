package ru.gb.homework1_famly_tree.commands;


import ru.gb.homework1_famly_tree.View.ConsoleUI;

public class SortByName extends Command {
    public SortByName(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "сортировать сриок по имени";
    }

    public void execute() {
        consoleUI.sortByName();
    }
}
