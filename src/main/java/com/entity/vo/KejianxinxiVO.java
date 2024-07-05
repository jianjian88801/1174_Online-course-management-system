package com.entity.vo;

import com.entity.KejianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 课件信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-25 13:36:36
 */
public class KejianxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 科目类型
	 */
	
	private String kemuleixing;
		
	/**
	 * 课件名称
	 */
	
	private String kejianmingcheng;
		
	/**
	 * 课件内容
	 */
	
	private String kejianneirong;
		
	/**
	 * 课件文件
	 */
	
	private String kejianwenjian;
		
	/**
	 * 上传日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shangchuanriqi;
		
	/**
	 * 课程图片
	 */
	
	private String kechengtupian;
		
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
	 * 设置：课件名称
	 */
	 
	public void setKejianmingcheng(String kejianmingcheng) {
		this.kejianmingcheng = kejianmingcheng;
	}
	
	/**
	 * 获取：课件名称
	 */
	public String getKejianmingcheng() {
		return kejianmingcheng;
	}
				
	
	/**
	 * 设置：课件内容
	 */
	 
	public void setKejianneirong(String kejianneirong) {
		this.kejianneirong = kejianneirong;
	}
	
	/**
	 * 获取：课件内容
	 */
	public String getKejianneirong() {
		return kejianneirong;
	}
				
	
	/**
	 * 设置：课件文件
	 */
	 
	public void setKejianwenjian(String kejianwenjian) {
		this.kejianwenjian = kejianwenjian;
	}
	
	/**
	 * 获取：课件文件
	 */
	public String getKejianwenjian() {
		return kejianwenjian;
	}
				
	
	/**
	 * 设置：上传日期
	 */
	 
	public void setShangchuanriqi(Date shangchuanriqi) {
		this.shangchuanriqi = shangchuanriqi;
	}
	
	/**
	 * 获取：上传日期
	 */
	public Date getShangchuanriqi() {
		return shangchuanriqi;
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
