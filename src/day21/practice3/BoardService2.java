package day21.practice3;
// 내용과 작성자로 구성된 게시물 100개까지 저장하는 서비스
// 조건: main 함수1개,반복문 사용,배열 최대2개
// 구현: 게시물쓰기, 게시물 출력

import java.util.Scanner;

public class BoardService2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //BoardService1 에서 변수를 사용했는데 왜 배열을 사용할까? -> 여러개의 변수에 저장된 데이터를 배열로 사용하면 관리가 편함

        //배열이란? 여러개의 동일한 타입의 데이터를 *하나의 변수*에 저자할 수 있는 타입(참조)
        // ㄴ 인덱스란? 배열내 저장된 데이티의 저장 순서 번호-> 인덱스 번호는 0번부터 배열의 최대길이까지 부여
        // ㄴ 반복문과의 활용? 시작값 부터 마지막 값 까지 반복

        // 배열을 왜 쓸까? 여러개의 변수(데이터)를 관리하기 힘듷어서 , 단 동일타입이어야함
        // 만약 다른 타입을 하나의 배열에 저장하고 싶다면? class 사용

        // 배열 선언하기 -> 타입[] 변수명= new타입[저장갯수]
        String[]content=new String[100];//String 타입의 데이터 100개를 저장할 수 있는 배열 선언
        String[]writer=new String[100];

        while (true){// 무한루프

            System.out.println("1. 게시물 쓰기 2. 게시물 출력");
            // 값을 입력받기 위해 입력객체 생성
            int choose= scan.nextInt();// 입력받는 값 저장

            if (choose==1){
                System.out.print(" 새로운 게시물 제목:");
                //String content= scan.next();오류
                //왜? 이미 main 함수 내에 content (지역 변수)가 이미 있기 때문에
                // 만약 함수 밖에서 쓴다면? 오류가 안 난다 왜? 필드 (멤버변수)이기 때문에
                String cont= scan.next(); // 다른 변수명

                System.out.print("새로운 게시물 작성자"); String writ= scan.next();

                // 입력 받은 값 저장하기
                // 만약에 게시물이 비어 있다면
                // 인덱스 0 번부터 99까지 1씩 증가

                boolean save=false; // 스위치 변수// 초기 값을 false로 해서 저장 실패했다는 뜻으로 해둠
                for (int index=0;index<content.length;index++){

                    if (content[index]==null){ //만약 content의 인덱스 번째가 비어있다면
                        content[index]=cont;// 임력 받은 값을 저장한다
                        writer[index]=writ;
                        save=true;
                        break;// 저장은 1번만 하면 되기 때문에 반복문 종료

                }//if e

                   /* else {
                        System.out.println("비어있는 자리가 없습니다");
                        오류 --> 첫번째가 비어있지 않아도 두번째는 비어있을 수 있다
                    }*/

                    }// for e

                // 그럼 비어있는 공간이 없다는 걸 표현하려면 어떻게 해야할까?
                // 스위치 변수를 사용한다
                // 스위치 변수란 상태를 나타내는 변수
                // for 종료후에 save 값이 true 이면 저장성공 false이면 저장실패

                if (save==false){
                    System.out.println("게시물 쓰기 실패: 빈 공간이 없습니다");
                }
                else {
                    System.out.println("게시물 쓰기 성공");
                }


            }//if e


            if (choose==2){// 출력
                for (int index=0;index<content.length;index++){

                    if (content[index]!=null){// 만약 인덱스 번째에 게시물이 존재한다면
                        System.out.printf("작성자:%s,내용:%s",writer[index],content[index]);

                    }//if e
                }//for e

            }//if e

        }//while e



    }//main e
}//class e
