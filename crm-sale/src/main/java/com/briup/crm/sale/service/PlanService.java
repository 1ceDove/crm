package com.briup.crm.sale.service;

import com.briup.crm.sale.bean.Plan;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 刘斌
* @description 针对表【sal_plan】的数据库操作Service
* @createDate 2023-06-29 15:34:09
*/
public interface PlanService extends IService<Plan> {
    List getByNameLike(String name);
}
