package day21.practice2;

import java.util.Scanner;

// 내용과 작성자로 구성된 게시물 100개까지 저장하는 서비스
// 조건: main 함수1개,반복문 사용,배열 최대2개
// 구현: 게시물쓰기, 게시물 출력
public class BoardService2 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

      // BoardService1 에서 변수를 사용했는데 왜 배열을 사용할까? 데이터가 담긴 여러개의 변수를 배열에서 관리하면 편함
        //배열이란? 여러개의 동일한 타입의 데이터들을 +하나의 변수*에 저장할 수 있는 타입(참조)
        //  ㄴ 인덱스란? 배열내 저장된 데이터들의 저장 순서 번호 인덱스 번호는 0번부터 최대 길이까지 부여
        //  ㄴ 반복문과의 활용: 시작값부터 끝 값 까지 반복

        // 배열을 왜 쓰지? 여러개의 변수9데이터)들을 관리하기 힘들어서 , 단 같은 타입이어야 함
        // 만약 다른 타입을 하나의 배열에 저장하고 싶다? class사용

        // 배열 선언 방법 -> 타입[]변수명=new타입[저장개수]
        String[]content=new String[100];// 내용 100개 저장할 수 있는 배열선언
        String[]writer=new String[100];// 작성자 100명 저장할 수 있는 배열선언

        while (true){// 무한루프

            System.out.println("1.게시글 작성 2. 게시물 출력");
            // 값을 입력받기 위해 입력객체 생성
            //입력 받은 값을 변수에 저장
            int choose= scan.nextInt();

            if (choose==1){// 입력값이 1 이라면 게시글  작성

                System.out.print("새로운 게시물 작성:");

               // String content= scan.next(); -> 오류 왜? main 함수에 이미 content(지역변수)가 있기 때문
                // 만약 main 함수 밖에 있다면? 사용 가능 왜? 필드(멤버변수)이기 때문
                String cont= scan.next(); // 새로운 게시물 입력받아 저장
                String writ= scan.next();

                // 만약 게시물이 비어있다면
                // 인덱스 0번부토 99까지 1씩 증가하면서 값 저장

                boolean save=false; // 초기값을 false로 하여 저장 실패했다는 뜻 ---> 스위치변수

                for (int index=0;index< content.length;index++){// 만약  인덱스 번째에 content 가 비어있다면 값 저장

                    if(content[index]==null){
                        content[index]=cont;
                        writer[index]=writ;
                        save=true;
                        break;// 저장은 1개만 해야하므로 반복문 종료

                    }//if e

                    /*else {
                        System.out.println("비어 있는 자리가 없습니다");
                        왜 오류? 첫번째 자리가 비어있지 않더라도 뒤에 자리는 비어 있을 수 있다
                    }*/

                }//for e

                // 그럼 어떻게 저장 실패를 알려줄까?
                // 스위치 변수를 사용한다
                // 스위치 변수란 상태를 저장하는 변수
                // for문이 끝나느 후 스위치 변수 save 값이  save면 성공 false이면 실패

                if (save==false){
                    System.out.println(" 게시물 쓰기 실패: 빈 공간이 없습니다");
                }
                else {
                    System.out.println("게시물 쓰기 성공");
                }


            }//if e


            if (choose==2){// 만약 2번을 선택했다면 게시물 출력

                for (int index=0;index<content.length;index++){
                    if (content[index]!=null){ // 만약 content의 인덱스 번째에 게시물이 존재한다면
                        System.out.printf("작성자:%s, 내용:%s",writer[index],content[index]);

                    }//if e
                }//for e


            }//if e

        }//while e



    }//main e

}//class e
