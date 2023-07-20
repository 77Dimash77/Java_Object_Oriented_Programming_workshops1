package ru.gb.FINAL.final_famliy_tree.commands;


import ru.gb.FINAL.final_famliy_tree.View.ConsoleUI;

public class SortByName extends Command {
    public SortByName(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "сортировать сриок по имени";
    }

    public void execute() {
        consoleUI.sortByName();
    }
}
