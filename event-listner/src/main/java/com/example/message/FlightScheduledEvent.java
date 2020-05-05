package com.example.message;

public class FlightScheduledEvent implements Event {

    private String eventId;
    private String triggeredBy;
    private Message message;
    private String triggeredFor;

    @Override
    public Message getMessage() {
        return message;
    }

    @Override
    public String getEventId() {
        return this.eventId;
    }

    @Override
    public String getTheTrigger() {
        return this.triggeredBy;
    }

    @Override
    public String getTriggerFor() {
        return this.triggeredFor;
    }
}
