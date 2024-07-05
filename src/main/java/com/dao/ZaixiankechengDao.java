package com.dao;

import com.entity.ZaixiankechengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZaixiankechengVO;
import com.entity.view.ZaixiankechengView;


/**
 * 在线课程
 * 
 * @author 
 * @email 
 * @date 2021-05-25 13:36:36
 */
public interface ZaixiankechengDao extends BaseMapper<ZaixiankechengEntity> {
	
	List<ZaixiankechengVO> selectListVO(@Param("ew") Wrapper<ZaixiankechengEntity> wrapper);
	
	ZaixiankechengVO selectVO(@Param("ew") Wrapper<ZaixiankechengEntity> wrapper);
	
	List<ZaixiankechengView> selectListView(@Param("ew") Wrapper<ZaixiankechengEntity> wrapper);

	List<ZaixiankechengView> selectListView(Pagination page,@Param("ew") Wrapper<ZaixiankechengEntity> wrapper);
	
	ZaixiankechengView selectView(@Param("ew") Wrapper<ZaixiankechengEntity> wrapper);
	
}
