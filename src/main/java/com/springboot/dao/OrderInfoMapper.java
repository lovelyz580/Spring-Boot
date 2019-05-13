package com.springboot.dao;

import com.code.vo.Page;
import com.springboot.entity.OrderInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OrderInfoMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    OrderInfo selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);

    List<OrderInfo> selectByCondition(OrderInfo record);

    List<OrderInfo> selectAll();

    List<OrderInfo> selectByPage(Page page);

    Integer count(OrderInfo record);

    int deleteByCondition(OrderInfo record);
}