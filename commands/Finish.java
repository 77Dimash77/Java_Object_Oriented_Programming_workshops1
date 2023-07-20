package ru.gb.homework1_famly_tree.commands;
import ru.gb.homework1_famly_tree.View.ConsoleUI;

public class Finish extends Command {
    public Finish( ConsoleUI consoleUI) {
        super(consoleUI);
        description = "завершить работу";
    }
    public void execute(){
        consoleUI.finish();
    }
}
