package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BanjifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BanjifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BanjifenleiView;


/**
 * 班级分类
 *
 * @author 
 * @email 
 * @date 2021-05-25 13:36:37
 */
public interface BanjifenleiService extends IService<BanjifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BanjifenleiVO> selectListVO(Wrapper<BanjifenleiEntity> wrapper);
   	
   	BanjifenleiVO selectVO(@Param("ew") Wrapper<BanjifenleiEntity> wrapper);
   	
   	List<BanjifenleiView> selectListView(Wrapper<BanjifenleiEntity> wrapper);
   	
   	BanjifenleiView selectView(@Param("ew") Wrapper<BanjifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BanjifenleiEntity> wrapper);
   	
}

