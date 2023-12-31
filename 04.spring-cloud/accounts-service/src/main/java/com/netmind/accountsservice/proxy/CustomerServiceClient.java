package com.netmind.accountsservice.proxy;

import com.netmind.accountsservice.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "customers-service")
public interface CustomerServiceClient {
    @RequestMapping(method = RequestMethod.GET, value = "${customers-service.path}")
    public Customer getCustomer(@PathVariable Long id);
}
