package day25.practice3.BoardService9mvc.view;

import day25.practice3.BoardService9mvc.controller.BoardController;
import day25.practice3.BoardService9mvc.model.BoardDto;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class BoardView {
    Scanner scan = new Scanner(System.in);

    //게시물 등록함수
    void boardWrite() {
        System.out.print("게시물 내용");
        String content = scan.next();
        System.out.print("게시물 작성자");
        String writer = scan.next();
        System.out.print("비밀번호");
        int pwd = scan.nextInt();
        boolean result = BoardController.getInstance().boardWrite(content, writer, pwd);
        if (result) {
            System.out.println("게시물 등록성공");
        } else {
            System.out.println("게시물 등록 실패");
        }


    }

    //게시물 출력함수
    void boardPrint() {
        ArrayList<BoardDto> result = BoardController.getInstance().boardPrint();
        for (int index = 0; index < result.size(); index++) {
            System.out.print("게시내용" + result.get(index).getContent());
            System.out.println("작성자" + result.get(index).getWriter());
        }
    }


    //싱글톤

    private static BoardView boardView = new BoardView();

    private BoardView() {
    }

    public static BoardView getInstance() {
        return boardView;
    }

    public void mainPage() {
        while (true){
            System.out.println("1 게시물 등록 2 게시물 출력");
            int choose=scan.nextInt();
            if (choose==1){
                boardWrite();
            } else if (choose==2) {
                boardPrint();

            }
        }
    }
}
