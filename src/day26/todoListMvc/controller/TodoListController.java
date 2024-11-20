package day26.todoListMvc.controller;

import day26.todoListMvc.model.TodoListDao;
import day26.todoListMvc.model.TodoListDto;

import java.util.ArrayList;

public class TodoListController {

    private static TodoListController todoListController=new TodoListController();
    private TodoListController(){}
    public static TodoListController getInstance(){
        return todoListController;
    }

    public boolean TodoListWrite(String content,int deadLine,String state){
        TodoListDto todoListDto=new TodoListDto(content,deadLine,state);
        return TodoListDao.getInstance().TodoListWrite(todoListDto);
    }

    public ArrayList<TodoListDto>TodoListPrint(){
        ArrayList<TodoListDto>result=TodoListDao.getInstance().TodoListPrint();
        return result;
    }
}
