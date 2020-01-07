package com.xbsx.bos.system.basis.dao;

import com.xbsx.bos.system.basis.entity.CharteredBus;

public interface CharteredBusDAO {
    int deleteByPrimaryKey(Long id);

    int insert(CharteredBus record);

    int insertSelective(CharteredBus record);

    CharteredBus selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CharteredBus record);

    int updateByPrimaryKey(CharteredBus record);
}