package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoxuejihuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoxuejihuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoxuejihuaView;


/**
 * 教学计划
 *
 * @author 
 * @email 
 * @date 2021-05-25 13:36:37
 */
public interface JiaoxuejihuaService extends IService<JiaoxuejihuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoxuejihuaVO> selectListVO(Wrapper<JiaoxuejihuaEntity> wrapper);
   	
   	JiaoxuejihuaVO selectVO(@Param("ew") Wrapper<JiaoxuejihuaEntity> wrapper);
   	
   	List<JiaoxuejihuaView> selectListView(Wrapper<JiaoxuejihuaEntity> wrapper);
   	
   	JiaoxuejihuaView selectView(@Param("ew") Wrapper<JiaoxuejihuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoxuejihuaEntity> wrapper);
   	
}

