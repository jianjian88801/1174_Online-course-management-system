package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszaixiankechengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszaixiankechengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszaixiankechengView;


/**
 * 在线课程评论表
 *
 * @author 
 * @email 
 * @date 2021-05-25 13:36:37
 */
public interface DiscusszaixiankechengService extends IService<DiscusszaixiankechengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszaixiankechengVO> selectListVO(Wrapper<DiscusszaixiankechengEntity> wrapper);
   	
   	DiscusszaixiankechengVO selectVO(@Param("ew") Wrapper<DiscusszaixiankechengEntity> wrapper);
   	
   	List<DiscusszaixiankechengView> selectListView(Wrapper<DiscusszaixiankechengEntity> wrapper);
   	
   	DiscusszaixiankechengView selectView(@Param("ew") Wrapper<DiscusszaixiankechengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszaixiankechengEntity> wrapper);
   	
}

