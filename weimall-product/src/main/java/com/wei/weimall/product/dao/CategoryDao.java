package com.wei.weimall.product.dao;

import com.wei.weimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wangwei
 * @email iewang117@outlook.com
 * @date 2021-05-18 20:30:11
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
