package day21.practice5;
// 내용과 작성자로 구성된 게시물 3개까지 저장하는 서비스
// 조건: main 함수1개, 변수6개 , 반복문 사용
// 구현: 게시물쓰기, 게시물 출력

import java.util.Scanner;

public class BoardService1 {
    public static void main(String[] args) {// main 역할? -> 번역된 코드를 실행
        Scanner scan= new Scanner(System.in);
        // 저장소 설계 -> 게시물 1개 => 내용 1개 작성자 1명 => 총 2개
        //변수 선언하기
        // 변수란? 하나의 데어티(주소값을)저장 하는 메모리
        //  ㄴ 타입이란? 변수에 저장될 데이터(주소값)의 타입--> 기본타입과 참조타입

        String content1=null; String writer1=null;// 첫번째 게시물의 내용와 작성자
        String content2=null; String writer2=null;// 두번째 게시물의 내용와 작성자
        String content3=null; String writer3=null;// 세번째 게시물의 내용와 작성자

        while (true){// 무한루프
            System.out.println("1.게시물 작성 2. 게시물 출력");
            // 선택값 입력받기 위헤 입력객체 생성
            // 입력 받은 값 변수에 저장
            int choose= scan.nextInt();

            if (choose==1){//게시물 쓰기

                //게시물 내용 입력받기
                System.out.print("새로운 게시물 내용:"); String content= scan.next();
                System.out.print("새로운 게시물 작성자:"); String writer= scan.next();

                // 게시물을 저장 할 공간이 있는지 확인하고 저장하기
                // 게시물이 존재하지 않는다늗 뜻? null 또는 " "

                if (content1==null){// content1 의 자리가 비어 있으면 게시물의 내용 작성자 저장하기
                    content1=content; writer1=writer;
                } else if (content2==null) {
                    content2=content; writer2=writer;
                } else if (content3==null) {
                    content3=content; writer3=writer;
                }
                else {
                    System.out.println("게시물 쓰기 실패: 빈 공간이 없습니다");
                }

                // 여기서 왜 다중 if 가 아닌 else if 문을 사용했을까?
                // 다중 if 는 다중 조건에 대해서 여러개의 결과를 얻는다
                // else if 는 다중조건에 대해서 무조건 1개의 결과는 얻는다
                // 만약 여기서 다중if 를 사용 했다면
                // 게시물이 1번 저장되는 게 아닌 여러번 저장되는 결과를 얻을 수 있다

            }//if e

            if (choose==2){// 게시물 출력
                if (content1!=null){
                    System.out.printf("작성자:%s, 내용:%s", writer1,content1);                }// if e

                if (content2!=null){
                    System.out.printf("작성자:%s, 내용:%s", writer2,content2);                }// if e

                if (content3!=null){
                    System.out.printf("작성자:%s, 내용:%s", writer3,content3);                }// if e

                // 다중 if문
                // 다중 조건을 만족하면 다중 결과 값을 얻는다
                // 조건 3개를 충족 했다면 3개 모두 출력되는 값을 얻게된다



            }//if e

        }

    }//main e
}//class e
