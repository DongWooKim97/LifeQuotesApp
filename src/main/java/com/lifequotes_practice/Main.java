package com.lifequotes_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new App(sc).init();
    }
}

class App {
    Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void init() {
        System.out.println("== 명언 앱 ==");

        List<Quotes> quotesList = new ArrayList<>();

        int id = 1;
        while (true) {
            System.out.print("명령) ");
            String operation = sc.nextLine().trim();

            if (operation.equals("등록")) {
                System.out.print("명언 : ");
                String quote = sc.nextLine().trim();

                System.out.print("작가 : ");
                String author = sc.nextLine().trim();

                Quotes q = new Quotes(id, operation, quote, author);
                quotesList.add(q);

                System.out.printf("%d번 명언이 등록되었습니다.\n", id);
                id++;
            } else if (operation.equals("목록")) {
                System.out.println("번호 / 작가 / 명언\n" +
                        "----------------------");
                for (int i = quotesList.size() - 1; i >= 0; i--) {
                    Quotes tmpQ = quotesList.get(i);
                    System.out.println(tmpQ.getId() + " / " + tmpQ.getQuote() + " / " + tmpQ.getAuthor());

                }
                continue;
            } else if (operation.equals("종료")) {
                sc.close();
                break;
            } else if (operation.contains("삭제?id=")) {
                int removeId = Character.getNumericValue(operation.charAt(operation.length() - 1));

                if (quotesList.get(removeId - 1).getId() == removeId) {
                    quotesList.remove(removeId - 1);
                    System.out.printf("%d번 명언이 삭제되었습니다.\n", removeId);
                } else {
                    System.out.printf("%d번 명언은 존재하지 않습니다.\n", removeId);
                }
            } else if (operation.contains("수정?id=")) {
                int editId = Character.getNumericValue(operation.charAt(operation.length() - 1));

                System.out.println("명언(기존) : " + quotesList.get(editId - 1).getQuote());
                System.out.print("명언 : ");
                String editQuote = sc.nextLine().trim();
                quotesList.get(editId - 1).setQuote(editQuote);

                System.out.println("작가(기존) : " + quotesList.get(editId - 1).getAuthor());
                System.out.print("작가 : ");
                String editAuthor = sc.nextLine().trim();
                quotesList.get(editId - 1).setAuthor(editAuthor);
            }

        }
    }
}

class Quotes {
    private int id;
    private String operation;
    private String quote;
    private String author;

    public Quotes(int id, String operation, String quote, String author) {
        this.id = id;
        this.operation = operation;
        this.quote = quote;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
