package day21.practice1;

// 내용과 작성자로 구성된 게시물 100개까지 저장하는 서비스
// 조건: main 함수1개,반복문 사용,배열 최대2개
// 구현: 게시물쓰기, 게시물 출력

import java.util.Scanner;

public class BoardService2 {//class s

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        //BoardService1 에서 변수를 사용했는데 왜 배열변수를 사용할까?--> 여러개의 변수에 저장된 데이터를 배열로 사용하면 관리가 편하다
        //배열이란? 여러개의 동일한 타입의 데이터들을 *하나의 변수*에 저장할 수 있는 타입(참조타입)
        // ㄴ 인덱스란? 배열내 저장된 데이터들의 저장 순서번호--> 인덱스 번호는 0번부터 최대길이까지 부여
        // ㄴ 반복문과의 활용: 시작값 부터 끝 값 까지 반복

        // 배열을 왜 쓸까? 여려개의 변수( 데이터)를 관리하기 힘들어서, 단 동일한 타입이어야 함
        // 만약 다른 타입을 하나의 배열에 저장하고 싶다? class 사용

        // 배열 선언하기--> 타입[]변수명=new 타입[저장개수]


        String[] content = new String[100];//내용을 100개 저장할 수 있는 배열
        String[] writer = new String[100];//작성자 100명을 저장할 수 있는 배열


        while (true){// while s --> 무한루프

            System.out.println("1.게시물 쓰기 2. 게시글 출력");

            //값을 입력받기 위해 입력객체 생성

            int choose= scan.nextInt();// 입력받은 값 저장

            if (choose==1){

                System.out.print("새로운 게시글 제목:"); String cont= scan.next();
                //String content=scan.next(); ---> 오류
                //main 함수 안에 이미 content(지역변수)가 있기 때문에
                // 만약에 main 함수 밖에서 쓴다면? 오류가 안 남 --> 필드 (멤버변수)이기 때문에

                System.out.print("새로운 게시글 작성자:"); String writ= scan.next();

                // 내용 작성 완료 후 저장단계

                // 게시물이 비어있는 자리를 찾으려면
                // 인덱스 0부터 99까지 1씩 증가하며 반복
                // 스위치 변수? 상태를 저장하는 변수
                boolean save= false; // 처음에는 false 저장해서 저장 실패 했다는 뜻

                for (int index=0; index<content.length;index++){


                    if (content[index]==null){ // 만약 content의 인덱스 번째가 비어있다면
                        content[index]=cont;
                        writer[index]=writ; // 인덱스 번째에 입력 받은 값 저장

                        break;// 저장을 1개만 해야하므로 반복문 종료

                    }// if e

                    // 비어 있는 공간이 없을 경우

                  /*  else {----> 오류 --> 첫번째가 비어있지 않아도 뒤에는 비어 있을 수 있기 때문
                        System.out.println("비어 있는 자리가 없습니다");
                    }

                    */

                }//for e
                //for 종료 후 save 변수 값이 true이면 성공 false이면 실패
                if(save=false){
                    System.out.println("게시물 쓰기 실패: 빈 공간이 없습니다");
                }
                else {
                    System.out.println("게시물 쓰기 성공");
                }

            }//if (choose == 1) e

            if (choose==2){// 게시물 출력

                for (int index=0;index<content.length;index++){
                    if (content[index]!=null){
                        System.out.printf("작성자%s,내용%s",writer[index],content[index]);
                    }//if e
                }//for e
            }//if (choose==2) e



        }//while e

























    }//main e





























}//class e

