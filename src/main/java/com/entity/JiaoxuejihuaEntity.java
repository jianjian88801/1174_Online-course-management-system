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
 * 教学计划
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-25 13:36:37
 */
@TableName("jiaoxuejihua")
public class JiaoxuejihuaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaoxuejihuaEntity() {
		
	}
	
	public JiaoxuejihuaEntity(T t) {
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
