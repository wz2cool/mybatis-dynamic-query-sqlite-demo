package com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.mapper;

import com.github.wz2cool.dynamic.mybatis.mapper.DynamicQueryMapper;
import com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.model.entity.CategoryDO;

/**
 * 分类表Mapper接口
 */
public interface CategoryMapper extends DynamicQueryMapper<CategoryDO> {
    // 继承DynamicQueryMapper后，自动拥有基础的CRUD和动态查询方法
}