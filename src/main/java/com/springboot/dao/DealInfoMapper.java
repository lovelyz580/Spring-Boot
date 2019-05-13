package com.springboot.dao;

import com.code.vo.Page;
import com.springboot.entity.DealInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface DealInfoMapper {
    int deleteByPrimaryKey(Integer dealId);

    int insert(DealInfo record);

    int insertSelective(DealInfo record);

    DealInfo selectByPrimaryKey(Integer dealId);

    int updateByPrimaryKeySelective(DealInfo record);

    int updateByPrimaryKey(DealInfo record);

    List<DealInfo> selectByCondition(DealInfo record);

    List<DealInfo> selectAll();

    List<DealInfo> selectByPage(Page page);

    Integer count(DealInfo record);

    int deleteByCondition(DealInfo record);
}