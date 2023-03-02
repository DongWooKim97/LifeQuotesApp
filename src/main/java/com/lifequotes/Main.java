package com.lifequotes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int id = 1;
        while(true) {
            System.out.println("== 명언 앱 ==");
            System.out.print("명령) ");
            String operation = sc.nextLine();

            System.out.print("명언 : ");
            String quote = sc.nextLine();

            System.out.print("작가 : ");
            String author = sc.nextLine();

            Quotes q = new Quotes(id, operation, quote, author);
            id++;

            break;
        }

        sc.close();
        
        System.out.println("명령) 종료");

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
