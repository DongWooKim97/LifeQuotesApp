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
            } else if (command.contains("?id=")) {
                String[] splitStr = command.split("\\?id=");
                String tmpCommand = splitStr[0];
                int tmpId = Integer.parseInt(splitStr[1]);

                if (isDelete(tmpCommand)) {
                    remove(tmpId);
                } else {
                    modify(tmpId);
                }
            }
        }
    }


    public boolean isDelete(String command) {
        return command.equals("삭제");
    }

    public void modify(int id) {
        Quotes q = list.get(id - 1);

        outputView.printBeforeQuote(q);
        String modifiedQuote = inputView.readQuote();

        outputView.printBeforeAuthor(q);
        String modifiedAuthor = inputView.readQuote();
        list.get(id - 1).setQuote(modifiedQuote);
        list.get(id - 1).setAuthor(modifiedAuthor);
    }

    public void remove(int id) {
        int removeId = id - 1;
        try {
            list.remove(removeId);
            outputView.printSuccessRemove(id);
        } catch (Error e) {
            outputView.printFailRemove(id);
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
