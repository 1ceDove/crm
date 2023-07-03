package com.briup.crm.customer.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.briup.crm.customer.bean.Linkman;

import java.util.List;

/**
* @author 刘斌
* @description 针对表【cst_linkman】的数据库操作Service
* @createDate 2023-06-29 15:04:21
*/
public interface LinkmanService extends IService<Linkman> {
    List getByNameLike(String name);
}
