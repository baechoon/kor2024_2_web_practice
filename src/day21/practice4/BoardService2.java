package day21.practice4;
// 내용과 작성자로 구성된 게시물 100개까지 저장하는 서비스
// 조건: main 함수1개,반복문 사용,배열 최대2개
// 구현: 게시물쓰기, 게시물 출력

import java.util.Scanner;

public class BoardService2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // BoardService1에서 변수를 사용 했는데 왜 배열변수를 사용할까?--> 여려개의 변수에 있는 데이터를 배열로 사용하면 관리가 편함
        // 배열이란? 여러개의 동일한 타입의 데이터들을 *하나의 변수*에 저장할 수 있는 타입 (참조)
        //  ㄴ 인덱스란? 배열내 저장된 데이터들의 저장 순서 번호 --> 인덱스 0부텉 최대 길이까지 부ㅕㅇ
        //  ㄴ 반복문과의 관계: 시작값 부터 끝 값 까지 반복

        // 배열을 왜 쓰지? 여러개의 변수(데이터)를 관리하기 힘들어서 , 단 동일한 타입이어햐 함
        // 만약 다른 타입을 하나의 변수에 저장하고 싶다? calss 사용

        // 배열 선언 방법--> 타입[] 변수명= new 타입[저장개수]
        String[] content= new String[100];// String타입 데이터를 100개 저장할 수 있는 배열선언
        String[] writer=new String[100];

        while (true){// 무한루프

            System.out.println("1. 게시물 쓰기 2. 게시물 출력");
            // 값을 입력받기 위해 입력객체 만들기
            // 입력 받은 값 저장하기
            int choose= scan.nextInt();

            if (choose==1){// 입력받은 값이 1이라면 게시물 쓰기
               // 입력 받은 내용과 작성자 변수에 저장하기

                System.out.print(" 새로운 게시물 내용"); String cont= scan.next();
               // String content = scan.next();--> 오류 왜? main 함수 안에 이미 content(지역변수)가 존재하기 때문
                // main 밖으로 빼면? 오류가 안난다 왜? 필드 (멤버변수) 이기 때문
                System.out.print("새로운 개시물 작성자 "); String writ= scan.next();

                // 저장공간 확인하기
                // 만약에 게시물이 비어있다면
                // 인덱스 0부터 99까지 1씩 증가하며 비어있는 공간에 저장한다

                boolean save=false;// 초기값을 false로 저장--> 저장 실패 했다는 뜻
                for (int index=0;index<content.length;index++){

                    if (content[index]==null){ // 만약 content의 인덱스 번째가 비어있다면
                        content[index]=cont;// 입력 받은 값 저장
                        writer[index]=writ;
                        save=true; //저장 성공
                        break;// 저장은 1번만 하면 되기 때문에 반복문 종료
                    }//if e

                   /* else {
                        System.out.println("비어있는 자리가 없습니다");
                        오류--> 왜? 첫번째 자리가 비어있지 않아도 뒤에는 자리가 있을 수 있다
                    }*/
                }

                // 그럼 어떻게 저장 여부를 표현해야 할까
                //스위치 변수를 사용
                // 스위치 변수란? 상태를 나타내는 변수
                // for문 종료후 save 변수값이 true 이면 저장성공 false이면 저장실패

                if (save==false){
                    System.out.println("게시물 쓰기 실패: 저장공간이 없습니다");
                }//if e
                else {
                    System.out.println("게시물 쓰기 성공");
                }



            }//if e

            if (choose==2){// 게시물 출력

                for (int index=0;index<content.length;index++){
                    if (content[index]!=null){
                        System.out.printf("작성자:%s, 내용:%s",writer[index],content[index]);
                    }//if e
                }//for e
            }//if e



        }//while e


    }//maim e


}//class e
