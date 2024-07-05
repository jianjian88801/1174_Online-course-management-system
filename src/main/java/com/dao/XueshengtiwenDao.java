package com.dao;

import com.entity.XueshengtiwenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengtiwenVO;
import com.entity.view.XueshengtiwenView;


/**
 * 学生提问
 * 
 * @author 
 * @email 
 * @date 2021-05-25 13:36:37
 */
public interface XueshengtiwenDao extends BaseMapper<XueshengtiwenEntity> {
	
	List<XueshengtiwenVO> selectListVO(@Param("ew") Wrapper<XueshengtiwenEntity> wrapper);
	
	XueshengtiwenVO selectVO(@Param("ew") Wrapper<XueshengtiwenEntity> wrapper);
	
	List<XueshengtiwenView> selectListView(@Param("ew") Wrapper<XueshengtiwenEntity> wrapper);

	List<XueshengtiwenView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengtiwenEntity> wrapper);
	
	XueshengtiwenView selectView(@Param("ew") Wrapper<XueshengtiwenEntity> wrapper);
	
}
