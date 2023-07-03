package com.briup.crm.sale.service;

import com.briup.crm.sale.bean.Chance;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 刘斌
* @description 针对表【sal_chance】的数据库操作Service
* @createDate 2023-06-29 15:34:08
*/
public interface ChanceService extends IService<Chance> {
    List getByNameLike(String name);
}
