package com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.service;

import com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.model.entity.view.CategoryProductViewDO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CategoryProductViewServiceTest {

    @Autowired
    private CategoryProductViewService categoryProductViewService;

    @Test
    void testFindAll() {
        List<CategoryProductViewDO> result = categoryProductViewService.findAll();
        assertNotNull(result);
        assertFalse(result.isEmpty());
        
        // 验证返回的数据结构
        CategoryProductViewDO firstItem = result.get(0);
        assertNotNull(firstItem.getCategoryName());
        assertNotNull(firstItem.getProductName());
        assertNotNull(firstItem.getUnitPrice());
    }

    @Test
    void testFindByCategoryName() {
        List<CategoryProductViewDO> result = categoryProductViewService.findByCategoryName("Beverages");
        assertNotNull(result);
        
        if (!result.isEmpty()) {
            CategoryProductViewDO item = result.get(0);
            assertEquals("Beverages", item.getCategoryName());
        }
    }

    @Test
    void testFindByCategoryNameLike() {
        List<CategoryProductViewDO> result = categoryProductViewService.findByCategoryNameLike("Bev");
        assertNotNull(result);
        
        if (!result.isEmpty()) {
            CategoryProductViewDO item = result.get(0);
            assertTrue(item.getCategoryName().contains("Bev"));
        }
    }

    @Test
    void testFindByProductNameLike() {
        List<CategoryProductViewDO> result = categoryProductViewService.findByProductNameLike("Chai");
        assertNotNull(result);
        
        if (!result.isEmpty()) {
            CategoryProductViewDO item = result.get(0);
            assertTrue(item.getProductName().contains("Chai"));
        }
    }

    @Test
    void testFindByPriceRange() {
        List<CategoryProductViewDO> result = categoryProductViewService.findByPriceRange(
            new BigDecimal("10"), new BigDecimal("50"));
        assertNotNull(result);
        
        if (!result.isEmpty()) {
            CategoryProductViewDO item = result.get(0);
            assertTrue(item.getUnitPrice().compareTo(new BigDecimal("10")) >= 0);
            assertTrue(item.getUnitPrice().compareTo(new BigDecimal("50")) <= 0);
        }
    }

    @Test
    void testFindInStockProducts() {
        List<CategoryProductViewDO> result = categoryProductViewService.findInStockProducts();
        assertNotNull(result);
        
        if (!result.isEmpty()) {
            CategoryProductViewDO item = result.get(0);
            assertTrue(item.getUnitsInStock() > 0);
        }
    }

    @Test
    void testFindActiveProducts() {
        List<CategoryProductViewDO> result = categoryProductViewService.findActiveProducts();
        assertNotNull(result);
        
        if (!result.isEmpty()) {
            CategoryProductViewDO item = result.get(0);
            assertEquals("0", item.getDiscontinued());
        }
    }

    @Test
    void testFindByCategoryId() {
        List<CategoryProductViewDO> result = categoryProductViewService.findByCategoryId(1);
        assertNotNull(result);
        
        if (!result.isEmpty()) {
            CategoryProductViewDO item = result.get(0);
            assertEquals(1, item.getCategoryId());
        }
    }

    @Test
    void testFindBySupplierId() {
        List<CategoryProductViewDO> result = categoryProductViewService.findBySupplierId(1);
        assertNotNull(result);
        
        if (!result.isEmpty()) {
            CategoryProductViewDO item = result.get(0);
            assertEquals(1, item.getSupplierId());
        }
    }
}