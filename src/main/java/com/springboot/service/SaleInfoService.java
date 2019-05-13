package com.springboot.service;

import com.springboot.entity.SaleInfo;
import com.springboot.dao.SaleInfoMapper;
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
public class SaleInfoService {

	@Autowired
    private SaleInfoMapper saleInfoMapper;
    
    public int deleteByPrimaryKey(Integer saleId){
        return saleInfoMapper.deleteByPrimaryKey(saleId);
    }

    public int insert(SaleInfo record){
        return saleInfoMapper.insert(record);
    }

    public int insertSelective(SaleInfo record){
        return saleInfoMapper.insertSelective(record);
    }

    public SaleInfo selectByPrimaryKey(Integer saleId){
        return saleInfoMapper.selectByPrimaryKey(saleId);
    }

    public int updateByPrimaryKeySelective(SaleInfo record){
        return saleInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SaleInfo record){
        return saleInfoMapper.updateByPrimaryKey(record);
    }

    public List<SaleInfo> selectByCondition(SaleInfo record){
        return saleInfoMapper.selectByCondition(record);
    }

    public List<SaleInfo> selectAll(){
        return saleInfoMapper.selectAll();
    }

    public List<SaleInfo> selectByPage(Page<SaleInfo> page){
        return saleInfoMapper.selectByPage(page);
    }

    public Integer count(SaleInfo record){
        return saleInfoMapper.count(record);
    }

    public int deleteByCondition(SaleInfo record){
        return saleInfoMapper.deleteByCondition(record);
    }

}
