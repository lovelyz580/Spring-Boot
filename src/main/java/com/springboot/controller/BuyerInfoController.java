package com.springboot.controller;
import com.springboot.entity.BuyerInfo;
import com.springboot.service.BuyerInfoService;
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
@RequestMapping("/buyerInfo/")
public class BuyerInfoController {

    @Autowired
    BuyerInfoService buyerInfoService;

    @RequestMapping("selectAll")
    @ResponseBody
    public Result<List<BuyerInfo>> selectAll(){
        return Result.success(buyerInfoService.selectAll());
    }

    @RequestMapping("select")
    @ResponseBody
    public Result<BuyerInfo> selectByPrimaryKey(Integer buyerId){
        return Result.success(buyerInfoService.selectByPrimaryKey(buyerId));
    }

    @RequestMapping("selectByCondition")
    @ResponseBody
    public Result<List<BuyerInfo>> selectByCondition(BuyerInfo record){
        return Result.success(buyerInfoService.selectByCondition(record));
    }

    @RequestMapping("count")
    @ResponseBody
    public Result<Integer> count(BuyerInfo record){
        return Result.success(buyerInfoService.count(record));
    }

    @RequestMapping("insert")
    @ResponseBody
    public Result<Integer> insertSelective(BuyerInfo record){
        return Result.success(buyerInfoService.insertSelective(record));
    }

    @RequestMapping("update")
    @ResponseBody
    public Result<Integer> updateByPrimaryKeySelective(BuyerInfo record){
        return Result.success(buyerInfoService.updateByPrimaryKeySelective(record));
    }

    @RequestMapping("selectByPage")
    @ResponseBody
    public Result<Page<List<BuyerInfo>>> selectByPage(Page<BuyerInfo> page){
        List<BuyerInfo> list = null;
        page = page.sequentialDisplayCalculate(buyerInfoService.count(page.getObj()));
        if (page.getTotalCount() > 0) {
            list = buyerInfoService.selectByPage(page);
        }
        Page<List<BuyerInfo>> result = new Page<List<BuyerInfo>>(page, list);
        return Result.success(result);
    }

    @RequestMapping("deleteByCondition")
    @ResponseBody
    public Result<Integer> deleteByCondition(BuyerInfo record){
        return Result.success(buyerInfoService.deleteByCondition(record));
    }

    @RequestMapping("delete")
    @ResponseBody
    public Result<Integer> deleteByPrimaryKey(Integer buyerId){
        return Result.success(buyerInfoService.deleteByPrimaryKey(buyerId));
    }

}
