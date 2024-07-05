package com.entity.view;

import com.entity.ZaixiankechengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 在线课程
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-25 13:36:36
 */
@TableName("zaixiankecheng")
public class ZaixiankechengView  extends ZaixiankechengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZaixiankechengView(){
	}
 
 	public ZaixiankechengView(ZaixiankechengEntity zaixiankechengEntity){
 	try {
			BeanUtils.copyProperties(this, zaixiankechengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
