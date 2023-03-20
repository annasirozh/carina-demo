package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.api.dummycategories.GetProductCategoriesMethods;
import com.qaprosoft.carina.demo.api.dummyjson1.DeleteProductMethod;
import com.qaprosoft.carina.demo.api.dummyjson1.GetProductMethods;
import com.qaprosoft.carina.demo.api.dummyjson1.PostProductMethod;
import com.qaprosoft.carina.demo.api.dummyjson1.PutProductTitleMethods;
import org.testng.annotations.Test;

public class DummyJsonTest implements IAbstractTest {

    @Test
    public void testGetProduct(){
        GetProductMethods getProductMethods = new GetProductMethods();
        getProductMethods.callAPIExpectSuccess();
        getProductMethods.validateResponse();
    }

    @Test
    public void testPutProductTitle(){
        PutProductTitleMethods putProductTitleMethods =new PutProductTitleMethods();
        putProductTitleMethods.callAPIExpectSuccess();
        putProductTitleMethods.validateResponse();
    }

    @Test
    public void testDeleteProduct(){
        DeleteProductMethod deleteProductMethod = new DeleteProductMethod();
        deleteProductMethod.callAPIExpectSuccess();
        deleteProductMethod.validateResponse();
    }

    @Test
    public void testAddProduct(){
        PostProductMethod postProductMethod = new PostProductMethod();
        postProductMethod.callAPIExpectSuccess();
        postProductMethod.validateResponse();
    }

    @Test
    public void testGetProductCategories(){
        GetProductCategoriesMethods getProductCategoriesMethods = new GetProductCategoriesMethods();
        getProductCategoriesMethods.callAPIExpectSuccess();
        getProductCategoriesMethods.validateResponse();
    }
}
