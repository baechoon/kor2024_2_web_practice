package day21.practice5;

import java.util.Scanner;

// 내용과 작성자로 구성된 게시물 100개까지 저장하는 서비스
// 조건: main 함수1개,반복문 사용,배열 최대2개
// 구현: 게시물쓰기, 게시물 출력
public class BoardService2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        //BoardService 1 에서 변수를 사용했는데 왜 배열변수까지 사용할까? --> 여러개의 변수에 있는 데이터를 배열로 사용하면 관리가 편함
        //배열이란? 여러개의 동일한 타입의 데이터들을 *하나의 변수*에 저장할 수 있는 타입(참조)
        //  ㄴ 인덱스란? 배열내 저장된 데이터들의 저장순서 번호--> 인덱스 번호는 0 부터 최대 길이까지 부여
        //  ㄴ 반복문과의 활용: 시작값 부터 끝 값 까지 반복

        //배열 사용이유? 여러개의 변수 (데이터)를 관리하기 힘들어서 , 단 동일한 타입이어야 함
        // 만약 다른 타입을 하나의 배열에 저장하고 싶다? class 사용

        // 배열 선언 방법? 타입[] 변수명= new 타입[저장갯수]
        String[]contnt=new String[100];//String 타입의 데이터 100개를 저장할 수 있는 배열 선언
        String[]writer=new String[100];

        while (true){// 무한루프
            System.out.println("1. 게시물 쓰기 2. 게시물 출력");
            // 값을 입력받기 위해 입력객체 생성
            // 입력 받은 값 변수에 저장
            int choose= scan.nextInt();

            if (choose==1){
                System.out.print("새로운 게시물 작성");  String cont= scan.next();
                // String content= scan.next();-> 오류
                // main 함수 안에 이미 content(지역변수)가 존재하기 때문
                // 만약 main 함수 밖으로 뺸다면? 오류가 안 난다 왜? 필드(멤버변수)이기 때문
                System.out.print("새로운 게시물 작성자"); String writ= scan.next();

                //게시물 저장공간 확인하고 저장하기
                // 반복은 인덱스 0번부터 99까지 1씩 증가하며 반복
                boolean save=false;// 스위치 변수// 초기값을 false로 지정헤 저장 실패를 뜻하고 있다
                for (int index=0;index<contnt.length;index++) {

                    if (contnt[index] == null) {
                        contnt[index] = cont;
                        writer[index] = writ;
                         save=true;
                        break;// 게시물 저장은 1개만 하면 되기 때문에 반복문 종료
                    }//if

                  // else {
                  //      System.out.println("비어있는 자리가 없습니다");
                   // } 오류가 난다 왜? 첫번째가 비어있지 않아도 뒤에 자리가 있을 수 있기 때문
               }//for e
                     // 저장여부를 알려주려면 이때 스위치 변수를 사용한다
                // 스위치 변수란 상태를 나타다는 변수이다
                // 만약  스위치 변수인 save 가 true이면 저장 성공 false이면 저장실패
                if (save=false){
                    System.out.println("게시물 쓰기 실패: 빈 공간이 없습니다");
                }
                else {
                    System.out.println("게시글 쓰기 성공");
                }


            }//if e

            if (choose==2){//게시뭉 출력
                for (int index=0;index<contnt.length;index++){
                    if (contnt[index]!=null){//만약 인덱스 번째 게시물이 존재하다면 출력
                        System.out.printf("작성자:%s,내용:%s",writer[index],contnt[index]);
                    }//if e
                }//for e

            }//if e

        }//while e

    }// maim e
}//class e
