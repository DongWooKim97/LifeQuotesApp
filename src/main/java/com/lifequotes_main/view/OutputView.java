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

    public void printShowListComment() {
        System.out.println("번호 / 작가 / 명언\n" +
                "----------------------");
    }

    public void printFailRemove(int id) {
        System.out.println(id + "번 명언은 존재하지 않습니다.");
    }

    public void printSuccessRemove(int id) {
        System.out.println(id + "번 명언이 삭제되었습니다.");
    }

}
