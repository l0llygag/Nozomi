/*
 * This file is generated by jOOQ.
 */
package io.github.adorableskullmaster.nozomi.core.database.generated.tables;


import io.github.adorableskullmaster.nozomi.core.database.generated.Indexes;
import io.github.adorableskullmaster.nozomi.core.database.generated.Keys;
import io.github.adorableskullmaster.nozomi.core.database.generated.Public;
import io.github.adorableskullmaster.nozomi.core.database.generated.tables.records.ApplicantsRecord;
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
public class Applicants extends TableImpl<ApplicantsRecord> {

    private static final long serialVersionUID = 362030335;

    /**
     * The reference instance of <code>public.applicants</code>
     */
    public static final Applicants APPLICANTS = new Applicants();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ApplicantsRecord> getRecordType() {
        return ApplicantsRecord.class;
    }

    /**
     * The column <code>public.applicants.applicants</code>.
     */
    public final TableField<ApplicantsRecord, Integer[]> APPLICANTS_ = createField("applicants", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType(), this, "");

    /**
     * The column <code>public.applicants.id</code>.
     */
    public final TableField<ApplicantsRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>public.applicants</code> table reference
     */
    public Applicants() {
        this(DSL.name("applicants"), null);
    }

    /**
     * Create an aliased <code>public.applicants</code> table reference
     */
    public Applicants(String alias) {
        this(DSL.name(alias), APPLICANTS);
    }

    /**
     * Create an aliased <code>public.applicants</code> table reference
     */
    public Applicants(Name alias) {
        this(alias, APPLICANTS);
    }

    private Applicants(Name alias, Table<ApplicantsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Applicants(Name alias, Table<ApplicantsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Applicants(Table<O> child, ForeignKey<O, ApplicantsRecord> key) {
        super(child, key, APPLICANTS);
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
        return Arrays.<Index>asList(Indexes.APPLICANTS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ApplicantsRecord> getPrimaryKey() {
        return Keys.APPLICANTS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ApplicantsRecord>> getKeys() {
        return Arrays.<UniqueKey<ApplicantsRecord>>asList(Keys.APPLICANTS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Applicants as(String alias) {
        return new Applicants(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Applicants as(Name alias) {
        return new Applicants(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Applicants rename(String name) {
        return new Applicants(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Applicants rename(Name name) {
        return new Applicants(name, null);
    }
}
