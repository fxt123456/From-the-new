package com.jk.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jk.mapper.TextMapper;
import com.jk.pojo.UserText;

import jk.util.GenerateFreemarker;


@Service("textService")
public class TextServiceImpl implements TextService {

	@Autowired
	private TextMapper textMapper;

	@Override
	public String queryWhere(HttpServletRequest request) {
		List<UserText> list = textMapper.queryWhere();
		for (UserText userText : list) {
			HashMap<String,Object> map = new HashMap<String, Object>();
	        
		       /*  map.put("goodsCetegory", goodsCetegory);
		        map.put("goodsTwoCetegory", goodsTwoCetegory);*/
		        map.put("user", userText);	
			String contextPath = request.getSession().getServletContext().getRealPath("/html/测试"+userText.getUserId()+"html"+".html");
			String filePath = request.getSession().getServletContext().getRealPath("/ftl/");
			GenerateFreemarker.createHtml(contextPath, filePath, map, "testFtl");
		}
		String jsonString = JSON.toJSONString(list);
		return jsonString;
	}

	@Override
	public void httpYunying(String key,HttpServletRequest request) {
		UserText userText = textMapper.httpYunying(key);
		HashMap<String,Object> map = new HashMap<String, Object>();
		map.put("user", userText);	
		String contextPath = request.getSession().getServletContext().getRealPath("/html/测试"+userText.getUserId()+"html"+".html");
		String filePath = request.getSession().getServletContext().getRealPath("/ftl/");
		GenerateFreemarker.createHtml(contextPath, filePath, map, "testFtl");
	}


	

}
