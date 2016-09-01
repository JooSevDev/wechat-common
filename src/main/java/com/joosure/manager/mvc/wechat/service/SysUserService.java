package com.joosure.manager.mvc.wechat.service;

import java.util.List;

import com.joosure.common.base.entity.QryCondBean;
import com.joosure.manager.mvc.wechat.bean.SysUser;

public interface SysUserService {

	SysUser getUserById(String loginId);

	List<SysUser> getUserList(QryCondBean qryCond);

	int getUserListCount(QryCondBean qryCond);

	int addSysUser(SysUser user);

	int deleteSysUser(SysUser user);

	int changeSysUser(SysUser user);

}
