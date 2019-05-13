package com.springboot.dao;

import com.code.vo.Page;
import com.springboot.entity.ProInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProInfoMapper {
    int deleteByPrimaryKey(Integer prodId);

    int insert(ProInfo record);

    int insertSelective(ProInfo record);

    ProInfo selectByPrimaryKey(Integer prodId);

    int updateByPrimaryKeySelective(ProInfo record);

    int updateByPrimaryKey(ProInfo record);

    List<ProInfo> selectByCondition(ProInfo record);

    List<ProInfo> selectAll();

    List<ProInfo> selectByPage(Page page);

    Integer count(ProInfo record);

    int deleteByCondition(ProInfo record);
}