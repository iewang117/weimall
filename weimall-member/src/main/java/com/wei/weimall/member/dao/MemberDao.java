package com.wei.weimall.member.dao;

import com.wei.weimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wangwei
 * @email iewang117@outlook.com
 * @date 2021-05-19 14:46:22
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
