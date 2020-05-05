package com.example.controller;

import com.example.api.ILoadPlanController;
import com.example.model.LoadPlan;
import com.example.service.ILoadPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.MimeType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LoadPlanController  implements ILoadPlanController {

    @Autowired
    private ILoadPlanService loadPlanService;

    @Override
    public LoadPlan getLoadPlan(@RequestHeader  Map<String, Object> headers) {
        return loadPlanService.getLoadPlan((String) headers.get("FltNumber"));
    }
}
