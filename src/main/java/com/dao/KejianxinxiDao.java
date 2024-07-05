package com.dao;

import com.entity.KejianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KejianxinxiVO;
import com.entity.view.KejianxinxiView;


/**
 * 课件信息
 * 
 * @author 
 * @email 
 * @date 2021-05-25 13:36:36
 */
public interface KejianxinxiDao extends BaseMapper<KejianxinxiEntity> {
	
	List<KejianxinxiVO> selectListVO(@Param("ew") Wrapper<KejianxinxiEntity> wrapper);
	
	KejianxinxiVO selectVO(@Param("ew") Wrapper<KejianxinxiEntity> wrapper);
	
	List<KejianxinxiView> selectListView(@Param("ew") Wrapper<KejianxinxiEntity> wrapper);

	List<KejianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<KejianxinxiEntity> wrapper);
	
	KejianxinxiView selectView(@Param("ew") Wrapper<KejianxinxiEntity> wrapper);
	
}
