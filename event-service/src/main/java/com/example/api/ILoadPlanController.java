package com.example.api;

import com.example.model.LoadPlan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RequestMapping(value = "/com/exmaple/eventservice",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public interface ILoadPlanController {

    @GetMapping(value = "/getLoadPlan")
    LoadPlan getLoadPlan(@RequestHeader Map<String, Object> headers);
}
