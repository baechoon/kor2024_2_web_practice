package day21.practice1;
// 내용과 작성자로 구성된 게시물 3개까지 저장하는 서비스
// 조건: main 함수1개, 변수6개 , 반복문 사용
// 구현: 게시물쓰기, 게시물 출력

import java.util.Scanner;

public class BoardService1 {//class s

    public static void main(String[] args) {//main s

        Scanner scan=new Scanner(System.in);

        //게시물 -> 내용과 작성자 구성
        // 변수 선언
        // 변수란 하나의 데이터 또는 주소값을 저장하는 메모리
        //    ㄴ 타입이란 변수에 저장될 데이터 또는 주소의 타입 --> 기본타입 과 참조타입

        String content1= null; String writer1=null; // 내용1과 작성자1 변수 선언
        String content2= null; String writer2=null; // 내용2과 작성자2 변수 선언
        String content3= null; String writer3=null; // 내용3과 작성자3 변수 선언


        while (true){//while s ----> 무한루프

            System.out.println("1.게시물 쓰기 2. 게시물 출력");
            //입력 값을 받아오기 위해 Scanner 객체 만들기
            int choose= scan.nextInt(); // 입력 값을 변수에 저장

            if (choose==1) { // 만약 입력값이 1이라면 게시물 쓰기
                System.out.print("새로운 게시물 내용:");
                String content = scan.next();// 게시물 내용을 입력받아 변수에 저장
                System.out.print("새로운 게시물 작성자:");
                String writer = scan.next();

                // 게시물 입력받기 후 저장할 공간이 있는지 체크하기--> 공간이 비어있다는 뜻: null 또는 " "

                // 다중 if가 아닌 else if 를 쓴 이유?
                //다중 if 는 여러개의 결과 값을 얻을 수 있다
                //만약 다중 if를 쓴다면 게시글이 1번만 올라가는 게 아닌 여러개가 올라 갈 수 있다
                //if else if 는 다중조건에 대한 결과값은 무조건 1개이다

                if (content1 == null) {// 만약 content1이 비어있다면 저장가능
                    content1 = content;
                    writer1 = writer; // 입력받은 값을 변수에 저장

                }//if e
                else if (content2 == null) {//그게 아니고 만약에 content2가 비어있다면 저장가능
                    content2 = content;
                    writer2 = writer;

                }//else if e

                else if (content3 == null) {// 그게 아니고 만약에 content3가 비어있으면 저장가능
                    content3 = content;
                    writer3 = writer;


                }//else if e

                else {// 그게 아니면
                    System.out.println("게시물 글쓰기 실패 : 빈 공간이 없습니다");

                }// else e

            }//if e


                if (choose == 2) {// 만약에 입력값이 2라면 게시물 출력

                    // 다중 if 는 여래개의 결과값을 가질 수 있다
                    // 모두 저장되어 있다면 저장된 값을 모두 출력된다


                    if (content1 != null) {// 만약 content1 값이 비어있지 않다면

                        System.out.printf("작성자%s,내용:%s", writer1, content1);

                    }//if e

                    if (content2 != null) {
                        System.out.printf("작성자%s,내용:%s", writer2, content2);
                    }//if e

                    if (content3 != null) {
                        System.out.printf("작성자%s,내용:%s", writer3, content3);
                    }// if e

                }//if e




        }//while e











    }//main e



}//class e
