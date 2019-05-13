package com.springboot.controller;
import com.springboot.entity.DealInfo;
import com.springboot.service.DealInfoService;
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
@RequestMapping("/dealInfo/")
public class DealInfoController {

    @Autowired
    DealInfoService dealInfoService;

    @RequestMapping("selectAll")
    @ResponseBody
    public Result<List<DealInfo>> selectAll(){
        System.out.println("测试");
        System.out.println("部署");
        return Result.success(dealInfoService.selectAll());
    }

    @RequestMapping("select")
    @ResponseBody
    public Result<DealInfo> selectByPrimaryKey(Integer dealId){
        return Result.success(dealInfoService.selectByPrimaryKey(dealId));
    }

    @RequestMapping("selectByCondition")
    @ResponseBody
    public Result<List<DealInfo>> selectByCondition(DealInfo record){
        return Result.success(dealInfoService.selectByCondition(record));
    }

    @RequestMapping("count")
    @ResponseBody
    public Result<Integer> count(DealInfo record){
        return Result.success(dealInfoService.count(record));
    }

    @RequestMapping("insert")
    @ResponseBody
    public Result<Integer> insertSelective(DealInfo record){
        return Result.success(dealInfoService.insertSelective(record));
    }

    @RequestMapping("update")
    @ResponseBody
    public Result<Integer> updateByPrimaryKeySelective(DealInfo record){
        return Result.success(dealInfoService.updateByPrimaryKeySelective(record));
    }

    @RequestMapping("selectByPage")
    @ResponseBody
    public Result<Page<List<DealInfo>>> selectByPage(Page<DealInfo> page){
        List<DealInfo> list = null;
        page = page.sequentialDisplayCalculate(dealInfoService.count(page.getObj()));
        if (page.getTotalCount() > 0) {
            list = dealInfoService.selectByPage(page);
        }
        Page<List<DealInfo>> result = new Page<List<DealInfo>>(page, list);
        return Result.success(result);
    }

    @RequestMapping("deleteByCondition")
    @ResponseBody
    public Result<Integer> deleteByCondition(DealInfo record){
        return Result.success(dealInfoService.deleteByCondition(record));
    }

    @RequestMapping("delete")
    @ResponseBody
    public Result<Integer> deleteByPrimaryKey(Integer dealId){
        return Result.success(dealInfoService.deleteByPrimaryKey(dealId));
    }

}
