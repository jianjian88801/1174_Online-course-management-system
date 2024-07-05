package com.dao;

import com.entity.ZhishiyaodianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhishiyaodianVO;
import com.entity.view.ZhishiyaodianView;


/**
 * 知识要点
 * 
 * @author 
 * @email 
 * @date 2021-05-25 13:36:36
 */
public interface ZhishiyaodianDao extends BaseMapper<ZhishiyaodianEntity> {
	
	List<ZhishiyaodianVO> selectListVO(@Param("ew") Wrapper<ZhishiyaodianEntity> wrapper);
	
	ZhishiyaodianVO selectVO(@Param("ew") Wrapper<ZhishiyaodianEntity> wrapper);
	
	List<ZhishiyaodianView> selectListView(@Param("ew") Wrapper<ZhishiyaodianEntity> wrapper);

	List<ZhishiyaodianView> selectListView(Pagination page,@Param("ew") Wrapper<ZhishiyaodianEntity> wrapper);
	
	ZhishiyaodianView selectView(@Param("ew") Wrapper<ZhishiyaodianEntity> wrapper);
	
}
