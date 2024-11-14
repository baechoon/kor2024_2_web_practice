package day22.practice1;
//BoardService4 모든 코드를 복사 후 진행
//기존코드: 가변길이 배열 구현 Board[]boardList=null;
//수정조건: 가변길이 배열 대신 ArrayList 컬렉션 프레임워크 수정

// 컬렉션(수집) 프레임워크(미리만들어진구조): (데이터)수집 관련 클래스들
// ㄴ 여러개의 데이터들을 하나의 객체에서 관리하기 위해서
//대표 인터페이스: List Set Map
//ArrayList 클래스
//ㄴ 대표함수
//ㄴ add(새로운 객체): 리스트내 지정한 객체 저장하는 함수
//ㄴ get(인덱스): 리스트 내 지정한 인덱스에 객체 반환 함수
//ㄴ size(): 리스트 내 저장한 총 객체 수 반환함수
//ㄴ remove(인덱스): 리스트내 지정한 인덱스에 객체 삭제하는 함수

import java.util.ArrayList;
import java.util.Scanner;

public class BoardService5 {

    public  static void main(String[] args) {
        // 입력객체
        Scanner scan= new Scanner(System.in);
      // 컬렉션 프레임 워크 중 ArrayList 클래스를 이용해서 배열타입을 대체한다 // 배열(고정길이) vs 컬렉션 프레임워크(가변길이)
        ArrayList<Board>boardList=new ArrayList<>();
        //ArrayList<제네릭타입>: 리스트객체에 저장할 여러개 객체들의 타입

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

                //[2] 입력받는 데이터로 게시물 객체 생성
                Board board=new Board();// 게시물 객체 생성
                board.content=content;
                board.writer=writer;
                board.pwd=pwd;

                //[3] 컬렉션 프레임워크인 리스트 객체에 개시물을 저장한다
                boardList.add(board);


            }// if e

            else if (choose==2) {
                // 배열 내 존재하는 게시물 모두 출력하기
                for (int index=0;index<boardList.size();index++){
                        System.out.printf("작성자:%s,내용:%s\n",
                                boardList.get(index).writer, boardList.get(index).content);

                }//for e

            }//else if e
        }// while e



    }//main e
}//class e
