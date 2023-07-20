package ru.gb.final_famly_tree.commands;
import ru.gb.final_famly_tree.View.ConsoleUI;

public class Finish extends Command {
    public Finish( ConsoleUI consoleUI) {
        super(consoleUI);
        description = "завершить работу";
    }
    public void execute(){
        consoleUI.finish();
    }
}
