package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeishishangchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MeishishangchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MeishishangchengView;


/**
 * 美食商城
 *
 * @author 
 * @email 
 * @date 2021-04-19 15:12:33
 */
public interface MeishishangchengService extends IService<MeishishangchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeishishangchengVO> selectListVO(Wrapper<MeishishangchengEntity> wrapper);
   	
   	MeishishangchengVO selectVO(@Param("ew") Wrapper<MeishishangchengEntity> wrapper);
   	
   	List<MeishishangchengView> selectListView(Wrapper<MeishishangchengEntity> wrapper);
   	
   	MeishishangchengView selectView(@Param("ew") Wrapper<MeishishangchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeishishangchengEntity> wrapper);
   	
}

