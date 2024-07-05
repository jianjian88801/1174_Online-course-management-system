package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengtiwenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengtiwenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengtiwenView;


/**
 * 学生提问
 *
 * @author 
 * @email 
 * @date 2021-05-25 13:36:37
 */
public interface XueshengtiwenService extends IService<XueshengtiwenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengtiwenVO> selectListVO(Wrapper<XueshengtiwenEntity> wrapper);
   	
   	XueshengtiwenVO selectVO(@Param("ew") Wrapper<XueshengtiwenEntity> wrapper);
   	
   	List<XueshengtiwenView> selectListView(Wrapper<XueshengtiwenEntity> wrapper);
   	
   	XueshengtiwenView selectView(@Param("ew") Wrapper<XueshengtiwenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengtiwenEntity> wrapper);
   	
}

