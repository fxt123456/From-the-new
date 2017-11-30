package com.jk.pojo;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class UserText {

	private Integer userId;
	private String userName;
	private Integer userSex;
	private String userHobby;
	private String userImg;
	@DateTimeFormat(pattern="yyyy-MM-dd")	
	private Date userDate;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date minDate;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date maxDate;
	
	private List<UserText> list; 
	
	public String getUserImg() {
		return userImg;
	}
	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getUserSex() {
		return userSex;
	}
	public void setUserSex(Integer userSex) {
		this.userSex = userSex;
	}
	public String getUserHobby() {
		return userHobby;
	}
	public void setUserHobby(String userHobby) {
		this.userHobby = userHobby;
	}
	public Date getUserDate() {
		return userDate;
	}
	public void setUserDate(Date userDate) {
		this.userDate = userDate;
	}
	public Date getMinDate() {
		return minDate;
	}
	public void setMinDate(Date minDate) {
		this.minDate = minDate;
	}
	public Date getMaxDate() {
		return maxDate;
	}
	public void setMaxDate(Date maxDate) {
		this.maxDate = maxDate;
	}
	public List<UserText> getList() {
		return list;
	}
	public void setList(List<UserText> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "UserText [userId=" + userId + ", userName=" + userName + ", userSex=" + userSex + ", userHobby="
				+ userHobby + ", userImg=" + userImg + ", userDate=" + userDate + ", minDate=" + minDate + ", maxDate="
				+ maxDate + ", list=" + list + "]";
	}
	
}
