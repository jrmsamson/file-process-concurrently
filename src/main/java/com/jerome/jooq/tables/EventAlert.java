/*
 * This file is generated by jOOQ.
 */
package com.jerome.jooq.tables;


import com.jerome.jooq.Public;
import com.jerome.jooq.tables.records.EventAlertRecord;

import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class EventAlert extends TableImpl<EventAlertRecord> {

    private static final long serialVersionUID = -1910404569;

    /**
     * The reference instance of <code>PUBLIC.EVENT_ALERT</code>
     */
    public static final EventAlert EVENT_ALERT = new EventAlert();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventAlertRecord> getRecordType() {
        return EventAlertRecord.class;
    }

    /**
     * The column <code>PUBLIC.EVENT_ALERT.ID</code>.
     */
    public final TableField<EventAlertRecord, UUID> ID = createField("ID", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.EVENT_ALERT.EVENT_ID</code>.
     */
    public final TableField<EventAlertRecord, String> EVENT_ID = createField("EVENT_ID", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.EVENT_ALERT.DURATION</code>.
     */
    public final TableField<EventAlertRecord, Integer> DURATION = createField("DURATION", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.EVENT_ALERT.TYPE</code>.
     */
    public final TableField<EventAlertRecord, String> TYPE = createField("TYPE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EVENT_ALERT.HOST</code>.
     */
    public final TableField<EventAlertRecord, String> HOST = createField("HOST", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EVENT_ALERT.ALERT</code>.
     */
    public final TableField<EventAlertRecord, Boolean> ALERT = createField("ALERT", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * Create a <code>PUBLIC.EVENT_ALERT</code> table reference
     */
    public EventAlert() {
        this(DSL.name("EVENT_ALERT"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.EVENT_ALERT</code> table reference
     */
    public EventAlert(String alias) {
        this(DSL.name(alias), EVENT_ALERT);
    }

    /**
     * Create an aliased <code>PUBLIC.EVENT_ALERT</code> table reference
     */
    public EventAlert(Name alias) {
        this(alias, EVENT_ALERT);
    }

    private EventAlert(Name alias, Table<EventAlertRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventAlert(Name alias, Table<EventAlertRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> EventAlert(Table<O> child, ForeignKey<O, EventAlertRecord> key) {
        super(child, key, EVENT_ALERT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventAlert as(String alias) {
        return new EventAlert(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventAlert as(Name alias) {
        return new EventAlert(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventAlert rename(String name) {
        return new EventAlert(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventAlert rename(Name name) {
        return new EventAlert(name, null);
    }
}
