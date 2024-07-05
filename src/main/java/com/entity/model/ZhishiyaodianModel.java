package com.entity.model;

import com.entity.ZhishiyaodianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 知识要点
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-25 13:36:36
 */
public class ZhishiyaodianModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 科目类型
	 */
	
	private String kemuleixing;
		
	/**
	 * 知识点名称
	 */
	
	private String zhishidianmingcheng;
		
	/**
	 * 知识点内容
	 */
	
	private String zhishidianneirong;
		
	/**
	 * 知识点解析
	 */
	
	private String zhishidianjiexi;
		
	/**
	 * 课程图片
	 */
	
	private String kechengtupian;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
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
	 * 设置：知识点名称
	 */
	 
	public void setZhishidianmingcheng(String zhishidianmingcheng) {
		this.zhishidianmingcheng = zhishidianmingcheng;
	}
	
	/**
	 * 获取：知识点名称
	 */
	public String getZhishidianmingcheng() {
		return zhishidianmingcheng;
	}
				
	
	/**
	 * 设置：知识点内容
	 */
	 
	public void setZhishidianneirong(String zhishidianneirong) {
		this.zhishidianneirong = zhishidianneirong;
	}
	
	/**
	 * 获取：知识点内容
	 */
	public String getZhishidianneirong() {
		return zhishidianneirong;
	}
				
	
	/**
	 * 设置：知识点解析
	 */
	 
	public void setZhishidianjiexi(String zhishidianjiexi) {
		this.zhishidianjiexi = zhishidianjiexi;
	}
	
	/**
	 * 获取：知识点解析
	 */
	public String getZhishidianjiexi() {
		return zhishidianjiexi;
	}
				
	
	/**
	 * 设置：课程图片
	 */
	 
	public void setKechengtupian(String kechengtupian) {
		this.kechengtupian = kechengtupian;
	}
	
	/**
	 * 获取：课程图片
	 */
	public String getKechengtupian() {
		return kechengtupian;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
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
