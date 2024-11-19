package day25.practice4.BoardService9mvc.model;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;

public class BoardDao {

    ArrayList<BoardDto> boardDB = new ArrayList<>();

    //게시물 등록 접근함수
    public boolean boardWrite(BoardDto boardDto) {
        boardDB.add(boardDto);
fiveSave();
        return true;
    }

    //게시물출력 접근함수
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


    //영구저장을 위한 게시물을 파일에 저장하는 기능
    public void fiveSave() {
        String outStr = "";
        for (int index = 0; index < boardDB.size(); index++) {
            BoardDto boardDto = boardDB.get(index);
            outStr += boardDto.getContent() + "," + boardDto.getWriter() + "," + boardDto.getPwd();
            outStr += "\n";

        }
        try {
            FileOutputStream outputStream = new FileOutputStream("./src/day25/practice4/boardService9mvc.data.txt");
            outputStream.write(outStr.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //영구저장된 파일의 게시물을 가져오는 기능
    public void fileLoad() {
        try {
            FileInputStream inputStream = new FileInputStream("./src/day25/practice4/boardService9mvc.data.txt");
            File file = new File("./scr/day25/practice4/boardService9mvc.data.txt");
            byte[] bytes = new byte[(int) file.length()];
            inputStream.read(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();


        }
    }
}
