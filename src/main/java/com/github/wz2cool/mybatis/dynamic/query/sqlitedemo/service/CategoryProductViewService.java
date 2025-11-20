package com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.service;

import com.github.wz2cool.dynamic.DynamicQuery;
import com.github.wz2cool.dynamic.mybatis.ParamExpression;
import com.github.wz2cool.dynamic.mybatis.QueryHelper;
import com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.mapper.view.CategoryProductViewMapper;
import com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.model.entity.view.CategoryProductViewDO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.management.Query;
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
                .and(CategoryProductViewDO::getProductName, o -> o.startWith("a"));
        ParamExpression whereExpression = onQuery.toWhereExpression();
        // 构建ON_CONDITION_EXPRESSION
        String onConditionExpression = String.format("and %s", whereExpression.getExpression());

        DynamicQuery<CategoryProductViewDO> query = DynamicQuery.createQuery(CategoryProductViewDO.class)
                .and(CategoryProductViewDO::getCategoryName, o -> o.contains(categoryName))
                // 传递ON_CONDITION_EXPRESSION参数
                .queryParam("ON_CONDITION_EXPRESSION", onConditionExpression);

        // 传递WHERE_EXPRESSION参数, 因为 ON_CONDITION_EXPRESSION 的参数来自于whereExpression
        query.queryParam("WHERE_EXPRESSION", whereExpression.getExpression());
        for (Map.Entry<String, Object> entry : whereExpression.getParamMap().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            query.queryParam(key, value);

        }
        return categoryProductViewMapper.selectByDynamicQuery(query);
    }
}