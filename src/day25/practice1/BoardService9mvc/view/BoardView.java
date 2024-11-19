package day25.practice1.BoardService9mvc.view;


import day25.practice1.BoardService9mvc.controller.BoardController;
import day25.practice1.BoardService9mvc.model.BoardDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardView {
    // ----------- 싱글톤 --------------- //
    //1. 지정한 클래스의 private static 객체를 생성한다.
    private static BoardView boardView = new BoardView();
    //2. 지정한 클래스는 외부로부터 객체 생성을 차단한다.
    private BoardView(){}
    //3. 내부의 객체를 외부로 부터 직접접근이 아닌 간접접근 할수 있도록 getter 함수를 만들어준다.
    public static BoardView getInstance(){
        return boardView;
    }
    // --------------------------------- //
    Scanner scan = new Scanner( System.in); // 입력객체

    public void mainPage(){ // view 시작 함수
        while (true){
            System.out.print("1.게시물등록 2.게시물출력 : ");
            int choose = scan.nextInt();
            if( choose == 1 ){
                boardWrite();
            }
            else if( choose == 2 ){
                boardPrint();
            }
        } // w end
    } // m end


    // 1. 게시물 등록 함수
    void boardWrite( ){
        scan.nextLine(); // 1. 입력
        System.out.print("게시물 내용: "); String content = scan.nextLine();
        System.out.print("게시물 작성자: "); String writer = scan.next();
        System.out.print("게시물 비밀번호: "); int pwd = scan.nextInt();
        boolean result = BoardController.getInstance().boardWrite( content , writer , pwd );
        if( result ){    System.out.println("게시물 등록 성공"); }
        else{   System.out.println("게시물 등록 실패"); }
    } // m end

    // 2. 게시물 출력 함수
    void boardPrint( ){
        ArrayList<BoardDto> result  = BoardController.getInstance().boardPrint();
        for( int index = 0 ; index<= result.size()-1 ; index++ ){
            System.out.print("게시내용 : " + result.get( index ).getContent() );
            System.out.println("작성자 : " + result.get( index ).getWriter() );
        } // for end
    } // m end



} // class end





