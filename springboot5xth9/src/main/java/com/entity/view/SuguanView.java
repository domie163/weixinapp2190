package com.entity.view;

import com.entity.SuguanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宿管
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-10 21:55:44
 */
@TableName("suguan")
public class SuguanView  extends SuguanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SuguanView(){
	}
 
 	public SuguanView(SuguanEntity suguanEntity){
 	try {
			BeanUtils.copyProperties(this, suguanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
