package day23.practice1;
//static이란? 정적키워드 , static이 존재하는 변수 또는 메서드(함수)는 우선할당( 프로그램 실행 시 메모리에 적재) 된다
//static main 함수 안에서 다른 함수가 실행되지 않는이유?
//1. static main 함수 안에서는 호출 할 함수가 static 이어야한다
//ㄴ main 함수가 먼저 실행 되므로 호출 할 정보를 모른다
//2. tatic main 함수 안에서는 다른 클래스의 메서드를 호출하기 위해서는 객체가 필요하다
//ㄴ 객체를 생성하면 static이 아닌 메서드 정보를 읽어들인다

import java.util.ArrayList;
import java.util.Scanner;

public class BoardService7 {

    static Scanner scan= new Scanner(System.in); //정적 static 변수
    static ArrayList<Board>boardList=new ArrayList<>();// 정적변수

    static void boardWrite(){// 메서드 정의, 정적 static 변수
        System.out.print("내용: "); String content= scan.next();
        System.out.print("작성자:"); String writer= scan.next();
        System.out.print("비밀번호:"); int pwd=scan.nextInt();
        Board board=new Board(content, writer,pwd);
        boardList.add(board);

    }


    static void boardPrint(){
        for (int index=0;index<boardList.size();index++){
            System.out.printf("작성자:%s,내용:%s\n",boardList.get(index).getWriter(),boardList.get(index).getContent());
        }
    }


    public static void main(String[] args) {
        while (true){

            System.out.print("1.글쓰기 2. 글출력:");
            int choose= scan.nextInt();

            if (choose==1){
                boardWrite(); // 등록함수 호출
            } else if (choose==2) {boardPrint(); //출력함수 호출

            }
        }
    }

}
