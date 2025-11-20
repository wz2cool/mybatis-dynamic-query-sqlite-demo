package com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.mapper.view;

import com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.model.entity.view.CategoryProductViewDO;
import com.github.wz2cool.dynamic.mybatis.mapper.DynamicQueryMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 分类产品视图Mapper接口
 */
@Mapper
public interface CategoryProductViewMapper extends DynamicQueryMapper<CategoryProductViewDO> {
    // 继承DynamicQueryMapper后，自动拥有基础的CRUD和动态查询方法
}