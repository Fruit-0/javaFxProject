package com.yc.education.mapper.stock;

import com.yc.education.model.stock.ExpressCollect;
import com.yc.education.util.MyMapper;

import java.util.List;

/**
 *@Description TODO 快递收件
 *@Author QuZhangJing
 *@Date 17:30  2018/11/9
 *@Version 1.0
 */
public interface ExpressCollectMapper extends MyMapper<ExpressCollect> {


    /**
     * @param currentDate
     * @return
     */
    String selectMaxIdnum(String currentDate);


    //查询查询所有快递收件
    List<ExpressCollect> findExpressCollect();



}