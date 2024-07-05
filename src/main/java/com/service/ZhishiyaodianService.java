package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhishiyaodianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhishiyaodianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhishiyaodianView;


/**
 * 知识要点
 *
 * @author 
 * @email 
 * @date 2021-05-25 13:36:36
 */
public interface ZhishiyaodianService extends IService<ZhishiyaodianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhishiyaodianVO> selectListVO(Wrapper<ZhishiyaodianEntity> wrapper);
   	
   	ZhishiyaodianVO selectVO(@Param("ew") Wrapper<ZhishiyaodianEntity> wrapper);
   	
   	List<ZhishiyaodianView> selectListView(Wrapper<ZhishiyaodianEntity> wrapper);
   	
   	ZhishiyaodianView selectView(@Param("ew") Wrapper<ZhishiyaodianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhishiyaodianEntity> wrapper);
   	
}

