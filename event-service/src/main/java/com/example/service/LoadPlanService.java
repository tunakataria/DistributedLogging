package com.example.service;

import com.example.model.LoadPlan;
import org.springframework.stereotype.Service;

@Service
public class LoadPlanService implements ILoadPlanService{

    @Override
    public LoadPlan getLoadPlan(String flightNumer) {
        return new LoadPlan("FLT20","250","150","2000kg");
    }
}
