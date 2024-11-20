package day26.todoListMvc.model;

public class TodoListDto {
    private String Content;
    private int deadLine;
    private String state;

    public TodoListDto(String content, int deadLine, String state) {
        Content = content;
        this.deadLine = deadLine;
        this.state = state;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public int getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(int deadLine) {
        this.deadLine = deadLine;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "TodoListDto{" +
                "Content='" + Content + '\'' +
                ", deadLine=" + deadLine +
                ", state='" + state + '\'' +
                '}';
    }
}
