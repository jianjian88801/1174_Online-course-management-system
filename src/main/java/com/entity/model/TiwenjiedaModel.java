package com.entity.model;

import com.entity.TiwenjiedaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 提问解答
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-25 13:36:37
 */
public class TiwenjiedaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 科目类型
	 */
	
	private String kemuleixing;
		
	/**
	 * 提问内容
	 */
	
	private String tiwenneirong;
		
	/**
	 * 提问解答
	 */
	
	private String tiwenjieda;
		
	/**
	 * 解答日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiedariqi;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
				
	
	/**
	 * 设置：科目类型
	 */
	 
	public void setKemuleixing(String kemuleixing) {
		this.kemuleixing = kemuleixing;
	}
	
	/**
	 * 获取：科目类型
	 */
	public String getKemuleixing() {
		return kemuleixing;
	}
				
	
	/**
	 * 设置：提问内容
	 */
	 
	public void setTiwenneirong(String tiwenneirong) {
		this.tiwenneirong = tiwenneirong;
	}
	
	/**
	 * 获取：提问内容
	 */
	public String getTiwenneirong() {
		return tiwenneirong;
	}
				
	
	/**
	 * 设置：提问解答
	 */
	 
	public void setTiwenjieda(String tiwenjieda) {
		this.tiwenjieda = tiwenjieda;
	}
	
	/**
	 * 获取：提问解答
	 */
	public String getTiwenjieda() {
		return tiwenjieda;
	}
				
	
	/**
	 * 设置：解答日期
	 */
	 
	public void setJiedariqi(Date jiedariqi) {
		this.jiedariqi = jiedariqi;
	}
	
	/**
	 * 获取：解答日期
	 */
	public Date getJiedariqi() {
		return jiedariqi;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：教师工号
	 */
	 
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
			
}
