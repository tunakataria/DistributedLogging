package com.example.handlers;

import com.example.extservices.EventServiceProxy;
import com.example.message.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class FlightScheduledEventHandler {

    @Autowired
    EventServiceProxy eventServiceProxy;
    public void handle(Event event) {
        eventServiceProxy.getLoadPlan(getParties(event));
    }

    private Map<String,Object> getParties(Event event){
        Map<String, Object> headers = new HashMap<>();
        headers.put("Event ID",event.getEventId());
        headers.put("FlightNum", event.getTriggerFor());
        headers.put("Event Producer", event.getTheTrigger());
        return headers;
    }
}
