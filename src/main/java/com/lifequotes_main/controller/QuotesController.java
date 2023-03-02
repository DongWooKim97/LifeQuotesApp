package com.lifequotes_main.controller;

import com.lifequotes_main.domain.QuotesList;
import com.lifequotes_main.view.InputView;
import com.lifequotes_main.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class QuotesController {
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();

    public QuotesController() {
        outputView.printStartComment();
    }

    public void run() {
        List<QuotesList> list = new ArrayList<>();

        int id = 1;

        while (true) {
            String command = inputView.readCommand();

            if (command.equals("종료")) {
                inputView.getSc().close();
                outputView.printEndComment();
                break;

            } else if (command.equals("등록")) {
                String quote = inputView.readQuote();
                String author = inputView.readAuthor();

                QuotesList ql = new QuotesList(id, quote, author);

                list.add(ql);
                outputView.printRegisterSuccess(id);
                id++;

            }
        }


    }
}
