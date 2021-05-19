package com.wei.weimall.order.dao;

import com.wei.weimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wangwei
 * @email iewang117@outlook.com
 * @date 2021-05-19 14:54:33
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
