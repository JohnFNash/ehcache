package com.johnfnash.study.ehcache.service;

import com.johnfnash.study.ehcache.entity.User;

public interface EhcacheService {

	// 测试失败情况，有效期为5秒
	public String getTimestamp(String param);
	
	public String getDataFromDB(String key);

    public void removeDataAtDB(String key);

    public String refreshData(String key);
    
    public User findById(String userId);

    public boolean isReserved(String userId);

    public void removeUser(String userId);

    public void removeAllUser();
}
