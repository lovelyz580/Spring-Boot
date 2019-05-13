package com.springboot.dao;

import com.code.vo.Page;
import com.springboot.entity.SaleInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SaleInfoMapper {
    int deleteByPrimaryKey(Integer saleId);

    int insert(SaleInfo record);

    int insertSelective(SaleInfo record);

    SaleInfo selectByPrimaryKey(Integer saleId);

    int updateByPrimaryKeySelective(SaleInfo record);

    int updateByPrimaryKey(SaleInfo record);

    List<SaleInfo> selectByCondition(SaleInfo record);

    List<SaleInfo> selectAll();

    List<SaleInfo> selectByPage(Page page);

    Integer count(SaleInfo record);

    int deleteByCondition(SaleInfo record);
}