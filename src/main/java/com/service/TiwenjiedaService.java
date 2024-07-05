package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TiwenjiedaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TiwenjiedaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TiwenjiedaView;


/**
 * 提问解答
 *
 * @author 
 * @email 
 * @date 2021-05-25 13:36:37
 */
public interface TiwenjiedaService extends IService<TiwenjiedaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TiwenjiedaVO> selectListVO(Wrapper<TiwenjiedaEntity> wrapper);
   	
   	TiwenjiedaVO selectVO(@Param("ew") Wrapper<TiwenjiedaEntity> wrapper);
   	
   	List<TiwenjiedaView> selectListView(Wrapper<TiwenjiedaEntity> wrapper);
   	
   	TiwenjiedaView selectView(@Param("ew") Wrapper<TiwenjiedaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TiwenjiedaEntity> wrapper);
   	
}

