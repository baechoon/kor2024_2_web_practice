package day30.practice2.boardservice10mvc.model;


import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class BoardDao {
    private Connection conn;
    // 싱글톤
    private static BoardDao boardDao = new BoardDao();

    private BoardDao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1125", "root", "1234");
            System.out.println("[ BoardDB Connection OK ]");
        } catch (ClassNotFoundException e) {
            e.getMessage();
            System.out.println("[ BoardDB Connection fail ]");
        } catch (SQLException e) {
            e.getMessage();
            System.out.println("[ BoardDB Connection fail ]");
        }
    }

    public static BoardDao getInstance() {
        return boardDao;
    }


    public boolean boardWrite(BoardDto boardDto) {
        try {


            String sql = "insert into board(content,writer,pwd)values(?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, boardDto.getContent());
            ps.setString(2, boardDto.getWriter());
            ps.setInt(3, boardDto.getPwd());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.getMessage();
            System.out.println("게시물 등록 예외발생");
            return false;
        }


    }

    public ArrayList<BoardDto> boardPrint() {
        ArrayList<BoardDto> list = new ArrayList<>();
        try {


            String sql = "select*from board";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int num = rs.getInt("num");
                String content = rs.getString("content");
                String writer = rs.getString("writer");
                int pwd = rs.getInt("pwd");
                BoardDto boardDto = new BoardDto(content, writer, pwd);
                list.add(boardDto);
            }

        } catch (SQLException e) {
            e.getMessage();
            System.out.println("게시물 출력시 예외발생");

        }
        return list;
    }
}

