package com.example.controller;

import com.example.listner.FlightScheduledEventListener;
import com.example.message.Event;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/eventlistener")
public class ListnerController {

    @Autowired
    private FlightScheduledEventListener flightScheduledEventListener;

    @PostMapping(value = "/post",produces = "application/json", consumes = "application/json")
    public ResponseEntity<Object> postEvent(@RequestBody Event event) throws JsonProcessingException {
        flightScheduledEventListener.receive(event);
        return new ResponseEntity(HttpStatus.OK);
    }
}
