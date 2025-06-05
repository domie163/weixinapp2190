package com.entity.view;

import com.entity.JiankangshangbaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健康上报
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-10 21:55:44
 */
@TableName("jiankangshangbao")
public class JiankangshangbaoView  extends JiankangshangbaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiankangshangbaoView(){
	}
 
 	public JiankangshangbaoView(JiankangshangbaoEntity jiankangshangbaoEntity){
 	try {
			BeanUtils.copyProperties(this, jiankangshangbaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
