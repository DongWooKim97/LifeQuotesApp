package com.lifequotes_main.controller;

import com.lifequotes_main.view.InputView;

public class QuotesController {
    private final InputView inputView = new InputView();


    public void run() {
        System.out.println("== 명언 앱 ==");
        String command = inputView.readCommand();
    }
}
