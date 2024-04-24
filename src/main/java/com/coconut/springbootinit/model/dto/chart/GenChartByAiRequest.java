package com.coconut.springbootinit.model.dto.chart;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 更新请求
 *
 * @author <a href="https://github.com/licoconut">程序员鱼皮</a>
 * @from <a href="https://coconut.icu">编程导航知识星球</a>
 */
@Data
public class GenChartByAiRequest implements Serializable {



    /**
     * 分析目标
     */
    private String goal;


    /**
     * 图表类型
     */
    private String chartType;


    /**
     * 图表名称
     */
    private String chartName;


    private static final long serialVersionUID = 1L;
}