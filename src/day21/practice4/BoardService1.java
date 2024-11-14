package day21.practice4;
// 내용과 작성자로 구성된 게시물 3개까지 저장하는 서비스
// 조건: main 함수1개, 변수6개 , 반복문 사용
// 구현: 게시물쓰기, 게시물 출력

import java.util.Scanner;

public class BoardService1 {
    public static void main(String[] args) {// main 역할? 번역된 코드를 실행
        Scanner scan= new Scanner(System.in);
        // 저장소 설계하기  --> 게시물 1개 => 내용 1개 작성자 1명 => 총 2개
        // 변수를 선언해야 한다
        // 변수린? 하나의 데이터 또는 주소값을 저장하는 메모리
        //  ㄴ 타입이란? 변수에 저장될 데이터 또는 주소값의 타입--> 기본타입과 참조타입

        String content1= null ; String writer1=null; // 첫번째 게시물의 내용과 작성자
        String content2= null ; String writer2=null; // 두번째 게시물의 내용과 작성자
        String content3= null ; String writer3=null; // 세번째 게시물의 내용과 작성자

        while (true){// 무한루프

            System.out.println("1. 게시물 쓰기 2. 게시물 출력");
            // 값을 입력받기 위해 입력객체 생성
            // 입력 받은 값 변수에 저장하기
            int choose= scan.nextInt();


            if (choose==1){// 만약 입력받은 값이 1 이라면 게시글 작성

                // 게시물에 저장할 내용 입력받기

                System.out.print("새로운 게시물 내용 :" ); String content= scan.next();
                System.out.print("새로운 게시물 작성자 ");String writer= scan.next();

                // 게시뭏을 저장 할 공간이 있는지 체크하기-- 게시물이 존재하지 않는다는 뜻? --> null또는 " "


                if (content1==null){// 만약 content1이 비어있다면 입력받는 값 저장
                    content1=content;
                    writer1=writer;
                }// ir e
                else if (content2==null) { // 그게 아니고 content2 이 비어있다면 입력받는 값 저장
                    content2=content;
                    writer2=writer;

                }//else if e

                else if (content3==null) {
                    content3=content;
                    writer3=writer;

                }//else if

                else {// 그게 아니면
                    System.out.println(" 게시물 쓰기 실패: 빈공간이 없습니다");
                }// else e

                // 여기서 왜 다중 if 가 아닌 if else if 를 사용했을까?
                // 다중 if 는 다중 조건에 대한 여러개의 값을 가질 수 있다
                // if else if 는 다중조건에 대한 단 하나의 값만 가진다
                // 게시물을 저장하는 것은 1번만 저장하면 된다
                // 만액 다중 if 를 썼다면? --> 다중 조건을 충족할 시 게시물이 여러번 저장되게 된다
                // 따라서 else if 문을 사용해야 한다


            }//if

            if (choose==2){// 게시물 출력

                if (content1!=null){ // 게시물이 존재한다면
                    System.out.printf("작성자:%s, 내용:%s",writer1,content1);
                }//if e

                if (content2!=null){
                    System.out.printf("작성자:%s, 내용:%s",writer2,content2);
                }//if e

                if (content3!=null){
                    System.out.printf("작성자:%s, 내용:%s",writer3,content3);
                }

                // 디중 if 문 사용
                // 다중 조건 충족시 여러개의 값을 출력한다
            }



        }//while e


    }// maim e


}//class e


