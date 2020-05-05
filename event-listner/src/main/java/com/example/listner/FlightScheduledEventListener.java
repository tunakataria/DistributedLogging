package com.example.listner;

import com.example.handlers.FlightScheduledEventHandler;
import com.example.message.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FlightScheduledEventListener extends AbstractListener{

    @Autowired
    FlightScheduledEventHandler flightScheduledEventHandler;
    @Override
    protected void handleEvent(Event event) {

        flightScheduledEventHandler.handle(event);

    }
}
