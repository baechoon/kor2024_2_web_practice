package day23.practice4;

public class Board {
    //클래스의 구성멤버

    //1. 필드( 멤버변수)
    // 필드는 초기값이 없으면 정수는 0 실수는 0.0 boolean은 false 참조타입은 null
    // 지역번수는 초기값이 없으면 임의값이 들어간다

    private String content;
    private  String writer;
    private int pwd;

    //private : 다른 클래스에서 접근을 차단
    // ㄴ 왜? 외부로부터 지정한 필드의 직접접근을 차단

    //2 생성자(객체초기화) : 객체 생성시 new 뒤로 오는 함수
    //ㄴ 생성자는 클래스명과 이름이 동일해야 한다
    //ㄴ 생성자는 매개변수는 있지만 반환값이 없다
    // 오버로딩? 동일한 함수명/생성자명으로 선언은 불가능 하지만 매개변수의 타입 개수 순서에 따라 식별 가능한 함수 선언방법

    Board(){}// 기본 생성자

    public Board(String content) {
        this.content = content;
    }

    public Board(String content, String writer) {
        this.content = content;
        this.writer = writer;
    }

    public Board(String content, String writer, int pwd) {
        this.content = content;
        this.writer = writer;
        this.pwd = pwd;
    }

    //this: 현재 클래스 내 필드를 식별할 때 사용
    //ㄴ 함수 내 매개변수(지역변수)와 클래스의 필드명이 중복일 때 사용

    // 메서드

    // getter(필드값 호출)


    public String getContent() {
        return content;
    }

    public String getWriter() {
        return writer;
    }

    public int getPwd() {
        return pwd;
    }

    //setter(필드값 저장)


    public void setContent(String content) {
        this.content = content;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    // toString
    // ㄴ toString 은 원래 객체의 주소값을 반환하는 함수인데
    //   주소값 대신 객체의 필드정보를 출력하기 위해 재정의한다


    @Override
    public String toString() {
        return "Board{" +
                "content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", pwd=" + pwd +
                '}';
    }
}
