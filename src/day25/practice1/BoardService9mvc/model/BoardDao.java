package day25.practice1.BoardService9mvc.model;
import java.io.*;
import java.util.ArrayList;

public class BoardDao {
    // 싱글톤
    private static BoardDao boardDao = new BoardDao();

    private BoardDao() {
    }

    public static BoardDao getInstance() {
        return boardDao;
    }

    ArrayList<BoardDto> boardDB = new ArrayList<>();

    // 1. 게시물 등록 접근 함수
    public boolean boardWrite(BoardDto boardDto) {
        boardDB.add(boardDto);
        fileSave(); // 만약에 리스트에 게시물 객체를 추가 했다면 , 파일에도 추가된 게시물을 쓰기
        return true;
    }

    // 2. 게시물 출력 접근 함수
    public ArrayList<BoardDto> boardPrint() {
        return boardDB;
    }

    //  영구저장 을 위한 게시물들을 파일에 저장하는 기능 //

    public void fileSave() {//게시물 등록을 성공했을 때 함수 사용.호출
        //여러개의 게시물을 ArrayList<BoardDto> boardDB 하나의 문자열 String/CSV로 표현하는 방법
        String outStr = ""; //1. 임의의 문자열 변수 선언
        //2. 반복문을 이용한 모든 게시물들을 순회/반복
        for (int index = 1; index < boardDB.size(); index++) {
            BoardDto boardDto = boardDB.get(index);//3. 인덱스번째 게시물
            //4. 객체내 필드구분-> 인덱스번째의 게시물 객체내 필드값을 CSV형식으로 변환->필드값 출력후 사이사이에 ,쉼표넣기
            outStr += boardDto.getContent() + "," + boardDto.getWriter() + "," + boardDto.getPwd();
            outStr += "\n";//5. 객체구분
        }
        //try-catch
        try {
            //1. 파일 출력 객체 생성
            FileOutputStream OutputStream = new FileOutputStream("./src/day25/practice1/BoardService9mvc.data.txt");
            //2.파일 출력 객체를 이용한 바이트 쓰기/내보내기
            OutputStream.write(outStr.getBytes());
            //3.안내메세지
            System.out.println("파일저장성공");
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    // 영구저장된 파일의 게시물들을 가져오는 기능
    public void FileLoad() {
        try {
            //1. 파일 입력객체생성
            FileInputStream inputStream = new FileInputStream("./src/day25/practice1/BoardService9mvc.data.txt");
            //2. 파일 용량만큼 바이트 배열 선언
            File file = new File("./src/day25/practice1/BoardService9mvc.data.txt");
            byte[] bytes = new byte[(int) file.length()];
            //3. 파일 읽어서 바이트 배열 저장
            inputStream.read(bytes);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}








