package com.dao;

import com.entity.MeishishangchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeishishangchengVO;
import com.entity.view.MeishishangchengView;


/**
 * 美食商城
 * 
 * @author 
 * @email 
 * @date 2021-04-19 15:12:33
 */
public interface MeishishangchengDao extends BaseMapper<MeishishangchengEntity> {
	
	List<MeishishangchengVO> selectListVO(@Param("ew") Wrapper<MeishishangchengEntity> wrapper);
	
	MeishishangchengVO selectVO(@Param("ew") Wrapper<MeishishangchengEntity> wrapper);
	
	List<MeishishangchengView> selectListView(@Param("ew") Wrapper<MeishishangchengEntity> wrapper);

	List<MeishishangchengView> selectListView(Pagination page,@Param("ew") Wrapper<MeishishangchengEntity> wrapper);
	
	MeishishangchengView selectView(@Param("ew") Wrapper<MeishishangchengEntity> wrapper);
	
}
