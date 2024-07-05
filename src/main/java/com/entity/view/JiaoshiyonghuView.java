package com.entity.view;

import com.entity.JiaoshiyonghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教师用户
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-25 13:36:36
 */
@TableName("jiaoshiyonghu")
public class JiaoshiyonghuView  extends JiaoshiyonghuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoshiyonghuView(){
	}
 
 	public JiaoshiyonghuView(JiaoshiyonghuEntity jiaoshiyonghuEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoshiyonghuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
