package com.springboot.service;

import com.springboot.entity.OrderInfo;
import com.springboot.dao.OrderInfoMapper;
import com.code.vo.Page;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import org.apache.ibatis.annotations.Param;

/**
 *
 * Created by Lovelyz on 2019/05/12.
 */
@Service
public class OrderInfoService {

	@Autowired
    private OrderInfoMapper orderInfoMapper;
    
    public int deleteByPrimaryKey(Integer orderId){
        return orderInfoMapper.deleteByPrimaryKey(orderId);
    }

    public int insert(OrderInfo record){
        return orderInfoMapper.insert(record);
    }

    public int insertSelective(OrderInfo record){
        return orderInfoMapper.insertSelective(record);
    }

    public OrderInfo selectByPrimaryKey(Integer orderId){
        return orderInfoMapper.selectByPrimaryKey(orderId);
    }

    public int updateByPrimaryKeySelective(OrderInfo record){
        return orderInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(OrderInfo record){
        return orderInfoMapper.updateByPrimaryKey(record);
    }

    public List<OrderInfo> selectByCondition(OrderInfo record){
        return orderInfoMapper.selectByCondition(record);
    }

    public List<OrderInfo> selectAll(){
        return orderInfoMapper.selectAll();
    }

    public List<OrderInfo> selectByPage(Page<OrderInfo> page){
        return orderInfoMapper.selectByPage(page);
    }

    public Integer count(OrderInfo record){
        return orderInfoMapper.count(record);
    }

    public int deleteByCondition(OrderInfo record){
        return orderInfoMapper.deleteByCondition(record);
    }

}
