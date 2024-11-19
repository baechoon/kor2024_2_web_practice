package day25.practice3.BoardService9mvc;

import day25.practice3.BoardService9mvc.view.BoardView;

public class AppStart {
    public static void main(String[] args) {
        // 싱글톤 사용 전

       // BoardView view=new BoardView();
        //view.mainPage();

        //싱글톤 사용 후
        BoardView.getInstance().mainPage();

    }
}
