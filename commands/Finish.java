package ru.gb.FINAL.final_famliy_tree.commands;
import ru.gb.FINAL.final_famliy_tree.View.ConsoleUI;

public class Finish extends Command {
    public Finish( ConsoleUI consoleUI) {
        super(consoleUI);
        description = "завершить работу";
    }
    public void execute(){
        consoleUI.finish();
    }
}
