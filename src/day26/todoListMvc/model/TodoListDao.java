package day26.todoListMvc.model;

import java.io.*;
import java.util.ArrayList;

public class TodoListDao {
//싱글톤
    private static TodoListDao todoListDao = new TodoListDao();

    private TodoListDao() {
        File file=new File("./src/day26/todoListMvc/data.txt");
        if (file.exists()){
            fileLoad();
        }else {
            try {
                file.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static TodoListDao getInstance() {
        return todoListDao;
    }

    //

    ArrayList<TodoListDto> todoListDB = new ArrayList<>();

    public boolean TodoListWrite(TodoListDto todoListDto) {
        todoListDB.add(todoListDto);
        fileSave();
        return true;
    }

    public ArrayList<TodoListDto> TodoListPrint() {
        return todoListDB;
    }


    public void fileSave() {
        String outStr = "";
        for (int index = 0; index < todoListDB.size(); index++) {
            TodoListDto todoListDto = todoListDB.get(index);
            outStr += todoListDto.getContent() + "," + todoListDto.getDeadLine() + "," + todoListDto.getState();
            outStr += "\n";
        }
        try {
            FileOutputStream outputStream = new FileOutputStream("./src/day26/todoListMvc/data.txt");
            outputStream.write(outStr.getBytes());
            System.out.println("파일저장성공");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void fileLoad() {
        try {
            FileInputStream inputStream = new FileInputStream("./src/day26/todoListMvc/data.txt");
            File file = new File("./src/day26/todoListMvc/data.txt");
            byte[] bytes = new byte[(int) file.length()];
            inputStream.read(bytes);
            String inStr = new String(bytes);

            String[] objStr = inStr.split("\n");
            for (int i = 0; i <= objStr.length - 1; i++) {
                String obj = objStr[i];
                String[] filed = obj.split(",");
                String content = filed[0];
                int deadLine = Integer.parseInt(filed[1]);
                String state = filed[2];
                TodoListDto todoListDto = new TodoListDto(content, deadLine, state);
                todoListDB.add(todoListDto);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
