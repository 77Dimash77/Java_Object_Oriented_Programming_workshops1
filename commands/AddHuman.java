package ru.gb.FINAL.final_famliy_tree.commands;


import ru.gb.FINAL.final_famliy_tree.View.ConsoleUI;

public class AddHuman extends Command {
    public AddHuman( ConsoleUI consoleUI) {
        super(consoleUI);
        description = "добавть человека";
    }
    public void execute(){
        consoleUI.addHuman();
    }
}
