package com.joosure.server.mvc.wechat.entity.pojo;

import java.util.Date;

public class Dict {

	private String paramId;
	private String paramGroup;
	private String paramName;
	private String paramDesc;
	private Date addTime;
	private int status;
	private Date updateTime;
	private String paramvalue;
	public String getParamvalue() {
		return paramvalue;
	}
	public void setParamvalue(String paramvalue) {
		this.paramvalue = paramvalue;
	}
	private String memo;
	
	public String getParamId() {
		return paramId;
	}
	public void setParamId(String paramId) {
		this.paramId = paramId;
	}
	public String getParamGroup() {
		return paramGroup;
	}
	public void setParamGroup(String paramGroup) {
		this.paramGroup = paramGroup;
	}
	public String getParamName() {
		return paramName;
	}
	public void setParamName(String paramName) {
		this.paramName = paramName;
	}
	public String getParamDesc() {
		return paramDesc;
	}
	public void setParamDesc(String paramDesc) {
		this.paramDesc = paramDesc;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
}
