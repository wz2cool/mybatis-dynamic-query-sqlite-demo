package com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.service;

import com.github.wz2cool.dynamic.DynamicQuery;
import com.github.wz2cool.dynamic.mybatis.ParamExpression;
import com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.mapper.view.CategoryProductViewMapper;
import com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.model.entity.view.CategoryProductViewDO;
import org.apache.commons.lang3.StringUtils;
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
                .and(CategoryProductViewDO::getProductName, o -> o.startWith("a"));
        ParamExpression onFilterExpression = onQuery.toWhereExpression();

        // 构建ON_CONDITION_EXPRESSION, 这里最好需要加上判断，当whereExpression为空时，不构建ON_CONDITION_EXPRESSION
        // 以免残留 and 语法报错，就是说只有筛选才会有 and/or
        String onConditionExpression = "";
        if (StringUtils.isNotBlank(onFilterExpression.getExpression())) {
            onConditionExpression = String.format("and %s", onFilterExpression.getExpression());
        }

        // 这个是主查询的构建
        DynamicQuery<CategoryProductViewDO> mainQuery = DynamicQuery.createQuery(CategoryProductViewDO.class)
                .and(CategoryProductViewDO::getCategoryName, o -> o.contains(categoryName))
                // 传递ON_CONDITION_EXPRESSION参数
                .queryParam("ON_CONDITION_EXPRESSION", onConditionExpression)
                // 传递ON_CONDITION_EXPRESSION参数的其他参数
                .queryParam(onFilterExpression.getParamMap());

        return categoryProductViewMapper.selectByDynamicQuery(mainQuery);
    }
}