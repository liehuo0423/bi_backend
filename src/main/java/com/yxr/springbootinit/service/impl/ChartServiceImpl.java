package com.yxr.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yxr.springbootinit.model.entity.Chart;
import com.yxr.springbootinit.service.ChartService;
import com.yxr.springbootinit.mapper.ChartMapper;
import org.springframework.stereotype.Service;

/**
* @author 18070429817
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2023-10-10 13:54:15
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{

}




