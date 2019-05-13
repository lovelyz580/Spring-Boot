package com.springboot.dao;

import com.code.vo.Page;
import com.springboot.entity.BuyerInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface BuyerInfoMapper {
    int deleteByPrimaryKey(Integer buyerId);

    int insert(BuyerInfo record);

    int insertSelective(BuyerInfo record);

    BuyerInfo selectByPrimaryKey(Integer buyerId);

    int updateByPrimaryKeySelective(BuyerInfo record);

    int updateByPrimaryKey(BuyerInfo record);

    List<BuyerInfo> selectByCondition(BuyerInfo record);

    List<BuyerInfo> selectAll();

    List<BuyerInfo> selectByPage(Page page);

    Integer count(BuyerInfo record);

    int deleteByCondition(BuyerInfo record);
}