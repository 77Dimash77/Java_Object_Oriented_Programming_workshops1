package ru.gb.homework1_famly_tree.commands;


import ru.gb.homework1_famly_tree.View.ConsoleUI;

public class GetHumansInfo extends Command {
    public GetHumansInfo( ConsoleUI consoleUI) {
        super(consoleUI);
        description = "получить список людей";
    }
    public void execute(){
        consoleUI.getHumanListInfo();
    }
}
