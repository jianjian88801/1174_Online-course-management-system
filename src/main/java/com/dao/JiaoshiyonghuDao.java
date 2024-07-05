package com.dao;

import com.entity.JiaoshiyonghuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoshiyonghuVO;
import com.entity.view.JiaoshiyonghuView;


/**
 * 教师用户
 * 
 * @author 
 * @email 
 * @date 2021-05-25 13:36:36
 */
public interface JiaoshiyonghuDao extends BaseMapper<JiaoshiyonghuEntity> {
	
	List<JiaoshiyonghuVO> selectListVO(@Param("ew") Wrapper<JiaoshiyonghuEntity> wrapper);
	
	JiaoshiyonghuVO selectVO(@Param("ew") Wrapper<JiaoshiyonghuEntity> wrapper);
	
	List<JiaoshiyonghuView> selectListView(@Param("ew") Wrapper<JiaoshiyonghuEntity> wrapper);

	List<JiaoshiyonghuView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshiyonghuEntity> wrapper);
	
	JiaoshiyonghuView selectView(@Param("ew") Wrapper<JiaoshiyonghuEntity> wrapper);
	
}
