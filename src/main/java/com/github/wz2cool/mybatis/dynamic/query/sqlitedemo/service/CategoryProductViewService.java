package com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.service;

import com.github.wz2cool.dynamic.DynamicQuery;
import com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.mapper.view.CategoryProductViewMapper;
import com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.model.entity.view.CategoryProductViewDO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 分类产品视图服务类
 */
@Service
public class CategoryProductViewService {

    @Resource
    private CategoryProductViewMapper categoryProductViewMapper;

    /**
     * 查询所有分类产品视图数据
     */
    public List<CategoryProductViewDO> findAll() {
        return categoryProductViewMapper.selectAll();
    }

    /**
     * 根据分类名称查询产品
     */
    public List<CategoryProductViewDO> findByCategoryName(String categoryName) {

        DynamicQuery<CategoryProductViewDO> onQuery = DynamicQuery.createQuery(CategoryProductViewDO.class)
                .and(CategoryProductViewDO::getProductName, o -> o.contains("a"));

        Map<String, Object> queryParamMap = onQuery.toQueryParamMap();
        Object whereExpression = queryParamMap.get("whereExpression");
        String onConditionExpression = String.format("and %s", whereExpression);


        DynamicQuery<CategoryProductViewDO> query = DynamicQuery.createQuery(CategoryProductViewDO.class)
                .and(CategoryProductViewDO::getCategoryName, o -> o.contains(categoryName))
                .queryParam("ON_CONDITION_EXPRESSION", onConditionExpression);


        for (Map.Entry<String, Object> entry : queryParamMap.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if(key.startsWith("param_")){
                query.queryParam(key, value);
            }

        }

        Map<String, Object> queryParamMap1 = query.toQueryParamMap();
        return categoryProductViewMapper.selectByDynamicQuery(query);
    }



}