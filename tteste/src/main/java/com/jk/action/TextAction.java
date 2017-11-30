package com.jk.action;



import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jk.service.TextService;


@RequestMapping("text")
@Controller
public class TextAction {

	@Resource(name="textService")
	private TextService textService;
	
	

	
	
	@RequestMapping("queryWhere")
	@ResponseBody
	public String queryWhere(HttpServletRequest request){
		String json = textService.queryWhere(request);
		System.out.println(json);
		return json;
	}
	
	@RequestMapping("httpYunying")
	public void httpYunying(String key,HttpServletRequest request){
		textService.httpYunying(key,request);
	}
	
}
