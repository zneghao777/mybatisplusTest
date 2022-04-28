package com.zenghao.mybatisplus;

import com.zenghao.mybatisplus.mapper.ProductMapper;
import com.zenghao.mybatisplus.pojo.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductTest {

    @Autowired
    private ProductMapper productMapper;

    @Test
    public void TestProduct01(){
        //小李查询商品价格
        Product productLi = productMapper.selectById(1);
        System.out.println("小李查询商品价格"+productLi.getPrice());
        //小李查询商品价格
        Product productWang = productMapper.selectById(1);
        System.out.println("小王查询商品价格"+productWang.getPrice());
        //小李将商品价格+50
        productLi.setPrice(productLi.getPrice()+50);
        productMapper.updateById(productLi);
        //小王将商品价格-30
        productWang.setPrice(productWang.getPrice()-30);
        int rs = productMapper.updateById(productWang);
        if (rs == 0){
            //操作失败,重试
            Product productNew = productMapper.selectById(1);
            productNew.setPrice(productNew.getPrice()-30);
            productMapper.updateById(productNew);
        }
        //老板查询价格
        Product product = productMapper.selectById(1);
        System.out.println("老板查询商品价格"+product.getPrice());
    }
}
