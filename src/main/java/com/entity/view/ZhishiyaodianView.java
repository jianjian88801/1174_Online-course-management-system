package com.entity.view;

import com.entity.ZhishiyaodianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 知识要点
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-25 13:36:36
 */
@TableName("zhishiyaodian")
public class ZhishiyaodianView  extends ZhishiyaodianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhishiyaodianView(){
	}
 
 	public ZhishiyaodianView(ZhishiyaodianEntity zhishiyaodianEntity){
 	try {
			BeanUtils.copyProperties(this, zhishiyaodianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
