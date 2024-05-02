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


import com.dao.MeishishangchengDao;
import com.entity.MeishishangchengEntity;
import com.service.MeishishangchengService;
import com.entity.vo.MeishishangchengVO;
import com.entity.view.MeishishangchengView;

@Service("meishishangchengService")
public class MeishishangchengServiceImpl extends ServiceImpl<MeishishangchengDao, MeishishangchengEntity> implements MeishishangchengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeishishangchengEntity> page = this.selectPage(
                new Query<MeishishangchengEntity>(params).getPage(),
                new EntityWrapper<MeishishangchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeishishangchengEntity> wrapper) {
		  Page<MeishishangchengView> page =new Query<MeishishangchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MeishishangchengVO> selectListVO(Wrapper<MeishishangchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeishishangchengVO selectVO(Wrapper<MeishishangchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeishishangchengView> selectListView(Wrapper<MeishishangchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeishishangchengView selectView(Wrapper<MeishishangchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
