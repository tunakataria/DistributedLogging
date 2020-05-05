package com.example.listner;

import com.example.message.Event;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public abstract class AbstractListener {

    ObjectMapper objectMapper = new ObjectMapper();

    Logger logger = LoggerFactory.getLogger(AbstractListener.class);

    public void logInfo(Event event) throws JsonProcessingException {

        logger.info("Event recieved" + objectMapper.writeValueAsString(event));
        MDC.put("EVENT ID", event.getEventId());
        MDC.put("FLIGHT ID", event.getTriggerFor());


    }

    public void receive(Event event) throws JsonProcessingException {
        logInfo(event);
        handleEvent(event);
    }

    protected abstract void handleEvent(Event event);


}
