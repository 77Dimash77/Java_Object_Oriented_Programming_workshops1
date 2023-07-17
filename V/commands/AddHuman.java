package ru.gb.homework1_famly_tree.V.commands;


import ru.gb.homework1_famly_tree.V.ConsoleUI;

public class AddHuman extends Command {
    public AddHuman( ConsoleUI consoleUI) {
        super(consoleUI);
        description = "добавть человека";
    }
    public void execute(){
        consoleUI.addHuman();
    }
}
