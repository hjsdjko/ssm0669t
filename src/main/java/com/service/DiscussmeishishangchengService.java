package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussmeishishangchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussmeishishangchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussmeishishangchengView;


/**
 * 美食商城评论表
 *
 * @author 
 * @email 
 * @date 2021-04-19 15:12:33
 */
public interface DiscussmeishishangchengService extends IService<DiscussmeishishangchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussmeishishangchengVO> selectListVO(Wrapper<DiscussmeishishangchengEntity> wrapper);
   	
   	DiscussmeishishangchengVO selectVO(@Param("ew") Wrapper<DiscussmeishishangchengEntity> wrapper);
   	
   	List<DiscussmeishishangchengView> selectListView(Wrapper<DiscussmeishishangchengEntity> wrapper);
   	
   	DiscussmeishishangchengView selectView(@Param("ew") Wrapper<DiscussmeishishangchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussmeishishangchengEntity> wrapper);
   	
}

