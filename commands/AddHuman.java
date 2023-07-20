package ru.gb.final_famly_tree.commands;


import ru.gb.final_famly_tree.View.ConsoleUI;

public class AddHuman extends Command {
    public AddHuman( ConsoleUI consoleUI) {
        super(consoleUI);
        description = "добавть человека";
    }
    public void execute(){
        consoleUI.addHuman();
    }
}
