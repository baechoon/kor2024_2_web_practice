package day22.practice5;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardService5 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        ArrayList<Board>boardList=new ArrayList<>();


        while (true){
            System.out.println("1.글쓰기 2.글출력");
            int choose= scan.nextInt();

            if (choose==1){
                System.out.print("내용"); String content= scan.next();
                System.out.print("작성자"); String writer= scan.next();
                System.out.print("비밀번호"); int pwd=scan.nextInt();

                // 입력받는 데이터로 게시물 객체 생성
                Board board=new Board();
                board.comtent=content;
                board.writer=writer;
                board.pwd=pwd;

                // ArrayList 객체에 게시물 저장
                boardList.add(board);


            }//if e

            else if (choose==2) {
                for (int index=0;index<boardList.size();index++){
                        System.out.printf("작성자:%s.내용:%s \n",boardList.get(index).writer,boardList.get(index).comtent);

                }//for e

            }//else if e
        }//while e
    }//main e
}
