package com.zzr.good.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhaozhirong on 2019/7/16.
 */
@RestController
public class GoodController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/service")
    public String service(){
        String services = "Services: "+discoveryClient.getServices();
        return services;
    }

    @GetMapping(value = "/good")
    public String good(){
        return "good";
    }
}
