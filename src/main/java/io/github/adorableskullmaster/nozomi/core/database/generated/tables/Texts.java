/*
 * This file is generated by jOOQ.
 */
package io.github.adorableskullmaster.nozomi.core.database.generated.tables;


import io.github.adorableskullmaster.nozomi.core.database.generated.Indexes;
import io.github.adorableskullmaster.nozomi.core.database.generated.Keys;
import io.github.adorableskullmaster.nozomi.core.database.generated.Public;
import io.github.adorableskullmaster.nozomi.core.database.generated.tables.records.TextsRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Texts extends TableImpl<TextsRecord> {

    private static final long serialVersionUID = -1184540071;

    /**
     * The reference instance of <code>public.texts</code>
     */
    public static final Texts TEXTS = new Texts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TextsRecord> getRecordType() {
        return TextsRecord.class;
    }

    /**
     * The column <code>public.texts.id</code>.
     */
    public final TableField<TextsRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.texts.join</code>.
     */
    public final TableField<TextsRecord, String> JOIN = createField("join", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.texts.leave</code>.
     */
    public final TableField<TextsRecord, String> LEAVE = createField("leave", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.texts.joinimg</code>.
     */
    public final TableField<TextsRecord, String> JOINIMG = createField("joinimg", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.texts</code> table reference
     */
    public Texts() {
        this(DSL.name("texts"), null);
    }

    /**
     * Create an aliased <code>public.texts</code> table reference
     */
    public Texts(String alias) {
        this(DSL.name(alias), TEXTS);
    }

    /**
     * Create an aliased <code>public.texts</code> table reference
     */
    public Texts(Name alias) {
        this(alias, TEXTS);
    }

    private Texts(Name alias, Table<TextsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Texts(Name alias, Table<TextsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Texts(Table<O> child, ForeignKey<O, TextsRecord> key) {
        super(child, key, TEXTS);
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TEXTS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TextsRecord> getPrimaryKey() {
        return Keys.TEXTS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TextsRecord>> getKeys() {
        return Arrays.<UniqueKey<TextsRecord>>asList(Keys.TEXTS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Texts as(String alias) {
        return new Texts(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Texts as(Name alias) {
        return new Texts(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Texts rename(String name) {
        return new Texts(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Texts rename(Name name) {
        return new Texts(name, null);
    }
}
