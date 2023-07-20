package ru.gb.FINAL.final_famliy_tree.commands;


import ru.gb.FINAL.final_famliy_tree.View.ConsoleUI;

public abstract class Command {
    String description;
    ConsoleUI consoleUI;

    public Command(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
    }
    public String getDescription(){
        return description;
    }
    public abstract void execute();
}
