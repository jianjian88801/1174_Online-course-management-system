package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZaixiankechengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZaixiankechengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZaixiankechengView;


/**
 * 在线课程
 *
 * @author 
 * @email 
 * @date 2021-05-25 13:36:36
 */
public interface ZaixiankechengService extends IService<ZaixiankechengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZaixiankechengVO> selectListVO(Wrapper<ZaixiankechengEntity> wrapper);
   	
   	ZaixiankechengVO selectVO(@Param("ew") Wrapper<ZaixiankechengEntity> wrapper);
   	
   	List<ZaixiankechengView> selectListView(Wrapper<ZaixiankechengEntity> wrapper);
   	
   	ZaixiankechengView selectView(@Param("ew") Wrapper<ZaixiankechengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZaixiankechengEntity> wrapper);
   	
}

