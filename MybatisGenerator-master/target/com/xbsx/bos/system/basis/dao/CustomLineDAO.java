package com.xbsx.bos.system.basis.dao;

import com.xbsx.bos.system.basis.entity.CustomLine;

public interface CustomLineDAO {
    int deleteByPrimaryKey(Long id);

    int insert(CustomLine record);

    int insertSelective(CustomLine record);

    CustomLine selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CustomLine record);

    int updateByPrimaryKey(CustomLine record);
}