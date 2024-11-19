package day25.practice3.BoardService9mvc.model;

import java.io.*;
import java.util.ArrayList;

public class BoardDao {


    ArrayList<BoardDto> boardDB = new ArrayList<>();

    //게시물 등록 접근
    public boolean boardWrite(BoardDto boardDto) {
        boardDB.add(boardDto);

        return true;


    }

    //게시물 출력 접근
    public ArrayList<BoardDto> boardPrint() {
        return boardDB;
    }

    //싱글톤
    private static BoardDao boardDao = new BoardDao();

    BoardDao() {
    }

    public static BoardDao getInstance() {
        return boardDao;
    }

    //영구저장을 위한 게시물 파일 저장기능
    public void fileSave() {
        String outStr = "";
        for (int index = 0; index < boardDB.size(); index++) {
            BoardDto boardDto = boardDB.get(index);
            outStr += boardDto.getContent() + "," + boardDto.getWriter() + "," + boardDto.getPwd();
            outStr += "\n";

        }
        try {
            FileOutputStream outputStream = new FileOutputStream("./src/day25/practice3/BoardService9mvc/data.txt");
            outputStream.write(outStr.getBytes());
            System.out.println("저장성공");
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    //영구저장된 파일의 게시물 가져오기

    public void fileLoad() {
        try {
            FileInputStream inputStream = new FileInputStream("./src/day25/practice3/BoardService9mvc/data.txt");
            File file = new File("./src/day25/practice3/BoardService9mvc/data.txt");
            byte[] bytes = new byte[(int) file.length()];
            inputStream.read(bytes);
            String inStr = new String(bytes);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}