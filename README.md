# MyBatis Dynamic Query SQLite Demo

这是一个使用 Spring Boot 2.3.12 + MyBatis Dynamic Query + SQLite 的示例项目，展示了如何使用 MyBatis Dynamic Query 进行动态查询。

## 项目特性

- ✅ Spring Boot 2.3.12
- ✅ MyBatis Dynamic Query 1.3.3
- ✅ SQLite 数据库
- ✅ Swagger API 文档
- ✅ 完整的实体类（带DO后缀）
- ✅ 动态查询示例
- ✅ RESTful API

## 项目结构

```
src/main/java/com/github/wz2cool/mybatis/dynamic/query/sqlitedemo/
├── Application.java                    # 主启动类
├── config/
│   ├── MyBatisConfig.java             # MyBatis配置
│   └── SwaggerConfig.java             # Swagger配置
├── controller/
│   ├── CategoryController.java        # 分类控制器
│   ├── DemoController.java            # 演示控制器
│   └── HelloController.java           # 示例控制器
├── mapper/
│   ├── CategoryMapper.java            # 分类Mapper
│   └── ProductMapper.java             # 产品Mapper
├── model/
│   └── entity/                        # 实体类（带DO后缀）
│       ├── CategoryDO.java
│       ├── CustomerDO.java
│       ├── ProductDO.java
│       └── ...
└── service/
    └── CategoryService.java           # 分类服务
```

## 快速开始

### 1. 启动应用

```bash
mvn spring-boot:run
```

### 2. 访问API文档

启动后访问：http://localhost:8080/swagger-ui.html

### 3. 测试API

#### 基础查询示例

- **查询所有分类**: GET http://localhost:8080/api/categories
- **根据ID查询分类**: GET http://localhost:8080/api/categories/{id}
- **分类名称模糊查询**: GET http://localhost:8080/api/categories/name/{categoryName}

#### 动态查询示例

- **多条件动态查询**: GET http://localhost:8080/api/categories/dynamic?categoryName=饮料&description=饮品
- **分页查询**: GET http://localhost:8080/api/categories/page?pageNum=1&pageSize=10

#### 产品查询示例

- **查询所有产品**: GET http://localhost:8080/api/demo/products/all
- **价格大于指定值**: GET http://localhost:8080/api/demo/products/expensive?minPrice=20.0
- **有库存的产品**: GET http://localhost:8080/api/demo/products/instock
- **复杂查询**: GET http://localhost:8080/api/demo/products/search/complex?productName=茶&minPrice=10.0&maxPrice=50.0&categoryId=1

## MyBatis Dynamic Query 特性展示

### 1. 基础查询
```java
// 查询所有
categoryMapper.selectAll();

// 根据主键查询
categoryMapper.selectByPrimaryKey(id);
```

### 2. 条件查询
```java
DynamicQuery<CategoryDO> query = DynamicQuery.createQuery(CategoryDO.class)
    .and(CategoryDO::getCategoryName, FilterOperator.CONTAINS, "饮料");
categoryMapper.selectByDynamicQuery(query);
```

### 3. 排序查询
```java
DynamicQuery<CategoryDO> query = DynamicQuery.createQuery(CategoryDO.class)
    .orderBy(CategoryDO::getCategoryId, OrderDirection.DESC);
categoryMapper.selectByDynamicQuery(query);
```

### 4. 分页查询
```java
DynamicQuery<CategoryDO> query = DynamicQuery.createQuery(CategoryDO.class)
    .page(1, 10);
categoryMapper.selectByDynamicQuery(query);
```

### 5. 多条件组合查询
```java
DynamicQuery<ProductDO> query = DynamicQuery.createQuery(ProductDO.class)
    .and(ProductDO::getUnitsInStock, FilterOperator.GREATER_THAN, 0)
    .and(ProductDO::getDiscontinued, FilterOperator.EQUAL, false)
    .orderBy(ProductDO::getProductName, OrderDirection.ASC);
productMapper.selectByDynamicQuery(query);
```

## 支持的查询操作符

- `EQUAL` - 等于
- `NOT_EQUAL` - 不等于
- `GREATER_THAN` - 大于
- `GREATER_THAN_OR_EQUAL` - 大于等于
- `LESS_THAN` - 小于
- `LESS_THAN_OR_EQUAL` - 小于等于
- `CONTAINS` - 包含（模糊查询）
- `NOT_CONTAINS` - 不包含
- `START_WITH` - 以...开始
- `END_WITH` - 以...结束
- `IN` - 在...中
- `NOT_IN` - 不在...中
- `IS_NULL` - 为空
- `NOT_NULL` - 不为空

## 数据库

项目使用 SQLite 数据库，数据库文件位于 `db/northwind.db`，包含 Northwind 示例数据。

## 技术栈

- **Spring Boot**: 2.3.12.RELEASE
- **MyBatis**: 2.2.2
- **MyBatis Dynamic Query**: 1.3.3
- **SQLite JDBC**: 3.36.0.3
- **Swagger**: 3.0.0

## 开发说明

1. 所有实体类都已添加 "DO" 后缀
2. Mapper 接口继承 `DynamicQueryMapper` 获得动态查询能力
3. Service 层封装业务逻辑
4. Controller 层提供 REST API
5. 配置了 MyBatis 和 Swagger

## 扩展建议

1. 可以为其他实体类创建对应的 Mapper 和 Service
2. 可以添加事务管理
3. 可以添加缓存支持
4. 可以添加更复杂的业务逻辑

## 许可证

Apache License 2.0