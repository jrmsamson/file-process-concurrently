/*
 * This file is generated by jOOQ.
 */
package com.jerome.jooq.tables.records;


import com.jerome.jooq.tables.Events;

import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventsRecord extends TableRecordImpl<EventsRecord> implements Record6<UUID, String, Integer, String, String, Boolean> {

    private static final long serialVersionUID = 42161161;

    /**
     * Setter for <code>PUBLIC.EVENTS.ID</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.EVENTS.ID</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>PUBLIC.EVENTS.EVENT_ID</code>.
     */
    public void setEventId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.EVENTS.EVENT_ID</code>.
     */
    public String getEventId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>PUBLIC.EVENTS.DURATION</code>.
     */
    public void setDuration(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.EVENTS.DURATION</code>.
     */
    public Integer getDuration() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>PUBLIC.EVENTS.TYPE</code>.
     */
    public void setType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>PUBLIC.EVENTS.TYPE</code>.
     */
    public String getType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>PUBLIC.EVENTS.HOST</code>.
     */
    public void setHost(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>PUBLIC.EVENTS.HOST</code>.
     */
    public String getHost() {
        return (String) get(4);
    }

    /**
     * Setter for <code>PUBLIC.EVENTS.ALERT</code>.
     */
    public void setAlert(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>PUBLIC.EVENTS.ALERT</code>.
     */
    public Boolean getAlert() {
        return (Boolean) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UUID, String, Integer, String, String, Boolean> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UUID, String, Integer, String, String, Boolean> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return Events.EVENTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Events.EVENTS.EVENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Events.EVENTS.DURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Events.EVENTS.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Events.EVENTS.HOST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return Events.EVENTS.ALERT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getEventId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getHost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component6() {
        return getAlert();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getEventId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getHost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getAlert();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsRecord value1(UUID value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsRecord value2(String value) {
        setEventId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsRecord value3(Integer value) {
        setDuration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsRecord value4(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsRecord value5(String value) {
        setHost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsRecord value6(Boolean value) {
        setAlert(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsRecord values(UUID value1, String value2, Integer value3, String value4, String value5, Boolean value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EventsRecord
     */
    public EventsRecord() {
        super(Events.EVENTS);
    }

    /**
     * Create a detached, initialised EventsRecord
     */
    public EventsRecord(UUID id, String eventId, Integer duration, String type, String host, Boolean alert) {
        super(Events.EVENTS);

        set(0, id);
        set(1, eventId);
        set(2, duration);
        set(3, type);
        set(4, host);
        set(5, alert);
    }
}