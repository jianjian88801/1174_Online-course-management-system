package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KejianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KejianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KejianxinxiView;


/**
 * 课件信息
 *
 * @author 
 * @email 
 * @date 2021-05-25 13:36:36
 */
public interface KejianxinxiService extends IService<KejianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KejianxinxiVO> selectListVO(Wrapper<KejianxinxiEntity> wrapper);
   	
   	KejianxinxiVO selectVO(@Param("ew") Wrapper<KejianxinxiEntity> wrapper);
   	
   	List<KejianxinxiView> selectListView(Wrapper<KejianxinxiEntity> wrapper);
   	
   	KejianxinxiView selectView(@Param("ew") Wrapper<KejianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KejianxinxiEntity> wrapper);
   	
}

