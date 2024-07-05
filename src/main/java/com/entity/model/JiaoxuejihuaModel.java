package com.entity.model;

import com.entity.JiaoxuejihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 教学计划
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-25 13:36:37
 */
public class JiaoxuejihuaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 科目类型
	 */
	
	private String kemuleixing;
		
	/**
	 * 教学内容
	 */
	
	private String jiaoxueneirong;
		
	/**
	 * 教学目标
	 */
	
	private String jiaoxuemubiao;
		
	/**
	 * 教学重点
	 */
	
	private String jiaoxuezhongdian;
		
	/**
	 * 课程安排
	 */
	
	private String kechenganpai;
		
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
	 * 设置：教学内容
	 */
	 
	public void setJiaoxueneirong(String jiaoxueneirong) {
		this.jiaoxueneirong = jiaoxueneirong;
	}
	
	/**
	 * 获取：教学内容
	 */
	public String getJiaoxueneirong() {
		return jiaoxueneirong;
	}
				
	
	/**
	 * 设置：教学目标
	 */
	 
	public void setJiaoxuemubiao(String jiaoxuemubiao) {
		this.jiaoxuemubiao = jiaoxuemubiao;
	}
	
	/**
	 * 获取：教学目标
	 */
	public String getJiaoxuemubiao() {
		return jiaoxuemubiao;
	}
				
	
	/**
	 * 设置：教学重点
	 */
	 
	public void setJiaoxuezhongdian(String jiaoxuezhongdian) {
		this.jiaoxuezhongdian = jiaoxuezhongdian;
	}
	
	/**
	 * 获取：教学重点
	 */
	public String getJiaoxuezhongdian() {
		return jiaoxuezhongdian;
	}
				
	
	/**
	 * 设置：课程安排
	 */
	 
	public void setKechenganpai(String kechenganpai) {
		this.kechenganpai = kechenganpai;
	}
	
	/**
	 * 获取：课程安排
	 */
	public String getKechenganpai() {
		return kechenganpai;
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
