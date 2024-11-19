package day25.practice4.BoardService9mvc;

import day25.practice4.BoardService9mvc.view.BoardView;

public class AppStart {
    public static void main(String[] args) {
        // 싱글톤 사용전

       // BoardView view=new BoardView();
        //view.mainpage();

        //싱글톤 사용후
        BoardView.getInstance().mainpage();
    }
}
