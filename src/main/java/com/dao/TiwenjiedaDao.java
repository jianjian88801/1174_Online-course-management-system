package com.dao;

import com.entity.TiwenjiedaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TiwenjiedaVO;
import com.entity.view.TiwenjiedaView;


/**
 * 提问解答
 * 
 * @author 
 * @email 
 * @date 2021-05-25 13:36:37
 */
public interface TiwenjiedaDao extends BaseMapper<TiwenjiedaEntity> {
	
	List<TiwenjiedaVO> selectListVO(@Param("ew") Wrapper<TiwenjiedaEntity> wrapper);
	
	TiwenjiedaVO selectVO(@Param("ew") Wrapper<TiwenjiedaEntity> wrapper);
	
	List<TiwenjiedaView> selectListView(@Param("ew") Wrapper<TiwenjiedaEntity> wrapper);

	List<TiwenjiedaView> selectListView(Pagination page,@Param("ew") Wrapper<TiwenjiedaEntity> wrapper);
	
	TiwenjiedaView selectView(@Param("ew") Wrapper<TiwenjiedaEntity> wrapper);
	
}
