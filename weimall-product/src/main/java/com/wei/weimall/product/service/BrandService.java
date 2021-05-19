package com.wei.weimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wei.common.utils.PageUtils;
import com.wei.weimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author wangwei
 * @email iewang117@outlook.com
 * @date 2021-05-18 20:30:10
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

