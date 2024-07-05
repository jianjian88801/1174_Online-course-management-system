package com.dao;

import com.entity.DiscusszaixiankechengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszaixiankechengVO;
import com.entity.view.DiscusszaixiankechengView;


/**
 * 在线课程评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-25 13:36:37
 */
public interface DiscusszaixiankechengDao extends BaseMapper<DiscusszaixiankechengEntity> {
	
	List<DiscusszaixiankechengVO> selectListVO(@Param("ew") Wrapper<DiscusszaixiankechengEntity> wrapper);
	
	DiscusszaixiankechengVO selectVO(@Param("ew") Wrapper<DiscusszaixiankechengEntity> wrapper);
	
	List<DiscusszaixiankechengView> selectListView(@Param("ew") Wrapper<DiscusszaixiankechengEntity> wrapper);

	List<DiscusszaixiankechengView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszaixiankechengEntity> wrapper);
	
	DiscusszaixiankechengView selectView(@Param("ew") Wrapper<DiscusszaixiankechengEntity> wrapper);
	
}
