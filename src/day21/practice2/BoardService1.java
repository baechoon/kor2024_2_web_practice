package day21.practice2;

// 내용과 작성자로 구성된 게시물 3개까지 저장하는 서비스
// 조건: main 함수1개, 변수6개 , 반복문 사용
// 구현: 게시물쓰기, 게시물 출력


import java.util.Scanner;

public class BoardService1 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        // 게시물 1개 -> 내용 1개 작성자 1명--> 총 2개
        // 내용과 작성자를 담을 변수를 선언한다
        // 변수란? 하나의 데이터 또는 주소값을 저장하는 메모리
        //  ㄴ 타입이란? 변수에 저장될 데이터 또는 주소의 타입---> 기본타입과 참조타입

        String content1 = null; String writer1 = null; // 첫번째 게시물의 내용과 작성자
        String content2 = null; String writer2 = null; // 두번째 게시물의 내용과 작성자
        String content3 = null; String writer3 = null; // 세번째 게시물의 내용과 작성자

   while (true){// 무한루프

       System.out.println("1.게시물 쓰기 2.게시물 출력");
       // 값을 입력받기 위해 입력 객체 만들기
       // 값을 입력받아 변수에 저장하기
       int choose= scan.nextInt();

       if (choose==1){// 만약 입력받은 값이 1이라면 게시물 작성
            // 게시물 저장 할 내용 입력받기
           System.out.print("새로운 게시물 내용:"); String content= scan.next();
           System.out.print("새로운 게시물 작성자:"); String writer= scan.next();


           // 게시물을 저장 할 공간이 있는지 확인하기 ---> 게시물이 존재하지 않는다? => null 또는 ""

           if (content1==null){ // 만약에 content1 이 비어있다면? 저장하기

               content1=content; writer1=writer;

           }//if e

           else if (content2==null) {// 그게 아니고 content2 가 비어있으면 저장하기
               content2=content; writer2=writer;

           }//else if

           else if (content3==null) {// 그게 아니고 content3가 비어있다면 저장하기
               content3=content; writer3=writer;

           }//else if

           else { // 그게 아니면
               System.out.println("게시물 쓰기 실패 : 저장공간 없음");
           }//else e

           // 참고사항
           // 왜 여러개의 if 가 아닌 if else if 를 사용했을까?
           // 다중 if 문은 여러개의 조건에 대해 여러개의 값을 결과로 얻는다
           //if else if 문은 여러개의 조건에 대해 무조건 하나의 값만 얻는다
           // 게시물 저장은 한번만 하면 된다
           // 만약 다중 if문을 썼다면 게시물이 여러번 저장되는 결과를 얻는다




       }// if choose==1 e

       if (choose==2){// 입력값이 2라면 게시물 출력


           // 다중 if 사용  다중 값 출력
           if (content1!=null){
               System.out.printf("작성자:%s,내용:%s",writer1,content1);
           }
           if (content2==null){
               System.out.printf("작성자:%s,내용:%s",writer2,content2);
           }
           if (content3!=null){
               System.out.printf("작성자:%s,내용:%s",writer3,content3);
           }
       }//if (choose==2) e














   }// while e









    }//main e

} //class e







