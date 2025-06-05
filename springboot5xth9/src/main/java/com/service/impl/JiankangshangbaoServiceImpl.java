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


import com.dao.JiankangshangbaoDao;
import com.entity.JiankangshangbaoEntity;
import com.service.JiankangshangbaoService;
import com.entity.vo.JiankangshangbaoVO;
import com.entity.view.JiankangshangbaoView;

@Service("jiankangshangbaoService")
public class JiankangshangbaoServiceImpl extends ServiceImpl<JiankangshangbaoDao, JiankangshangbaoEntity> implements JiankangshangbaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiankangshangbaoEntity> page = this.selectPage(
                new Query<JiankangshangbaoEntity>(params).getPage(),
                new EntityWrapper<JiankangshangbaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiankangshangbaoEntity> wrapper) {
		  Page<JiankangshangbaoView> page =new Query<JiankangshangbaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiankangshangbaoVO> selectListVO(Wrapper<JiankangshangbaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiankangshangbaoVO selectVO(Wrapper<JiankangshangbaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiankangshangbaoView> selectListView(Wrapper<JiankangshangbaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiankangshangbaoView selectView(Wrapper<JiankangshangbaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
