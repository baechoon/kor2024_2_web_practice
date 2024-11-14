package day22.practice4;
//BoardService4 모든 코드를 복사 후 진행
//기존코드: 가변길이 배열 구현 Board[]boardList=null;
//수정조건: 가변길이 배열 대신 ArrayList 컬렉션 프레임워크 수정

import java.util.ArrayList;
import java.util.Scanner;

public class BoardService5 {

    public static void main(String[] args) {

        // 입력객체
        Scanner scan = new Scanner(System.in);
        //ArrayList 선언
        ArrayList<Board> boardList = new ArrayList<>();


        while (true) {
            System.out.println("1.글쓰기 2.글출력");
            int choose = scan.nextInt();

            if (choose == 1) {
                //[1] 사용자로부터 저장할 데이터를 입력받는다
                System.out.print("내용");
                String content = scan.next();
                System.out.print("작성자");
                String writer = scan.next();
                System.out.print("비밀번호");
                int pwd = scan.nextInt();

                //[2] 입력받은 데이터로 게시물 객체 생성
                Board board = new Board();// 게시물 객체 생성
                board.content = content;
                board.writer = writer;
                board.pwd = pwd;

                //[3] 게시물 저장
                boardList.add(board);

            }//if e

            else if (choose == 2) {
                //베열 내 존재하는 게시물 모두 출력하기
                for (int index = 0; index < boardList.size(); index++) {
                    System.out.printf("작성자:%s,내용:%s\n", boardList.get(index).writer, boardList.get(index).content);


                }//for e

            }//else if e
        }//while e
    }//main e
}//class e



