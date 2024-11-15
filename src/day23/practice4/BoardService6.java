package day23.practice4;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardService6 {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        ArrayList<Board>boardList=new ArrayList<>();

        while (true){
            System.out.println("1.글쓰기 2.글출력");
            int choose= scan.nextInt();

            if (choose==1){
                System.out.print("내용"); String content= scan.next();
                System.out.print("작성자"); String writer= scan.next();
                System.out.print("비밀번호"); int pwd=scan.nextInt();
                Board board=new Board(content,writer,pwd);
                boardList.add(board);
            } else if (choose==2) {
                for (int index=0;index<boardList.size();index++){
                    System.out.printf("작성자:%s,내용:%s\n",boardList.get(index).getWriter(),boardList.get(index).getContent());
                }

            }
        }

    }

}
