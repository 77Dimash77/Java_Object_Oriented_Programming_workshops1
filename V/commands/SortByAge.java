package ru.gb.homework1_famly_tree.V.commands;


import ru.gb.homework1_famly_tree.V.ConsoleUI;

public class SortByAge extends Command {
    public SortByAge(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "сортировать сриок по возросту";
    }

    public void execute() {
        consoleUI.sortByAge();
}
}