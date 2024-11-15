package day23.practice2;

public class Board {

    //1. 필드(멤버함ㅅ)
    private String content;
    private String writer;
    private int pwd;

    // private: 다른 클래스의 접근을 막는다
    // 외부로부터 지정한 필드의 직접접근을 차단하기 위해

    //2. 생성자( 객체 초기화 함수)
    // 생성자는 클래스 명과 동일해야 한다
    // 생성자는 매개변수가 있지만 반환값이 없다
    // 오버로딩? 동일한 함수명/ 생성자명으로 선언은 불가능 하지만 매개변수의 타입,개수,순서에 따라 식별 가능한 함수 선언방밥

    Board(){}

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
    //this: 현재 클래스의 필드 식별

    // 3.메서드

    //getter (필드값 호출)


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

    //toString -> 객체의 필드정보 출력


    @Override
    public String toString() {
        return "Board{" +
                "content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", pwd=" + pwd +
                '}';
    }
}
