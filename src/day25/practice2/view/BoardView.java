package day25.practice2.view;

import day25.practice2.BoardService9mvc.controller.BoardController;
import day25.practice2.BoardService9mvc.model.BoardDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardView {
    Scanner scan = new Scanner(System.in);
    // 게시물 등록함수

    void boardWrite() {
        System.out.print("게시물내용");
        String content = scan.next();
        System.out.print("게시물 작성자");
        String writer = scan.next();
        System.out.print("게시물 비밀번호");
        int pwd = scan.nextInt();
        boolean result = BoardController.getInstance().boardWrite(content, writer, pwd);
        if (result) {
            System.out.println("게시물 등록 성공");
        } else {
            System.out.println("게시물 등록실패");
        }
    }

    void boardPrint(){
        ArrayList<BoardDto>result=BoardController.getInstance().boardPrint();
        for (int index=0;index< result.size();index++){
            System.out.print("게시내용:"+result.get(index).getContent());
            System.out.println("작성자:"+result.get(index).getWriter());
        }
    }

    //싱글톤 만들기
    private static BoardView boardView=new BoardView();
    private BoardView(){}
    public static BoardView getInstance(){
        return boardView;
    }

    public void mainPage(){
        while (true){
            System.out.print("1 게시물등록 2 게시물출력");
            int choose=scan.nextInt();
            if (choose==1){
                boardWrite();
            } else if (choose==2) {
                boardPrint();

            }
        }
    }

}