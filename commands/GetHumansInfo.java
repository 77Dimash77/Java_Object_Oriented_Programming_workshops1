package ru.gb.FINAL.final_famliy_tree.commands;


import ru.gb.FINAL.final_famliy_tree.View.ConsoleUI;

public class GetHumansInfo extends Command {
    public GetHumansInfo( ConsoleUI consoleUI) {
        super(consoleUI);
        description = "получить список людей";
    }
    public void execute(){
        consoleUI.getHumanListInfo();
    }
}
