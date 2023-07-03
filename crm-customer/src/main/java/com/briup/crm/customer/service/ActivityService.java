package com.briup.crm.customer.service;

import com.briup.crm.customer.bean.Activity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 刘斌
* @description 针对表【cst_activity】的数据库操作Service
* @createDate 2023-06-29 15:04:21
*/
public interface ActivityService extends IService<Activity> {
    List getByNameLike(String name);
}
