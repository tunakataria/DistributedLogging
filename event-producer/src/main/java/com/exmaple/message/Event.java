package com.exmaple.message;

public interface Event {

    Message getMessage();

    String getEventId();

    String getTheTrigger();

    String getTriggerFor();
}
