package com.dao;

import com.entity.XueshengyonghuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengyonghuVO;
import com.entity.view.XueshengyonghuView;


/**
 * 学生用户
 * 
 * @author 
 * @email 
 * @date 2021-05-25 13:36:36
 */
public interface XueshengyonghuDao extends BaseMapper<XueshengyonghuEntity> {
	
	List<XueshengyonghuVO> selectListVO(@Param("ew") Wrapper<XueshengyonghuEntity> wrapper);
	
	XueshengyonghuVO selectVO(@Param("ew") Wrapper<XueshengyonghuEntity> wrapper);
	
	List<XueshengyonghuView> selectListView(@Param("ew") Wrapper<XueshengyonghuEntity> wrapper);

	List<XueshengyonghuView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengyonghuEntity> wrapper);
	
	XueshengyonghuView selectView(@Param("ew") Wrapper<XueshengyonghuEntity> wrapper);
	
}
