package com.jk.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpRequest;

public interface TextService {

	String queryWhere(HttpServletRequest request);

	void httpYunying(String key,HttpServletRequest request);



}
