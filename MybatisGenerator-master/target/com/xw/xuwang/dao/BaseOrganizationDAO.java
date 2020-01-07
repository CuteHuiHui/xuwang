package com.xw.xuwang.dao;

import com.xw.xuwang.entity.BaseOrganization;

public interface BaseOrganizationDAO {
    int deleteByPrimaryKey(Long id);

    int insert(BaseOrganization record);

    int insertSelective(BaseOrganization record);

    BaseOrganization selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BaseOrganization record);

    int updateByPrimaryKey(BaseOrganization record);
}