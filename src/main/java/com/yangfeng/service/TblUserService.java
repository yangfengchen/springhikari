package com.yangfeng.service;

import com.yangfeng.entity.TblUser;

public interface TblUserService {

    int updateByPrimaryKeySelective(TblUser tblUser);
}
