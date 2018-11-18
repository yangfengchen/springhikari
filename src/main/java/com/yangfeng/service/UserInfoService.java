package com.yangfeng.service;

import com.yangfeng.entity.UserInfo;

public interface UserInfoService {

    UserInfo selectByPrimaryKey(Integer uid);

    String selectNameById(Integer id);
}
