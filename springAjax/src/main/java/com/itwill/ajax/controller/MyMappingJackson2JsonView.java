package com.itwill.ajax.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

public class MyMappingJackson2JsonView extends MappingJackson2JsonView{
	@Override
	protected Object filterModel(Map<String, Object> model) {
		Object result = super.filterModel(model);
		if(!(result instanceof Map)){
			return result;
		}
		Map resultMap = (Map)result;
		if(resultMap.size() == 1){
			return resultMap.values().toArray()[0];	
		}else{
			return resultMap;
		}		
	}
	
	@Override
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		super.renderMergedOutputModel(model, request, response);
	}
}
