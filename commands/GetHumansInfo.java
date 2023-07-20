package ru.gb.final_famly_tree.commands;


import ru.gb.final_famly_tree.View.ConsoleUI;

public class GetHumansInfo extends Command {
    public GetHumansInfo( ConsoleUI consoleUI) {
        super(consoleUI);
        description = "получить список людей";
    }
    public void execute(){
        consoleUI.getHumanListInfo();
    }
}
