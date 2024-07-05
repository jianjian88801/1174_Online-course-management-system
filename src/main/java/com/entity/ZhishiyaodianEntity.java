package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 知识要点
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-25 13:36:36
 */
@TableName("zhishiyaodian")
public class ZhishiyaodianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhishiyaodianEntity() {
		
	}
	
	public ZhishiyaodianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 课程名称
	 */
					
	private String kechengmingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：课程名称
	 */
	public void setKechengmingcheng(String kechengmingcheng) {
		this.kechengmingcheng = kechengmingcheng;
	}
	/**
	 * 获取：课程名称
	 */
	public String getKechengmingcheng() {
		return kechengmingcheng;
	}
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
