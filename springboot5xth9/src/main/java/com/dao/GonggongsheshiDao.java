package com.dao;

import com.entity.GonggongsheshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GonggongsheshiVO;
import com.entity.view.GonggongsheshiView;


/**
 * 公共设施
 * 
 * @author 
 * @email 
 * @date 2022-03-10 21:55:44
 */
public interface GonggongsheshiDao extends BaseMapper<GonggongsheshiEntity> {
	
	List<GonggongsheshiVO> selectListVO(@Param("ew") Wrapper<GonggongsheshiEntity> wrapper);
	
	GonggongsheshiVO selectVO(@Param("ew") Wrapper<GonggongsheshiEntity> wrapper);
	
	List<GonggongsheshiView> selectListView(@Param("ew") Wrapper<GonggongsheshiEntity> wrapper);

	List<GonggongsheshiView> selectListView(Pagination page,@Param("ew") Wrapper<GonggongsheshiEntity> wrapper);
	
	GonggongsheshiView selectView(@Param("ew") Wrapper<GonggongsheshiEntity> wrapper);
	

}
