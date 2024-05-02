package com.entity.view;

import com.entity.DiscussmeishishangchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 美食商城评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 15:12:33
 */
@TableName("discussmeishishangcheng")
public class DiscussmeishishangchengView  extends DiscussmeishishangchengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussmeishishangchengView(){
	}
 
 	public DiscussmeishishangchengView(DiscussmeishishangchengEntity discussmeishishangchengEntity){
 	try {
			BeanUtils.copyProperties(this, discussmeishishangchengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
