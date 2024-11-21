package day26.todoListMvc.view;

import day26.todoListMvc.controller.TodoListController;
import day26.todoListMvc.model.TodoListDto;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoListView {
    Scanner scan = new Scanner(System.in);

    void TodoListWrite() {
        System.out.print("할일 내용");
        String content = scan.next();
        System.out.print("할일 마감일");
        int deadLine = scan.nextInt();
        System.out.print("할일 진행상태");
        String state = scan.next();
        boolean result = TodoListController.getInstance().TodoListWrite(content, deadLine, state);
        if (result) {
            System.out.println("할일 등록성공");

        } else {
            System.out.println("할일 등록 실패");
        }
    }

    void TodoListPrint(){
        ArrayList<TodoListDto>result=TodoListController.getInstance().TodoListPrint();
        for (int index=0;index< result.size();index++){
            System.out.print("할일 내용:"+result.get(index).getContent()+"\n");
            System.out.print("할일 마감일"+result.get(index).getDeadLine()+"\n");
            System.out.print("할일 진행도 "+result.get(index).getState()+"\n");

        }
    }

    //싱글톤
    private static TodoListView todoListView=new TodoListView();
    private TodoListView(){}
    public static TodoListView getInstance(){
        return todoListView;
    }

    public void mainPage(){
        while (true){
            System.out.println("1.할일 등록 2. 할일 출력");
            int choose=scan.nextInt();
            if (choose==1){
                TodoListWrite();
            } else if (choose==2) {
                TodoListPrint();

            }
        }
    }
}
