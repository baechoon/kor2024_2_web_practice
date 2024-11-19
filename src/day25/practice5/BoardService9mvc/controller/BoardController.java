package day25.practice5.BoardService9mvc.controller;

import day25.practice5.BoardService9mvc.model.BoardDao;
import day25.practice5.BoardService9mvc.model.BoardDto;

import java.util.ArrayList;

public class BoardController {

    //게시물 등록 제어함수

    public boolean boardWrite(String content, String writer, int pwd) {
        BoardDto boardDto = new BoardDto(content, writer, pwd);
        return BoardDao.getInstance().boardWrite(boardDto);
    }

    //게시물 출력 제어함수
    public ArrayList<BoardDto> boardPrint() {
        ArrayList<BoardDto> result = BoardDao.getInstance().boardPrint();
        return result;
    }

    //싱글톤

    private static BoardController boardController=new BoardController();
    private BoardController(){}
    public static BoardController getInstance(){
        return boardController;
    }
}