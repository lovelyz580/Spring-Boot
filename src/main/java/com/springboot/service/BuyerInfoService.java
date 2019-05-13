package com.springboot.service;

import com.springboot.entity.BuyerInfo;
import com.springboot.dao.BuyerInfoMapper;
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
public class BuyerInfoService {

	@Autowired
    private BuyerInfoMapper buyerInfoMapper;
    
    public int deleteByPrimaryKey(Integer buyerId){
        return buyerInfoMapper.deleteByPrimaryKey(buyerId);
    }

    public int insert(BuyerInfo record){
        return buyerInfoMapper.insert(record);
    }

    public int insertSelective(BuyerInfo record){
        return buyerInfoMapper.insertSelective(record);
    }

    public BuyerInfo selectByPrimaryKey(Integer buyerId){
        return buyerInfoMapper.selectByPrimaryKey(buyerId);
    }

    public int updateByPrimaryKeySelective(BuyerInfo record){
        return buyerInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(BuyerInfo record){
        return buyerInfoMapper.updateByPrimaryKey(record);
    }

    public List<BuyerInfo> selectByCondition(BuyerInfo record){
        return buyerInfoMapper.selectByCondition(record);
    }

    public List<BuyerInfo> selectAll(){
        return buyerInfoMapper.selectAll();
    }

    public List<BuyerInfo> selectByPage(Page<BuyerInfo> page){
        return buyerInfoMapper.selectByPage(page);
    }

    public Integer count(BuyerInfo record){
        return buyerInfoMapper.count(record);
    }

    public int deleteByCondition(BuyerInfo record){
        return buyerInfoMapper.deleteByCondition(record);
    }

}
