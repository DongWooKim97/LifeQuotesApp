package com.lifequotes_main.controller;

import com.lifequotes_main.view.InputView;
import com.lifequotes_main.view.OutputView;

public class QuotesController {
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();

    public QuotesController() {
        outputView.printStartComment();
    }

    public void run() {


        while (true) {
            String command = inputView.readCommand();

            if (command.equals("종료")) {
                inputView.getSc().close();
                outputView.printEndComment();
                break;
            } else if (command.equals("등록")) {
                String quote = inputView.readQuote();
                String author = inputView.readAuthor();
            }
        }


    }
}
