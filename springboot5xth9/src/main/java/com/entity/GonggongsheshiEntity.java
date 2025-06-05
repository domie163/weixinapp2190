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
 * 公共设施
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-10 21:55:44
 */
@TableName("gonggongsheshi")
public class GonggongsheshiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GonggongsheshiEntity() {
		
	}
	
	public GonggongsheshiEntity(T t) {
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
	 * 设施名称
	 */
					
	private String sheshimingcheng;
	
	/**
	 * 设施图片
	 */
					
	private String sheshitupian;
	
	/**
	 * 设施投入日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date sheshitoururiqi;
	
	/**
	 * 登记日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date dengjiriqi;
	
	/**
	 * 维修保养情况
	 */
					
	private String weixiubaoyangqingkuang;
	
	/**
	 * 设施使用情况
	 */
					
	private String sheshishiyongqingkuang;
	
	/**
	 * 检查日志
	 */
					
	private String jiancharizhi;
	
	
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
	 * 设置：设施名称
	 */
	public void setSheshimingcheng(String sheshimingcheng) {
		this.sheshimingcheng = sheshimingcheng;
	}
	/**
	 * 获取：设施名称
	 */
	public String getSheshimingcheng() {
		return sheshimingcheng;
	}
	/**
	 * 设置：设施图片
	 */
	public void setSheshitupian(String sheshitupian) {
		this.sheshitupian = sheshitupian;
	}
	/**
	 * 获取：设施图片
	 */
	public String getSheshitupian() {
		return sheshitupian;
	}
	/**
	 * 设置：设施投入日期
	 */
	public void setSheshitoururiqi(Date sheshitoururiqi) {
		this.sheshitoururiqi = sheshitoururiqi;
	}
	/**
	 * 获取：设施投入日期
	 */
	public Date getSheshitoururiqi() {
		return sheshitoururiqi;
	}
	/**
	 * 设置：登记日期
	 */
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
	/**
	 * 设置：维修保养情况
	 */
	public void setWeixiubaoyangqingkuang(String weixiubaoyangqingkuang) {
		this.weixiubaoyangqingkuang = weixiubaoyangqingkuang;
	}
	/**
	 * 获取：维修保养情况
	 */
	public String getWeixiubaoyangqingkuang() {
		return weixiubaoyangqingkuang;
	}
	/**
	 * 设置：设施使用情况
	 */
	public void setSheshishiyongqingkuang(String sheshishiyongqingkuang) {
		this.sheshishiyongqingkuang = sheshishiyongqingkuang;
	}
	/**
	 * 获取：设施使用情况
	 */
	public String getSheshishiyongqingkuang() {
		return sheshishiyongqingkuang;
	}
	/**
	 * 设置：检查日志
	 */
	public void setJiancharizhi(String jiancharizhi) {
		this.jiancharizhi = jiancharizhi;
	}
	/**
	 * 获取：检查日志
	 */
	public String getJiancharizhi() {
		return jiancharizhi;
	}

}
