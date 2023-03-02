package com.lifequotes_main.view;

public class OutputView {
    public void printStartComment() {
        System.out.println("== 명령 앱 시작 ==");
    }

    public void printEndComment() {
        System.out.println("== 명령 앱 종료 ==");
    }

    public void printRegisterSuccess(int id) {
        System.out.println(id + "번 명언이 등록되었습니다.");
    }

}
