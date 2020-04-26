package com.sioo.dao;

import com.sioo.model.ChannelInfo;

public interface ChannelInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(ChannelInfo record);

    int insertSelective(ChannelInfo record);

    ChannelInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ChannelInfo record);

    int updateByPrimaryKey(ChannelInfo record);
}