package com.briup.crm.auth.remote;

import com.briup.crm.common.utils.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "systemService")
public interface UserRemote {
    @GetMapping("/sys-user/getById")
    Result getById(@RequestParam(value = "id") Long id);
}
