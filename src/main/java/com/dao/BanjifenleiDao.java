package com.dao;

import com.entity.BanjifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BanjifenleiVO;
import com.entity.view.BanjifenleiView;


/**
 * 班级分类
 * 
 * @author 
 * @email 
 * @date 2021-05-25 13:36:37
 */
public interface BanjifenleiDao extends BaseMapper<BanjifenleiEntity> {
	
	List<BanjifenleiVO> selectListVO(@Param("ew") Wrapper<BanjifenleiEntity> wrapper);
	
	BanjifenleiVO selectVO(@Param("ew") Wrapper<BanjifenleiEntity> wrapper);
	
	List<BanjifenleiView> selectListView(@Param("ew") Wrapper<BanjifenleiEntity> wrapper);

	List<BanjifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<BanjifenleiEntity> wrapper);
	
	BanjifenleiView selectView(@Param("ew") Wrapper<BanjifenleiEntity> wrapper);
	
}
