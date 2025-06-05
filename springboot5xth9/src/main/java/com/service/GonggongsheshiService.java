package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GonggongsheshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GonggongsheshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GonggongsheshiView;


/**
 * 公共设施
 *
 * @author 
 * @email 
 * @date 2022-03-10 21:55:44
 */
public interface GonggongsheshiService extends IService<GonggongsheshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GonggongsheshiVO> selectListVO(Wrapper<GonggongsheshiEntity> wrapper);
   	
   	GonggongsheshiVO selectVO(@Param("ew") Wrapper<GonggongsheshiEntity> wrapper);
   	
   	List<GonggongsheshiView> selectListView(Wrapper<GonggongsheshiEntity> wrapper);
   	
   	GonggongsheshiView selectView(@Param("ew") Wrapper<GonggongsheshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GonggongsheshiEntity> wrapper);
   	

}

