package com.dao;

import com.entity.SuguanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SuguanVO;
import com.entity.view.SuguanView;


/**
 * 宿管
 * 
 * @author 
 * @email 
 * @date 2022-03-10 21:55:44
 */
public interface SuguanDao extends BaseMapper<SuguanEntity> {
	
	List<SuguanVO> selectListVO(@Param("ew") Wrapper<SuguanEntity> wrapper);
	
	SuguanVO selectVO(@Param("ew") Wrapper<SuguanEntity> wrapper);
	
	List<SuguanView> selectListView(@Param("ew") Wrapper<SuguanEntity> wrapper);

	List<SuguanView> selectListView(Pagination page,@Param("ew") Wrapper<SuguanEntity> wrapper);
	
	SuguanView selectView(@Param("ew") Wrapper<SuguanEntity> wrapper);
	

}
