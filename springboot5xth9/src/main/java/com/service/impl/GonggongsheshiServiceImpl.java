package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GonggongsheshiDao;
import com.entity.GonggongsheshiEntity;
import com.service.GonggongsheshiService;
import com.entity.vo.GonggongsheshiVO;
import com.entity.view.GonggongsheshiView;

@Service("gonggongsheshiService")
public class GonggongsheshiServiceImpl extends ServiceImpl<GonggongsheshiDao, GonggongsheshiEntity> implements GonggongsheshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GonggongsheshiEntity> page = this.selectPage(
                new Query<GonggongsheshiEntity>(params).getPage(),
                new EntityWrapper<GonggongsheshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GonggongsheshiEntity> wrapper) {
		  Page<GonggongsheshiView> page =new Query<GonggongsheshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GonggongsheshiVO> selectListVO(Wrapper<GonggongsheshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GonggongsheshiVO selectVO(Wrapper<GonggongsheshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GonggongsheshiView> selectListView(Wrapper<GonggongsheshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GonggongsheshiView selectView(Wrapper<GonggongsheshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
