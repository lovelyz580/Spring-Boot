package com.springboot.service;

import com.springboot.entity.ProInfo;
import com.springboot.dao.ProInfoMapper;
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
public class ProInfoService {

	@Autowired
    private ProInfoMapper proInfoMapper;
    
    public int deleteByPrimaryKey(Integer prodId){
        return proInfoMapper.deleteByPrimaryKey(prodId);
    }

    public int insert(ProInfo record){
        return proInfoMapper.insert(record);
    }

    public int insertSelective(ProInfo record){
        return proInfoMapper.insertSelective(record);
    }

    public ProInfo selectByPrimaryKey(Integer prodId){
        return proInfoMapper.selectByPrimaryKey(prodId);
    }

    public int updateByPrimaryKeySelective(ProInfo record){
        return proInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(ProInfo record){
        return proInfoMapper.updateByPrimaryKey(record);
    }

    public List<ProInfo> selectByCondition(ProInfo record){
        return proInfoMapper.selectByCondition(record);
    }

    public List<ProInfo> selectAll(){
        return proInfoMapper.selectAll();
    }

    public List<ProInfo> selectByPage(Page<ProInfo> page){
        return proInfoMapper.selectByPage(page);
    }

    public Integer count(ProInfo record){
        return proInfoMapper.count(record);
    }

    public int deleteByCondition(ProInfo record){
        return proInfoMapper.deleteByCondition(record);
    }

}
