package com.jk.mapper;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jk.pojo.UserText;


public interface TextMapper {

	List<UserText> queryWhere();

	UserText httpYunying(String key);


}
