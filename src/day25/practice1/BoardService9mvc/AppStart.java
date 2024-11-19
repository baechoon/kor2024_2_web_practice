package day25.practice1.BoardService9mvc;


import day25.practice1.BoardService9mvc.view.BoardView;

public class AppStart {
    public static void main(String[] args) {

        /* 싱글톤을 사용하기 전 */
        // BoardView view = new BoardView();
        // view.mainPage();

        /* 싱글톤을 사용했을때 */
        BoardView.getInstance().mainPage();
        // BoardView.getInstance() ==> boardView
        // boardView.mainPage();

    } // m end
} // c end