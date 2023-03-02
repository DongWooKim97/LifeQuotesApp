package com.lifequotes_main.view;

import java.util.Scanner;

public class InputView {

    private final Scanner sc = new Scanner(System.in);

    public String readCommand() {
        System.out.print("명령) ");
        String command = sc.nextLine();

        return command;
    }

    public String readQuote() {
        System.out.print("명언 : ");
        String quote = sc.nextLine();

        return quote;
    }

    public String readAuthor() {
        System.out.print("작가 : ");
        String author = sc.nextLine();

        return author;
    }

    public Scanner getSc() {
        return sc;
    }
}
