package com.coconut.springbootinit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.coconut.springbootinit.model.entity.Chart;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
* @author 86132
* @description 针对表【chart(图表信息表)】的数据库操作Mapper
* @createDate 2024-03-19 21:13:22
* @Entity com.coconut.springbootinit.model.entity.Chart
*/
public interface ChartMapper extends BaseMapper<Chart> {
    List<Map<String, Object>> queryChartData(String querySql);

}




