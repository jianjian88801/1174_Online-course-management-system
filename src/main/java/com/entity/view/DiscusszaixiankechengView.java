package com.entity.view;

import com.entity.DiscusszaixiankechengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 在线课程评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-25 13:36:37
 */
@TableName("discusszaixiankecheng")
public class DiscusszaixiankechengView  extends DiscusszaixiankechengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusszaixiankechengView(){
	}
 
 	public DiscusszaixiankechengView(DiscusszaixiankechengEntity discusszaixiankechengEntity){
 	try {
			BeanUtils.copyProperties(this, discusszaixiankechengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
