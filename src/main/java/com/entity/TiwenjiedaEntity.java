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
 * 提问解答
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-25 13:36:37
 */
@TableName("tiwenjieda")
public class TiwenjiedaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TiwenjiedaEntity() {
		
	}
	
	public TiwenjiedaEntity(T t) {
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
