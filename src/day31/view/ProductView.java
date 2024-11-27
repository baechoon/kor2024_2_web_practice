package day31.view;

import day31.controller.ProductController;
import day31.model.ProductDto;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductView {

    // 싱글톤
    private static ProductView productView = new ProductView();

    private ProductView() {
    }

    public static ProductView getInstance() {
        return productView;
    }

    Scanner scan = new Scanner(System.in);

    public void mainPage() {
        while (true) {
            System.out.println("1.제품추가 2.제품전체출력 3.제품삭제 4.제품명,가격 수정");
            int choose = scan.nextInt();
            if (choose == 1) {
                productAdd();
            } else if (choose==2) {
                productPrint();

            } else if (choose==3) {
                productDelete();

            } else if (choose==4) {
                productUpdate();

            }
        }
    }

    void productAdd() {
        //1. 제품 입력받기
        System.out.print("제품명 입력");
        String name = scan.next();
        System.out.print("제품 가격 입력");
        int price = scan.nextInt();
        //2입력받은 값으로 객체 만들기
        ProductDto productAddDto = new ProductDto(name, price);
        //3.객체를  컨트롤러에게 전달
        boolean result = ProductController.getInstance().productAdd(productAddDto);
        //4.컨트롤러에게 전달 후 결과 출력
        if (result) {
            System.out.println("제품추가 성공");
        } else {
            System.out.println("제품 추가 실패");
        }


    }

    //2. 모든제품정보 출력함수
    void productPrint() {
        {
            //1. 컨트롤러에게 모든 게시물 정보를 요청하고 결과를 받아 출력한다
            ArrayList<ProductDto> result = ProductController.getInstance().productPrint();
            for (int index = 0; index < result.size(); index++) {
                System.out.print("제품번호:" + result.get(index).getNum()+"\t");
                System.out.print("제품명:" + result.get(index).getName()+"\t");
                System.out.println("제품가격:" + result.get(index).getPrice());

            }
        }
    }

    //3.제품삭제함수
    void productDelete() {
        //1. 삭제할 제품번호 입력받기
        System.out.println("삭제할 제품 번호 입력:");
        int deleteNum = scan.nextInt();
        //2.입력받은 값 컨트롤러에게 전달
        boolean result = ProductController.getInstance().productDelete(deleteNum);
        //3. 전달 후 결과출력
        if (result) {
            System.out.println("제품삭제 성공");
        } else {
            System.out.println("제품삭제 실패");
        }


    }

    //4. 제품 수정함수
    void productUpdate() {
        //1.수정할 제품과 가격 입력받기
        System.out.print("수정할 제품번호");
        int updateNum=scan.nextInt();
        System.out.print("수정할 제품명:");
        String updateName = scan.next();
        System.out.print("수정할 가격:");
        int updatePrice = scan.nextInt();
        //2. 입력받은 값으로 객체 만들기
        ProductDto updateProductDto = new ProductDto(updateNum,updateName, updatePrice);
        //3.컨트롤러에게 전달
        boolean result = ProductController.getInstance().productUpdate(updateProductDto);
        //4.결과
        if (result) {
            System.out.println("제품수정 성공");

        } else {
            System.out.println("제품수정 실패");

        }
    }
}




