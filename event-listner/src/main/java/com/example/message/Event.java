package com.example.message;

public interface Event {

    Message getMessage();

    String getEventId();

    String getTheTrigger();

    String getTriggerFor();
}
