package com.lifequotes_main.view;

import java.util.Scanner;

public class InputView {

    private static final Scanner sc = new Scanner(System.in);

    public String readCommand() {
        System.out.print("명령) ");
        String command = sc.nextLine();

        return command;
    }
}
