package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoshiyonghuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoshiyonghuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshiyonghuView;


/**
 * 教师用户
 *
 * @author 
 * @email 
 * @date 2021-05-25 13:36:36
 */
public interface JiaoshiyonghuService extends IService<JiaoshiyonghuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshiyonghuVO> selectListVO(Wrapper<JiaoshiyonghuEntity> wrapper);
   	
   	JiaoshiyonghuVO selectVO(@Param("ew") Wrapper<JiaoshiyonghuEntity> wrapper);
   	
   	List<JiaoshiyonghuView> selectListView(Wrapper<JiaoshiyonghuEntity> wrapper);
   	
   	JiaoshiyonghuView selectView(@Param("ew") Wrapper<JiaoshiyonghuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshiyonghuEntity> wrapper);
   	
}

