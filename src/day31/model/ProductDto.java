package day31.model;

public class ProductDto {

    //필드

    private int num;
    private String name;
    private int price;

    //생성자

    //1 제품추가하기, 제품수정하기--> 제품명과 가격 필요

    public ProductDto(String name, int price) {
        this.name = name;
        this.price = price;
    }

    //2. 제품 전체출력 -> 제품번호, 제품명 ,가격 필요


    public ProductDto(int num, String name, int price) {
        this.num = num;
        this.name = name;
        this.price = price;
    }

    //3. 제품 삭제--> 제품 번호 --> 필요 없을 듯

    //메서드


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}