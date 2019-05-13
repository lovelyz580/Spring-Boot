package com.springboot.service;

import com.springboot.entity.DealInfo;
import com.springboot.dao.DealInfoMapper;
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
public class DealInfoService {

	@Autowired
    private DealInfoMapper dealInfoMapper;
    
    public int deleteByPrimaryKey(Integer dealId){
        return dealInfoMapper.deleteByPrimaryKey(dealId);
    }

    public int insert(DealInfo record){
        return dealInfoMapper.insert(record);
    }

    public int insertSelective(DealInfo record){
        return dealInfoMapper.insertSelective(record);
    }

    public DealInfo selectByPrimaryKey(Integer dealId){
        return dealInfoMapper.selectByPrimaryKey(dealId);
    }

    public int updateByPrimaryKeySelective(DealInfo record){
        return dealInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(DealInfo record){
        return dealInfoMapper.updateByPrimaryKey(record);
    }

    public List<DealInfo> selectByCondition(DealInfo record){
        return dealInfoMapper.selectByCondition(record);
    }

    public List<DealInfo> selectAll(){
        return dealInfoMapper.selectAll();
    }

    public List<DealInfo> selectByPage(Page<DealInfo> page){
        return dealInfoMapper.selectByPage(page);
    }

    public Integer count(DealInfo record){
        return dealInfoMapper.count(record);
    }

    public int deleteByCondition(DealInfo record){
        return dealInfoMapper.deleteByCondition(record);
    }

}
