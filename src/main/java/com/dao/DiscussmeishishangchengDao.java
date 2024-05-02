package com.dao;

import com.entity.DiscussmeishishangchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussmeishishangchengVO;
import com.entity.view.DiscussmeishishangchengView;


/**
 * 美食商城评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-19 15:12:33
 */
public interface DiscussmeishishangchengDao extends BaseMapper<DiscussmeishishangchengEntity> {
	
	List<DiscussmeishishangchengVO> selectListVO(@Param("ew") Wrapper<DiscussmeishishangchengEntity> wrapper);
	
	DiscussmeishishangchengVO selectVO(@Param("ew") Wrapper<DiscussmeishishangchengEntity> wrapper);
	
	List<DiscussmeishishangchengView> selectListView(@Param("ew") Wrapper<DiscussmeishishangchengEntity> wrapper);

	List<DiscussmeishishangchengView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussmeishishangchengEntity> wrapper);
	
	DiscussmeishishangchengView selectView(@Param("ew") Wrapper<DiscussmeishishangchengEntity> wrapper);
	
}
