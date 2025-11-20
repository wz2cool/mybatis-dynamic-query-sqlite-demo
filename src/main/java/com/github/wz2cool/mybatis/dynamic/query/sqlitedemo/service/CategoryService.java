package com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.service;


import com.github.wz2cool.dynamic.DynamicQuery;

import com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.mapper.table.CategoryMapper;
import com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.model.entity.table.CategoryDO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 分类服务类
 */
@Service
public class CategoryService {

    @Resource
    private CategoryMapper categoryMapper;

    public List<CategoryDO> findAll() {
        return categoryMapper.selectAll();
    }

    public CategoryDO findById(Integer id) {
        return categoryMapper.selectByPrimaryKey(id);
    }


    public List<CategoryDO> findByCategoryNameLike(String categoryName) {
        DynamicQuery<CategoryDO> query = DynamicQuery.createQuery(CategoryDO.class)
                .and(CategoryDO::getCategoryName, o -> o.contains(categoryName));
        return categoryMapper.selectByDynamicQuery(query);
    }

}