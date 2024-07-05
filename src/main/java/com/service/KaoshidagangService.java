package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaoshidagangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaoshidagangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaoshidagangView;


/**
 * 考试大纲
 *
 * @author 
 * @email 
 * @date 2021-05-25 13:36:37
 */
public interface KaoshidagangService extends IService<KaoshidagangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaoshidagangVO> selectListVO(Wrapper<KaoshidagangEntity> wrapper);
   	
   	KaoshidagangVO selectVO(@Param("ew") Wrapper<KaoshidagangEntity> wrapper);
   	
   	List<KaoshidagangView> selectListView(Wrapper<KaoshidagangEntity> wrapper);
   	
   	KaoshidagangView selectView(@Param("ew") Wrapper<KaoshidagangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaoshidagangEntity> wrapper);
   	
}

