package com.laowang.spring.web.admin.feign.service;

import com.laowang.spring.web.admin.feign.service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "spring-cloud-service-admin", fallback = AdminServiceHystrix.class)
public interface AdminService {
    @GetMapping("hi")
    public String sayHi(@RequestParam(value = "message") String message);
}
