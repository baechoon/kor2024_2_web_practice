package day23.practice4;
//main 함수 밖으로 등록함수 출력함수 뺴내기

//static이란 정적 키워드로 static 이 존재하는 변수 혹은 메서드(함수)는 우선할당된다

import java.util.ArrayList;
import java.util.Scanner;

public class BoardService7 {

    static Scanner scan=new Scanner(System.in);
    static ArrayList<Board>boardsList=new ArrayList<>();

    static void boardWrite(){
        System.out.print("내용");String content= scan.next();
        System.out.print("작성자"); String writer= scan.next();
        System.out.print("비밀번호"); int pwd= scan.nextInt();
        Board board=new Board(content,writer,pwd);
        boardsList.add(board);
    }

    static void boardPrint(){
        for (int index=0;index<boardsList.size();index++){
            System.out.printf("작성자:%s, 내용:%s\n",boardsList.get(index).getWriter(),boardsList.get(index).getContent());
        }
    }


    public static void main(String[] args) {

        while (true){
            System.out.println("1.글쓰기 2.글출력");
            int choose= scan.nextInt();

            if (choose==1){
                boardWrite();
            } else if (choose==2) {
                boardPrint();

            }

        }
    }
}
