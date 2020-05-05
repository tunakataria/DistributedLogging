package com.example.extservices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@FeignClient(name = "eventservice", url = "http://localhost:8080")
@RequestMapping(value = "/com/exmaple/eventservice",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public interface EventServiceProxy {
    @GetMapping(value = "/getLoadPlan")
    LoadPlan getLoadPlan(@RequestHeader Map<String, Object> headers);
}

