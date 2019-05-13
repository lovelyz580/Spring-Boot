package com.springboot.controller;
import com.springboot.entity.ProInfo;
import com.springboot.service.ProInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import com.code.vo.Result;
import com.code.vo.Page;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * Created by Lovelyz on 2019/05/12.
 */
@RestController
@RequestMapping("/proInfo/")
public class ProInfoController {

    @Autowired
    ProInfoService proInfoService;

    @RequestMapping("selectAll")
    @ResponseBody
    public Result<List<ProInfo>> selectAll(){
        return Result.success(proInfoService.selectAll());
    }

    @RequestMapping("select")
    @ResponseBody
    public Result<ProInfo> selectByPrimaryKey(Integer prodId){
        return Result.success(proInfoService.selectByPrimaryKey(prodId));
    }

    @RequestMapping("selectByCondition")
    @ResponseBody
    public Result<List<ProInfo>> selectByCondition(ProInfo record){
        return Result.success(proInfoService.selectByCondition(record));
    }

    @RequestMapping("count")
    @ResponseBody
    public Result<Integer> count(ProInfo record){
        return Result.success(proInfoService.count(record));
    }

    @RequestMapping("insert")
    @ResponseBody
    public Result<Integer> insertSelective(ProInfo record){
        return Result.success(proInfoService.insertSelective(record));
    }

    @RequestMapping("update")
    @ResponseBody
    public Result<Integer> updateByPrimaryKeySelective(ProInfo record){
        return Result.success(proInfoService.updateByPrimaryKeySelective(record));
    }

    @RequestMapping("selectByPage")
    @ResponseBody
    public Result<Page<List<ProInfo>>> selectByPage(Page<ProInfo> page){
        List<ProInfo> list = null;
        page = page.sequentialDisplayCalculate(proInfoService.count(page.getObj()));
        if (page.getTotalCount() > 0) {
            list = proInfoService.selectByPage(page);
        }
        Page<List<ProInfo>> result = new Page<List<ProInfo>>(page, list);
        return Result.success(result);
    }

    @RequestMapping("deleteByCondition")
    @ResponseBody
    public Result<Integer> deleteByCondition(ProInfo record){
        return Result.success(proInfoService.deleteByCondition(record));
    }

    @RequestMapping("delete")
    @ResponseBody
    public Result<Integer> deleteByPrimaryKey(Integer prodId){
        return Result.success(proInfoService.deleteByPrimaryKey(prodId));
    }

}
