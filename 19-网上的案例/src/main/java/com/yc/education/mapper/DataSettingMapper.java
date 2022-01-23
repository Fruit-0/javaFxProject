package com.yc.education.mapper;

import com.yc.education.model.DataSetting;
import com.yc.education.util.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataSettingMapper extends MyMapper<DataSetting> {


    //查询资料设定
    List<DataSetting> findDataSetting(@Param("parentid")long parentid);
    //根据排序号和父级id修改资料设定
    int updateDataSetting(DataSetting dataSetting);



}