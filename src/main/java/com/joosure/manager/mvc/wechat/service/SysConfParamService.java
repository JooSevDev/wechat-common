package com.joosure.manager.mvc.wechat.service;

import java.util.List;
import java.util.Map;

import com.joosure.manager.mvc.wechat.bean.SysConfParam;

public interface SysConfParamService {

	/**
	 * 保存系统参数信息
	 * @param record
	 * @return
	 */
	int saveConfParam(SysConfParam record);

	/**
	 * 通过条件获取系统参数列表信息，分页
	 * @param cond
	 * @return
	 */
	List<SysConfParam> getParamsInfo(Map<String, Object> cond);

	/**
	 * 通过条件获取系统参数数量
	 * @param cond
	 * @return
	 */
	int getParamsCount(Map<String, Object> cond);
}
