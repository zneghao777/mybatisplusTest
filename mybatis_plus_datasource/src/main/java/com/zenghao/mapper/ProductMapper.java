package com.zenghao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zenghao.pojo.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper extends BaseMapper<Product> {
}
