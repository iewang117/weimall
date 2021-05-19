package com.wei.weimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wei.common.utils.PageUtils;
import com.wei.weimall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author wangwei
 * @email iewang117@outlook.com
 * @date 2021-05-19 15:08:20
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

