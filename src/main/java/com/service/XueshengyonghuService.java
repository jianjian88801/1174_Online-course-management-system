package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengyonghuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengyonghuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengyonghuView;


/**
 * 学生用户
 *
 * @author 
 * @email 
 * @date 2021-05-25 13:36:36
 */
public interface XueshengyonghuService extends IService<XueshengyonghuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengyonghuVO> selectListVO(Wrapper<XueshengyonghuEntity> wrapper);
   	
   	XueshengyonghuVO selectVO(@Param("ew") Wrapper<XueshengyonghuEntity> wrapper);
   	
   	List<XueshengyonghuView> selectListView(Wrapper<XueshengyonghuEntity> wrapper);
   	
   	XueshengyonghuView selectView(@Param("ew") Wrapper<XueshengyonghuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengyonghuEntity> wrapper);
   	
}

