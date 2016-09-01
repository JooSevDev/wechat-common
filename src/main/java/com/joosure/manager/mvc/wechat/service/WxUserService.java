package com.joosure.manager.mvc.wechat.service;

import java.util.List;
import java.util.Map;

import com.joosure.server.mvc.wechat.entity.pojo.Item;
import com.joosure.server.mvc.wechat.entity.pojo.User;


public interface WxUserService {
	/**
	 * 通过条件查询用户数量
	 * @param cond
	 * @return
	 */
	int getWxUserCount(Map<String, Object> cond);

	/**
	 * 通过条件查询用户列表
	 * @param cond
	 * @return
	 */
	List<User> getWxUserList(Map<String, Object> cond);

	/**
	 * 对用户进行封号处理
	 * @param cond
	 * @return
	 */
	int banUser(Map<String, Object> cond);

	/**
	 * 对用户进行解除封号处理
	 * @param cond
	 * @return
	 */
	int cancelBanUser(Map<String, Object> cond);

	/**
	 * 清除所有评论 ,同时清除评分按条件清除 
	 * 1.0 ：清除所有，只需要传入userid
	 * 
	 * @param cond
	 * @return
	 */
	boolean clearAllComment(Map<String, Object> cond);
	
	/**
	 * 获取该用户的商品
	 * @param cond
	 * @return
	 */
	List<Item> getItemsList(Map<String, Object> cond);

	/**
	 * 获取该用户商品的总量
	 * @param cond
	 * @return
	 */
	int getItemsCount(Map<String, Object> cond);

}
