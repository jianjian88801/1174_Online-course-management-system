package com.dao;

import com.entity.JiaoxuejihuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoxuejihuaVO;
import com.entity.view.JiaoxuejihuaView;


/**
 * 教学计划
 * 
 * @author 
 * @email 
 * @date 2021-05-25 13:36:37
 */
public interface JiaoxuejihuaDao extends BaseMapper<JiaoxuejihuaEntity> {
	
	List<JiaoxuejihuaVO> selectListVO(@Param("ew") Wrapper<JiaoxuejihuaEntity> wrapper);
	
	JiaoxuejihuaVO selectVO(@Param("ew") Wrapper<JiaoxuejihuaEntity> wrapper);
	
	List<JiaoxuejihuaView> selectListView(@Param("ew") Wrapper<JiaoxuejihuaEntity> wrapper);

	List<JiaoxuejihuaView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoxuejihuaEntity> wrapper);
	
	JiaoxuejihuaView selectView(@Param("ew") Wrapper<JiaoxuejihuaEntity> wrapper);
	
}
