package com.lifequotes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new App().init();
    }
}

class App {

    public void init() {
        Scanner sc = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");

        int id = 1;
        while(true) {
            System.out.print("명령) ");
            String operation = sc.nextLine();

            if(operation.equals("종료")) {
                sc.close();
                break;
            }

            System.out.print("명언 : ");
            String quote = sc.nextLine();

            System.out.print("작가 : ");
            String author = sc.nextLine();

            Quotes q = new Quotes(id, operation, quote, author);
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
}
