package day31.controller;

import day31.model.ProductDao;
import day31.model.ProductDto;

import java.util.ArrayList;

public class ProductController {
    //싱글톤 만들기
    private static ProductController productController=new ProductController();
    ProductController(){}
    public static ProductController getInstance(){
        return productController;
    }
    //1 제품 추가 controller 함수
    public boolean productAdd(ProductDto productAddDto){
        //view 에게 전달받은 데이터를 dao에게 전달하기
        boolean result= ProductDao.getInstance().productAdd(productAddDto);
        //DAO에게 전달받은 값 View에게 전달
        return result;

    }

    //2. 모든제품출력 controller함수
    public ArrayList<ProductDto>productPrint(){
        //view에게 받은 데이터 dao에게 전달하기
        ArrayList<ProductDto>result=ProductDao.getInstance().productPrint();
        //dao에게 받은 값 view에게 전달
        return result;
    }

    //3. 제품삭제 controller함수
    public boolean productDelete(int deleteNum){
        //view에게 전달받은 값을 dao에게 전달하기
        boolean result=ProductDao.getInstance().productDelete(deleteNum);
        //dao에게 전달받은 값 view에게 전달
        return result;

    }
    //4. 제품수정 controller함수
    public boolean productUpdate(ProductDto updateProductDto){
        //view에게 전달받은 값을 dao에게 전달하기
        boolean result=ProductDao.getInstance().productUpdate(updateProductDto);
        //dao에게 전달받은 값 view에게 전달
        return result;
    }
}
