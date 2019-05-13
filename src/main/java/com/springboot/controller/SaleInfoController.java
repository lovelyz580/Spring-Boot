package com.springboot.controller;
import com.springboot.entity.SaleInfo;
import com.springboot.service.SaleInfoService;
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
@RequestMapping("/saleInfo/")
public class SaleInfoController {

    @Autowired
    SaleInfoService saleInfoService;

    @RequestMapping("selectAll")
    @ResponseBody
    public Result<List<SaleInfo>> selectAll(){
        return Result.success(saleInfoService.selectAll());
    }

    @RequestMapping("select")
    @ResponseBody
    public Result<SaleInfo> selectByPrimaryKey(Integer saleId){
        return Result.success(saleInfoService.selectByPrimaryKey(saleId));
    }

    @RequestMapping("selectByCondition")
    @ResponseBody
    public Result<List<SaleInfo>> selectByCondition(SaleInfo record){
        return Result.success(saleInfoService.selectByCondition(record));
    }

    @RequestMapping("count")
    @ResponseBody
    public Result<Integer> count(SaleInfo record){
        return Result.success(saleInfoService.count(record));
    }

    @RequestMapping("insert")
    @ResponseBody
    public Result<Integer> insertSelective(SaleInfo record){
        return Result.success(saleInfoService.insertSelective(record));
    }

    @RequestMapping("update")
    @ResponseBody
    public Result<Integer> updateByPrimaryKeySelective(SaleInfo record){
        return Result.success(saleInfoService.updateByPrimaryKeySelective(record));
    }

    @RequestMapping("selectByPage")
    @ResponseBody
    public Result<Page<List<SaleInfo>>> selectByPage(Page<SaleInfo> page){
        List<SaleInfo> list = null;
        page = page.sequentialDisplayCalculate(saleInfoService.count(page.getObj()));
        if (page.getTotalCount() > 0) {
            list = saleInfoService.selectByPage(page);
        }
        Page<List<SaleInfo>> result = new Page<List<SaleInfo>>(page, list);
        return Result.success(result);
    }

    @RequestMapping("deleteByCondition")
    @ResponseBody
    public Result<Integer> deleteByCondition(SaleInfo record){
        return Result.success(saleInfoService.deleteByCondition(record));
    }

    @RequestMapping("delete")
    @ResponseBody
    public Result<Integer> deleteByPrimaryKey(Integer saleId){
        return Result.success(saleInfoService.deleteByPrimaryKey(saleId));
    }

}
