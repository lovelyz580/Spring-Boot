package com.springboot.controller;
import com.springboot.entity.OrderInfo;
import com.springboot.service.OrderInfoService;
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
@RequestMapping("/orderInfo/")
public class OrderInfoController {

    @Autowired
    OrderInfoService orderInfoService;

    @RequestMapping("selectAll")
    @ResponseBody
    public Result<List<OrderInfo>> selectAll(){
        return Result.success(orderInfoService.selectAll());
    }

    @RequestMapping("select")
    @ResponseBody
    public Result<OrderInfo> selectByPrimaryKey(Integer orderId){
        return Result.success(orderInfoService.selectByPrimaryKey(orderId));
    }

    @RequestMapping("selectByCondition")
    @ResponseBody
    public Result<List<OrderInfo>> selectByCondition(OrderInfo record){
        return Result.success(orderInfoService.selectByCondition(record));
    }

    @RequestMapping("count")
    @ResponseBody
    public Result<Integer> count(OrderInfo record){
        return Result.success(orderInfoService.count(record));
    }

    @RequestMapping("insert")
    @ResponseBody
    public Result<Integer> insertSelective(OrderInfo record){
        return Result.success(orderInfoService.insertSelective(record));
    }

    @RequestMapping("update")
    @ResponseBody
    public Result<Integer> updateByPrimaryKeySelective(OrderInfo record){
        return Result.success(orderInfoService.updateByPrimaryKeySelective(record));
    }

    @RequestMapping("selectByPage")
    @ResponseBody
    public Result<Page<List<OrderInfo>>> selectByPage(Page<OrderInfo> page){
        List<OrderInfo> list = null;
        page = page.sequentialDisplayCalculate(orderInfoService.count(page.getObj()));
        if (page.getTotalCount() > 0) {
            list = orderInfoService.selectByPage(page);
        }
        Page<List<OrderInfo>> result = new Page<List<OrderInfo>>(page, list);
        return Result.success(result);
    }

    @RequestMapping("deleteByCondition")
    @ResponseBody
    public Result<Integer> deleteByCondition(OrderInfo record){
        return Result.success(orderInfoService.deleteByCondition(record));
    }

    @RequestMapping("delete")
    @ResponseBody
    public Result<Integer> deleteByPrimaryKey(Integer orderId){
        return Result.success(orderInfoService.deleteByPrimaryKey(orderId));
    }

}
