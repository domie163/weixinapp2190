package com.entity.model;

import com.entity.GonggongsheshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 公共设施
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-10 21:55:44
 */
public class GonggongsheshiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 设施图片
	 */
	
	private String sheshitupian;
		
	/**
	 * 设施投入日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date sheshitoururiqi;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
