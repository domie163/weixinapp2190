package com.entity.vo;

import com.entity.WeishengpingbiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 卫生评比
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-10 21:55:44
 */
public class WeishengpingbiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 宿舍图片
	 */
	
	private String sushetupian;
		
	/**
	 * 卫生制度
	 */
	
	private String weishengzhidu;
		
	/**
	 * 物品摆放
	 */
	
	private String wupinbaifang;
		
	/**
	 * 地面卫生
	 */
	
	private String dimianweisheng;
		
	/**
	 * 床面评分
	 */
	
	private String chuangmianpingfen;
		
	/**
	 * 墙面评分
	 */
	
	private String qiangmianpingfen;
		
	/**
	 * 内务评分
	 */
	
	private String neiwupingfen;
		
	/**
	 * 窗户评分
	 */
	
	private String chuanghupingfen;
		
	/**
	 * 桌凳评分
	 */
	
	private String zhuodengpingfen;
		
	/**
	 * 整体效果
	 */
	
	private String zhengtixiaoguo;
		
	/**
	 * 评选结果
	 */
	
	private String pingxuanjieguo;
		
	/**
	 * 检查日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jianchariqi;
				
	
	/**
	 * 设置：宿舍图片
	 */
	 
	public void setSushetupian(String sushetupian) {
		this.sushetupian = sushetupian;
	}
	
	/**
	 * 获取：宿舍图片
	 */
	public String getSushetupian() {
		return sushetupian;
	}
				
	
	/**
	 * 设置：卫生制度
	 */
	 
	public void setWeishengzhidu(String weishengzhidu) {
		this.weishengzhidu = weishengzhidu;
	}
	
	/**
	 * 获取：卫生制度
	 */
	public String getWeishengzhidu() {
		return weishengzhidu;
	}
				
	
	/**
	 * 设置：物品摆放
	 */
	 
	public void setWupinbaifang(String wupinbaifang) {
		this.wupinbaifang = wupinbaifang;
	}
	
	/**
	 * 获取：物品摆放
	 */
	public String getWupinbaifang() {
		return wupinbaifang;
	}
				
	
	/**
	 * 设置：地面卫生
	 */
	 
	public void setDimianweisheng(String dimianweisheng) {
		this.dimianweisheng = dimianweisheng;
	}
	
	/**
	 * 获取：地面卫生
	 */
	public String getDimianweisheng() {
		return dimianweisheng;
	}
				
	
	/**
	 * 设置：床面评分
	 */
	 
	public void setChuangmianpingfen(String chuangmianpingfen) {
		this.chuangmianpingfen = chuangmianpingfen;
	}
	
	/**
	 * 获取：床面评分
	 */
	public String getChuangmianpingfen() {
		return chuangmianpingfen;
	}
				
	
	/**
	 * 设置：墙面评分
	 */
	 
	public void setQiangmianpingfen(String qiangmianpingfen) {
		this.qiangmianpingfen = qiangmianpingfen;
	}
	
	/**
	 * 获取：墙面评分
	 */
	public String getQiangmianpingfen() {
		return qiangmianpingfen;
	}
				
	
	/**
	 * 设置：内务评分
	 */
	 
	public void setNeiwupingfen(String neiwupingfen) {
		this.neiwupingfen = neiwupingfen;
	}
	
	/**
	 * 获取：内务评分
	 */
	public String getNeiwupingfen() {
		return neiwupingfen;
	}
				
	
	/**
	 * 设置：窗户评分
	 */
	 
	public void setChuanghupingfen(String chuanghupingfen) {
		this.chuanghupingfen = chuanghupingfen;
	}
	
	/**
	 * 获取：窗户评分
	 */
	public String getChuanghupingfen() {
		return chuanghupingfen;
	}
				
	
	/**
	 * 设置：桌凳评分
	 */
	 
	public void setZhuodengpingfen(String zhuodengpingfen) {
		this.zhuodengpingfen = zhuodengpingfen;
	}
	
	/**
	 * 获取：桌凳评分
	 */
	public String getZhuodengpingfen() {
		return zhuodengpingfen;
	}
				
	
	/**
	 * 设置：整体效果
	 */
	 
	public void setZhengtixiaoguo(String zhengtixiaoguo) {
		this.zhengtixiaoguo = zhengtixiaoguo;
	}
	
	/**
	 * 获取：整体效果
	 */
	public String getZhengtixiaoguo() {
		return zhengtixiaoguo;
	}
				
	
	/**
	 * 设置：评选结果
	 */
	 
	public void setPingxuanjieguo(String pingxuanjieguo) {
		this.pingxuanjieguo = pingxuanjieguo;
	}
	
	/**
	 * 获取：评选结果
	 */
	public String getPingxuanjieguo() {
		return pingxuanjieguo;
	}
				
	
	/**
	 * 设置：检查日期
	 */
	 
	public void setJianchariqi(Date jianchariqi) {
		this.jianchariqi = jianchariqi;
	}
	
	/**
	 * 获取：检查日期
	 */
	public Date getJianchariqi() {
		return jianchariqi;
	}
			
}
