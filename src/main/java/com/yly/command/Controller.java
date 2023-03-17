package com.yly.command;

import java.util.ArrayList;

public class Controller {

    private Command command;

    public Controller(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
