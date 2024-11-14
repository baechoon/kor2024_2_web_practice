package day21.practice3;
// 내용과 작성자로 구성된 게시물 3개까지 저장하는 서비스
// 조건: main 함수1개, 변수6개 , 반복문 사용
// 구현: 게시물쓰기, 게시물 출력


import java.util.Scanner;

public class BoardService1 {
    public static void main(String[] args) {//main 역할-> 번역된 코드를 실행하는 기능
        Scanner scan= new Scanner(System.in);
        // 게시물 1개--> 내용 1개 작성자 1명 --> 총 2개
        // 변수를 선언해야 한다
        // 변수란? 하나의 데이터 또는 주소값을 저장하는 매모라
        //   ㄴ 타입이란? 변수에 저장될 데이터 또는 주소값을 타입 -> 기본타입과 참조타입

        String content1=null; String writer1=null;// 첫번째 게시뭏의 내용과 작성자
        String content2=null; String writer2=null;// 두번째 게시뭏의 내용과 작성자
        String content3=null; String writer3=null;// 세번째 게시뭏의 내용과 작성자

         while (true){// 무한루프
             System.out.println("1. 게시물 작성 2. 게시물 출력");
             // 선택값을 입력받기 위해 입력객체 생성

             int choose= scan.nextInt(); // 입력받은 값 변수에 저장

             if (choose==1){// 1번 선택 -> 게시물 쓰기

                 // 게시물에 저장할 내용 입력받기

                 System.out.print("새로운 게시물 내용"); String content= scan.next();
                 System.out.print("새로운 게시물 작성자");  String writer= scan.next();

                 // 게시물을 저장 할 공간이 있는 지 체크하기 --> 게시물이 존재하지 않는다는 뜻은? null 또는 ""

                 if (content1==null){//content1에 게시물이 존재하지 않는다면 입력 받는 값 저장
                     content1=content; writer1=writer;

                 }// if e
                 else if (content2==null) {//content2에 게시물이 존재하지 않는다면 입력 받는 값 저장
                     content2=content; writer2=writer;
                 }//else if e
                 else if (content3==null) {//content3에 게시물이 존재하지 않는다면 입력 받는 값 저장
                     content3=content; writer3=writer;

                 }//else if

                 else {
                     System.out.println("게시물 쓰기 실패: 저장공간이 없습니다");
                 }// else e

                 // 알아둘 점
                 // 여기서 왜 다중if가 아닌 else if 문을 사용했을까?
                 // 다중 if -> 다중 조건에 대한 여러개의 값을 가질 수 있다
                 // else if -> 다중 조건에 대해서 무조건 1개으 값을 가진다
                 // 게시글을 저장할 떄는 게시물이 한번만 저장하면 된다 ---> 그렇기에 else if 를 사용했다
                 // 만약 다중 if를 사용했다면?
                 // content 1. 2. 3 이 모두 비어있었다면? ---> 게시뭏이 3번 저장



             } // if e

             if (choose==2){ // 만약 2번을 선택-> 게시물 출력

                 if (content1!=null){// 게시물이 비어있지 않다면? --> 게시뭏이 존재한다면 출력
                     System.out.printf("작성자:%s,내용:%s",writer1,content1);
                 }// if e

                 if (content2!=null){
                     System.out.printf("작성자:%s,내용:%s",writer2,content2);

                 }//if e

                 if (content3!=null){
                     System.out.printf("작성자:%s,내용:%s",writer3,content3);
                 }//if e

                 //  출력은 다중 if 사용--> 다중의 결과값을 얻는다


             }// if e


         }//while e




    }
}
