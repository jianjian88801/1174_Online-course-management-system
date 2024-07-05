package com.dao;

import com.entity.KaoshidagangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaoshidagangVO;
import com.entity.view.KaoshidagangView;


/**
 * 考试大纲
 * 
 * @author 
 * @email 
 * @date 2021-05-25 13:36:37
 */
public interface KaoshidagangDao extends BaseMapper<KaoshidagangEntity> {
	
	List<KaoshidagangVO> selectListVO(@Param("ew") Wrapper<KaoshidagangEntity> wrapper);
	
	KaoshidagangVO selectVO(@Param("ew") Wrapper<KaoshidagangEntity> wrapper);
	
	List<KaoshidagangView> selectListView(@Param("ew") Wrapper<KaoshidagangEntity> wrapper);

	List<KaoshidagangView> selectListView(Pagination page,@Param("ew") Wrapper<KaoshidagangEntity> wrapper);
	
	KaoshidagangView selectView(@Param("ew") Wrapper<KaoshidagangEntity> wrapper);
	
}
