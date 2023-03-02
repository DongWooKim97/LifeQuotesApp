package com.lifequotes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("== 명언 앱 ==");
        System.out.print("명령) ");
        String operation = sc.nextLine();
        
        System.out.print("명언 : ");
        String quotes = sc.nextLine();

        System.out.print("작가 : ");
        String author = sc.nextLine();

        System.out.println("명언) 종료");

    }
}
