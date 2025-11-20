package com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.controller;

import com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.model.entity.table.CategoryDO;
import com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 分类控制器
 */
@RestController
@RequestMapping("/api/categories")
@Api(tags = "分类管理")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    @ApiOperation("查询所有分类")
    public List<CategoryDO> findAll() {
        return categoryService.findAll();
    }

    @GetMapping("/{id}")
    @ApiOperation("根据ID查询分类")
    public CategoryDO findById(@PathVariable Integer id) {
        return categoryService.findById(id);
    }

    @GetMapping("/name")
    @ApiOperation("根据分类名称模糊查询")
    public List<CategoryDO> findByCategoryNameLike(@RequestParam String categoryName) {
        return categoryService.findByCategoryNameLike(categoryName);
    }


}