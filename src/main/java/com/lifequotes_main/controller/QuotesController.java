package com.lifequotes_main.controller;

import com.lifequotes_main.domain.Quotes;
import com.lifequotes_main.view.InputView;
import com.lifequotes_main.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class QuotesController {
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    private List<Quotes> list = new ArrayList<>();

    public QuotesController() {
        outputView.printStartComment();
    }

    public void run() {
        int id = 1;

        while (true) {
            String command = inputView.readCommand();

            if (command.equals("종료")) {
                inputView.getSc().close();
                outputView.printEndComment();
                break;

            } else if (command.equals("등록")) {
                register(id);
                id++;

            } else if (command.equals("목록")) {
                outputView.printShowListComment();
                showList();
            }
        }
    }

    public void register(int id) {
        String quote = inputView.readQuote();
        String author = inputView.readAuthor();

        Quotes q = new Quotes(id, quote, author);

        list.add(q);
        outputView.printRegisterSuccess(id);
    }

    public void showList() {
        for (int i = list.size() - 1; i >= 0; i--) {
            Quotes q = list.get(i);
            System.out.printf("%d / %s / %s\n", q.getId(), q.getQuote(), q.getAuthor());
        }

    }


}
