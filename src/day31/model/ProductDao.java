package day31.model;


import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;

public class ProductDao {
    //jdbc 인터페이스
    private Connection conn;

    //싱글톤
    private static ProductDao productDao = new ProductDao();

    private ProductDao() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbsubject1126", "root", "1234");
            System.out.println("[ ProductDB Connection OK ]");
        } catch (ClassNotFoundException e) {
            e.getMessage();
            System.out.println("[ productDB Connection fail ]");

        } catch (SQLException e) {
            e.getMessage();
            System.out.println("[ productDB Connection fail ]");
        }
    }

    public static ProductDao getInstance() {
        return productDao;
    }

    //1.제품 추가함수
    public boolean productAdd(ProductDto productAddDto) {
        try {

            //1. sql 작성
            String sql = "insert into product(name,price)values(?,?)";
            //2. 기재준비
            PreparedStatement ps = conn.prepareStatement(sql);
            //3. 조작
            ps.setString(1, productAddDto.getName());
            ps.setInt(2, productAddDto.getPrice());
            //4. 실행
            ps.executeUpdate();
            return true; //5. 반환
        } catch (SQLException e) {
            e.getMessage();
        }
        return false;
    }

    //2. 제품출력함수
    public ArrayList<ProductDto> productPrint() {
        ArrayList<ProductDto> list = new ArrayList<>();// 조회된 레코드를 객체화하여 저장할 리스트 객체
        try {

            //1.sql작성
            String sql = "select*from product";
            //2.기재준비
            PreparedStatement ps = conn.prepareStatement(sql);
            //3.조작
            //4.실행
            ResultSet re = ps.executeQuery();
            //5.결과
            while (re.next()) {// 조회결과 첫번째 레코드부터 마지막레코드까지 이동
                //6. 각 레코드를 읽어서 필드별 데이터 호출
                int num = re.getInt("num");
                String name = re.getString("name");
                int price = re.getInt("price");
                //7. 레코드의 필드값 객체화-> dto 생성
                ProductDto productDto = new ProductDto(num, name, price);
                //8. 레코드-> dto객체로 변환->리스트에 저장
                list.add(productDto);


            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return list;
    }

    //3.제품 삭제함수
    public boolean productDelete(int deleteNum) {
        try {


            //1. sql작성
            String sql = "delete from product where num=?";
            //2.기재준비
            PreparedStatement ps = conn.prepareStatement(sql);
            //3.조작
            ps.setInt(1, deleteNum); //물음표에 넣을 값
            //4.실행 5.결과
            int result = ps.executeUpdate(); // 삭제된 레코드 수
            //6.반환
            if (result == 1) { //삭제된 레코드가 있다면 --> 하나만 삭제할 거기 때문에 ==1
                return true;
            }


        } catch (SQLException e) {
            e.getMessage();


        }
        return false;

    }

    //4. 제품 수정함수
    public boolean productUpdate(ProductDto updateProductDto) {
        try {

            //1.sql작성
            String sql = "update product set name=?,price=? where num=?";
            //2.기재
            PreparedStatement ps = conn.prepareStatement(sql);
            //3.조작
            ps.setString(1, updateProductDto.getName());
            ps.setInt(2, updateProductDto.getPrice());
            ps.setInt(3, updateProductDto.getNum());
            //4. 실행, 결과
            int result = ps.executeUpdate();// 수정결과에 변화가 있는 레코드 수
            //5. 반환
            if (result == 1) {// 변화가 1개 있으면 성공 -->1개씩 수정할거라서
                return true;
            }

        } catch (SQLException e) {
            e.getMessage();

        }
        return false;
    }
}