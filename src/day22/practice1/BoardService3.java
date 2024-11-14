package day22.practice1;
//내용[String] 작성자[String] 비밀번호[int] 로 구성된 게시물 클래스 설계
// 게시물 객체 최대 100개까지 저장하는 서비스 구축
//조건:main 함수1개 배열 최데1개
//구축: 게시물 쓰기와 출력기능 구현

//타입? 데이터 형태를 분류
// ㄴ 대분류 : 기본타입 8개(byte short int long float double char boolean)---> 기본값: 정수:0 실수:0.0 논리:false
//            참조타입([]배열, 클래스 인터페잇,, 열거타입)등등---> 기본값 null
//클래스: 멤버변수(필드), 생성자, 메서드(멤버함수)로 구성된 새로운 타입 만들기
//객체: 참조타입으로 생성된 메모리 공간
//변수: 기본/참조 타입으로 생성된 메모리 공간

import java.util.Scanner;

public class BoardService3 {// 실행 클래스

    public static void main(String[] args) {
        // 입력객체
        Scanner scan= new Scanner(System.in);
        // Board 객체 100개를 저장할 수 있는 배열 선언
        Board[]boardList=new Board[100];

        while (true){
            System.out.println("1.글쓰기 2.글출력");
            int choose= scan.nextInt();

            if (choose==1){
                //[1] 사용자로 부터 저장할 데이터를 입렫받는다
                System.out.print("내용"); String content= scan.next();

                // .next() 문자여(공백x)입력, .nextLine() 문자열(공백 띄어쓰기 포함)입력
                //.nextLine() 사용시 주의점? .nextLine() 앞에 또다른 .nextxx() 존재시 의미없는 .nextLine() 작성해준다
                //예-->  scan.nextLine() ------> 의미없는 .nextLine() 코드 작성

                System.out.print("작성자:"); String writer= scan.next();
                System.out.print("비밀번호:"); int pwd= scan.nextInt();

                //[2] 배열 내 빈공간을 찾아서 게시물 작성하기
                for (int index=0;index<boardList.length;index++){
                    if (boardList[index]==null){// 만약에 인덱스 번째에 게시물이 비어있다면
                        Board board=new Board(); // 게시물 객체 생성
                        // 생성된 게시물 객체내 입력받는 값 들을 대입한다
                        board.content=content;
                        board.writer=writer;
                        board.pwd=pwd;
                        // 배열 내 index 번째 위치에 생성한 객체를 저장/대입한다
                        boardList[index]=board;
                        break;// 반복문 종료

                    }// if e
                }//for e




            }// if e

            else if (choose==2) {
                // 배열 내 존재하는 게시물 모두 출력하기
                for (int index=0;index<boardList.length;index++){
                    if (boardList[index]!=null){// 게시물이 존재한다면
                        System.out.printf("작성자:%s,내용:%s\n",
                                boardList[index].writer,boardList[index].content);
                    }//if e
                }//for e

            }//else if e
        }// while e



    }//main e
}// class e
