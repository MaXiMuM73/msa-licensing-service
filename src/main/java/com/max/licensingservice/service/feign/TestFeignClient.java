package com.max.licensingservice.service.feign;

import com.max.licensingservice.model.dto.SingleUserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "test-feign-client",
        url = "https://reqres.in"
)
public interface TestFeignClient {

    @GetMapping("/api/users/2")
    SingleUserDTO getSingleUser();
}
