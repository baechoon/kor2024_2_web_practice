package day22.practice3;
//BoardService3 모든 코드 복사후 진행
// 기존코드: 고정길이인 Board[]boardList=new Board[100];
// 수정조건: 고정길이가 아닌 가변길이 형식으로 수정하여 100개가 아닌 무한개 저장가능한 가변길이 배열 만들기
//이유? 가변길이의 여러개 데이터 관리할 때는 컬렉션 프레임 워크 (ArrayList)-> 실무  가변배열-> 시험/ 코테

import java.util.Scanner;

public class BoardService4 {
    public static void main(String[] args) {
        //입력객체
        Scanner scan = new Scanner(System.in);
        // 가변길이 배열 만들기 예제
        Board[] boardList = null;
        int count = 0;// 현재 게시물 수를 저장하는 변수

        while (true) {
            System.out.println("1.글쓰기 2. 글출력");
            int choose = scan.nextInt();

            if (choose == 1) {
                //[1] 사용자로 부터 저장 할 데이터를 입력받는다
                System.out.print("내용:");
                String content = scan.next();
                // .next() 문자여(공백x)입력, .nextLine() 문자열(공백 띄어쓰기 포함)입력
                //.nextLine() 사용시 주의점? .nextLine() 앞에 또다른 .nextxx() 존재시 의미없는 .nextLine() 작성해준다
                //예-->  scan.nextLine() ------> 의미없는 .nextLine() 코드 작성
                System.out.print("작성자");
                String writer = scan.next();
                System.out.print("비밀번호");
                int pwd = scan.nextInt();

                //[2] 입력받은 데이터로 게시물 객체 생성
                Board board = new Board(); // 게시물 객체 생성
                board.content = content;
                board.writer = writer;
                board.pwd = pwd;
                //[3]
                count++; // 게시물 수 1 증가
                Board[] newBoardList = new Board[count];// 새로운 배열 생성
                //기존 배열 내 게시물 들을 새로운 배열에 이동하기--> 배열복사
                if (choose != 1) {// 만약 기존 배열 내 새로운 게시물이 존재한다면
                    for (int index = 0; index < boardList.length; index++) {
                        newBoardList[index] = boardList[index];
                        //기존 배열 내 게시물들을 새로운 배열에 대입/복사
                    }//for e

                    //새로운 배열 내 마지막 인덱스(배열명.length-1)에 입력받는 게시물 객체 등록
                    newBoardList[newBoardList.length - 1] = board;
                    //**새로운 배열을 기존 배열에 대입한다
                    boardList = newBoardList;


                }//if e

            }//if e

            else if (choose == 2) {
                //배열 내 존재하는 게시물 모두 출력하기
                for (int index = 0; index < boardList.length; index++) {
                    if (boardList[index] != null) {// 게시물이 존재한다면
                        System.out.printf("작성자:%s, 내용:%s\n", boardList[index].writer, boardList[index].content);
                    }//if e
                }//for e

            }//else if e
        }//while e
    }//main e
}//class e

