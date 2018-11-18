package com.yangfeng.service.impl;

import com.yangfeng.entity.TblUserRole;
import com.yangfeng.repository.TblUserRoleMapper;
import com.yangfeng.service.TblUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @创建时间 2018/11/10
 * @描述
 */
@Service
public class TblUserRoleServiceImpl implements TblUserRoleService {

    @Autowired
    private TblUserRoleMapper tblUserRoleMapper;


    @Override
    public int updateByPrimaryKeySelective(TblUserRole tbluserRole) {
        return tblUserRoleMapper.updateByPrimaryKeySelective(tbluserRole);
    }
}
