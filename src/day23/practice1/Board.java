package day23.practice1;

public class Board {

    // 1.필드 (멤버변수)

    private String content;
    private String Writer;
    private int pwd;

    //private :다른 클래스에 접근을 차단하는 키워드 , 즉 현재 클래스에서 사용가능
    //왜? 외부로부터 지정한 필드의 직접접근을 차단하기 위해

    //2. 생성자( 객체초기화 함수): 객체 생성시 new 뒤로 오는 함수
    //ㄴ 셍상자는 클래스명과 이름이 동일해야 한다 --> 동일하지 않으면 함수로 취급된다
    //ㄴ 생성자는 매개변수(함수 안으로 들어오는 값드을 저장하는 변수)가 있지만 반환값( 함수가 종료될때 반환하는 값)이 없다
    //* 오버로딩? 동일한 함수명/ 생성자명으로 선언은 불가능 하지만 매개변수의 타입, 개수, 순서에 따라 식별 가능한 함수 선언 방법

    //2-1 매개 변수가 없는 기본셍상지
    Board(){}

    //2-2 매개변수가 1개 존재하는 생성자


    public Board(String content) {
        this.content = content;
    }

    //2-3 매개변수가 2개 존재하는 생성자


    public Board(String content, String writer) {
        this.content = content;
        Writer = writer;
    }

    //2-4 매개변수가 3개 존재하는 생성자


    public Board(String content, String writer, int pwd) {
        this.content = content;
        Writer = writer;
        this.pwd = pwd;
    }

    //this : 현재 클래스의 필드를 식별할 때 사용하는 키워드
    //ㄴ 함수 내 매개변수, 지역변수와 클래스의 필드명이 충돌 (중복)일 떄

    //3. 메서드(멤버함수)

    // getter (필드값 호출) : private 선언된 필드를 public함수로 외부 클래스로부터 간접접근을 허용한다


    public String getContent() {
        return content;
    }

    public String getWriter() {
        return Writer;
    }

    public int getPwd() {
        return pwd;
    }

    // setter (필드값 저장):private 선언된 필드를 public함수로 외부 클래스로부터 간접접근을 허용한다


    public void setContent(String content) {
        this.content = content;
    }

    public void setWriter(String writer) {
        Writer = writer;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }


    //toString: Object 객체( 자바의 최상위 클래스)의 메서드
    //ㄴ 재정의: Object 클래스 내 toString 함수를 재정의
    // 원래 toString() 함수는 객체의 주소값을 반환하는 함수인데
    // 주소값 대신 객체의 필드정보를 출력하기 위해 재정의한다


    @Override
    public String toString() {
        return "Board{" +
                "content='" + content + '\'' +
                ", Writer='" + Writer + '\'' +
                ", pwd=" + pwd +
                '}';
    }
}
