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


import com.dao.DiscussmeishishangchengDao;
import com.entity.DiscussmeishishangchengEntity;
import com.service.DiscussmeishishangchengService;
import com.entity.vo.DiscussmeishishangchengVO;
import com.entity.view.DiscussmeishishangchengView;

@Service("discussmeishishangchengService")
public class DiscussmeishishangchengServiceImpl extends ServiceImpl<DiscussmeishishangchengDao, DiscussmeishishangchengEntity> implements DiscussmeishishangchengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussmeishishangchengEntity> page = this.selectPage(
                new Query<DiscussmeishishangchengEntity>(params).getPage(),
                new EntityWrapper<DiscussmeishishangchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussmeishishangchengEntity> wrapper) {
		  Page<DiscussmeishishangchengView> page =new Query<DiscussmeishishangchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussmeishishangchengVO> selectListVO(Wrapper<DiscussmeishishangchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussmeishishangchengVO selectVO(Wrapper<DiscussmeishishangchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussmeishishangchengView> selectListView(Wrapper<DiscussmeishishangchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussmeishishangchengView selectView(Wrapper<DiscussmeishishangchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
