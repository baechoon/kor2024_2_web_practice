package day22.practice5;

import java.util.Scanner;

public class BoardService4 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        //가변길이 배열 만들기
        Board[]boardList=null;
        int count=0;

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

                count++;
                Board[]newBoardList=new Board[choose]; //새로운 배열
                // 기존배열 게시물을 새로운 배열로 이동
                if (count!=1){
                    for (int index=0;index<boardList.length;index++){
                        newBoardList[index]=boardList[index];
                    }//for e
                }//if e

                //새로운 배열의 마지막 인덱스에 입력받는 게시물 객체 저장
                newBoardList[newBoardList.length-1]=board;
                //새로운 배열을 기존 배열에 대입한다
                boardList=newBoardList;



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
}
