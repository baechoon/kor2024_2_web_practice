package day22.practice5;

import java.util.Scanner;

public class BoardService3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        Board[] boardList=new Board[100];// 보드객체 100개 담을 수 있는 배열

        while (true){
            System.out.println("1.글쓰기 2.글출력");
            int choose= scan.nextInt();

            if (choose==1){
                System.out.print("내용"); String content= scan.next();
                System.out.print("작성자"); String writer= scan.next();
                System.out.print("비밀번호"); int pwd=scan.nextInt();

                //배열 내 빈공간 찾아서 게시물 저장하기

                for (int index=0;index<boardList.length;index++){
                    if (boardList[index]==null){
                        Board board=new Board();//게시물 객체 생성
                        //생성된 게시물 객체 내 입력 받는 값 저장하기
                        board.comtent=content;
                        board.writer=writer;
                        board.pwd=pwd;
                        //배열 내 인덱스 번째 위치에 생성객체 저장
                        boardList[index]=board;
                        break;


                    }//if e
                }//for e

            }//if e

            else if (choose==2) {
                for (int index=0;index<boardList.length;index++){
                    if (boardList[index]!=null){
                        System.out.printf("작성자:%s.내용:%s \n",boardList[index].writer,boardList[index].comtent);
                    }//if e
                }//for e

            }//else if e
        }//while e
    }//main e
}//class e
