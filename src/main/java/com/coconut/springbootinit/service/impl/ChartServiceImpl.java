package com.coconut.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coconut.springbootinit.mapper.ChartMapper;
import com.coconut.springbootinit.model.entity.Chart;
import com.coconut.springbootinit.service.ChartService;
import org.springframework.stereotype.Service;

/**
* @author 86132
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2024-03-19 20:27:53
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService {

}




