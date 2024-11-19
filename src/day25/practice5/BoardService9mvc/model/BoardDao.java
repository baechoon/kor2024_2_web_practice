package day25.practice5.BoardService9mvc.model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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

    private BoardDao() {
    }

    public static BoardDao getInstance() {
        return boardDao;
    }

    //영구저장을 위한 게시물들을 파일에 저장하는 기능
    public void fileSave() {
        String outStr = "";
        for (int index = 0; index < boardDB.size(); index++) {
            BoardDto boardDto = boardDB.get(index);
            outStr += boardDto.getContent() + "," + boardDto.getWriter() + "," + boardDto.getPwd();
            outStr += "\n";
        } try {
            FileOutputStream outputStream = new FileOutputStream("./src/day25/practice5/BoardService9/data.txt");
            outputStream.write(outStr.getBytes());
            System.out.println("파일저장성공");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}