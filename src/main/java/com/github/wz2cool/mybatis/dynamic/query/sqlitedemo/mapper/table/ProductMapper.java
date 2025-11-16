package com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.mapper.table;

import com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.model.entity.table.ProductDO;
import com.github.wz2cool.dynamic.mybatis.mapper.DynamicQueryMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 产品表Mapper接口
 */
@Mapper
public interface ProductMapper extends DynamicQueryMapper<ProductDO> {
    // 继承DynamicQueryMapper后，自动拥有基础的CRUD和动态查询方法
}