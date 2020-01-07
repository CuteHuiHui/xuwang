package com.xbsx.bos.system.basis.dao;

import com.xbsx.bos.system.basis.entity.BaseOrganization;

public interface BaseOrganizationDAO {
    int deleteByPrimaryKey(Long id);

    int insert(BaseOrganization record);

    int insertSelective(BaseOrganization record);

    BaseOrganization selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BaseOrganization record);

    int updateByPrimaryKey(BaseOrganization record);
}