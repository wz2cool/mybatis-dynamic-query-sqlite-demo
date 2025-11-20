package com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.controller;

import com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.model.entity.view.CategoryProductViewDO;
import com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.service.CategoryProductViewService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * 分类产品视图控制器
 */
@RestController
@RequestMapping("/api/category-products")
@Api(tags = "分类产品视图管理")
public class CategoryProductViewController {

    @Autowired
    private CategoryProductViewService categoryProductViewService;

    @GetMapping
    @ApiOperation("查询所有分类产品视图数据")
    public List<CategoryProductViewDO> findAll() {
        return categoryProductViewService.findAll();
    }

    @GetMapping("/category")
    @ApiOperation("根据分类名称查询产品")
    public List<CategoryProductViewDO> findByCategoryName(
            @ApiParam(value = "分类名称", required = true) @RequestParam String categoryName) {
        return categoryProductViewService.findByCategoryName(categoryName);
    }


}