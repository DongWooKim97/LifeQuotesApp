package com.lifequotes;

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
        this. sc = sc;
    }

    public void init() {
        System.out.println("== 명언 앱 ==");

        List<Quotes> quotesList = new ArrayList<>();

        int id = 1;
        while(true) {
            System.out.print("명령) ");
            String operation = sc.nextLine();

            if (operation.equals("목록")) {
                System.out.println("번호 / 작가 / 명언\n" +
                        "----------------------");
                for (int i = quotesList.size()-1; i >=0; i--) {
                    quotesList.get(i).showList();
                }
                continue;
            }

            if(operation.equals("종료")) {
                sc.close();
                break;
            }

            System.out.print("명언 : ");
            String quote = sc.nextLine();

            System.out.print("작가 : ");
            String author = sc.nextLine();

            quotesList.add(new Quotes(id, operation, quote, author));
            id++;

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

        System.out.println(this.id+"번 명언이 "+this.operation+"되었습니다.");
    }

    public void showList() {
        System.out.println(this.id +" / "+ this.author + " / " + this.quote);
    }


}
