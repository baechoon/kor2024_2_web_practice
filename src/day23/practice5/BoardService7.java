package day23.practice5;
//main 함수 밖으로 등록함수와 출력함수 빼내기
//static - 정적 키워드 static이 존재하는 변수 혹은 메서드(함수)는 우선할당된다

import java.util.ArrayList;
import java.util.Scanner;

public class BoardService7 {

    static Scanner scan=new Scanner(System.in);
    static ArrayList<Board>boardList=new ArrayList<>();

    static void boardWriter(){
        System.out.print("내용:");String content= scan.next();
        System.out.print("작성자");String writer= scan.next();
        System.out.print("비밀번호");int pwd=scan.nextInt();
        Board board=new Board(content,writer,pwd);
        boardList.add(board);
    }

    static void boardPrint(){
        for (int index=0;index<boardList.size();index++){
            System.out.printf("작성자:%s,내용:%s",boardList.get(index).getWriter(),boardList.get(index).getContent());
        }
    }
}
