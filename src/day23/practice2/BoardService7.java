package day23.practice2;
//등록기능과 출력기능 main 밖으로 뺴내기

//static ? 정적키워드 : static 이 존재하는 변수 혹는 메서드(함수)는 우선할당 된다


import java.util.ArrayList;
import java.util.Scanner;

public class BoardService7 {

    static Scanner scan= new Scanner(System.in);
    static ArrayList<Board>boardList=new ArrayList<>();

    static void boarWrite(){
        System.out.print("내용");String content= scan.next();
        System.out.print("작성자");String writer= scan.next();
        System.out.print("비밀번호");int pwd= scan.nextInt();
        Board board=new Board(content,writer,pwd);
        boardList.add(board);
    }

    static void boardPrint(){
        for (int index=0;index<boardList.size();index++){
            System.out.printf("작성자:%s,내용:%s\n",boardList.get(index).getWriter(),boardList.get(index).getContent());
        }
    }


    public static void main(String[] args) {

        System.out.print("1.글쓰기 2.글출력");
        int choose= scan.nextInt();

        if (choose==1){
            boarWrite();
        } else if (choose==2) {
            boardPrint();

        }
    }
}
