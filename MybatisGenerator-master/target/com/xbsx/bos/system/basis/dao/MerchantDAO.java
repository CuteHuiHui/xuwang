package com.xbsx.bos.system.basis.dao;

import com.xbsx.bos.system.basis.entity.Merchant;

public interface MerchantDAO {
    int deleteByPrimaryKey(Long id);

    int insert(Merchant record);

    int insertSelective(Merchant record);

    Merchant selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Merchant record);

    int updateByPrimaryKey(Merchant record);
}