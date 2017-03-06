/**
 * This class is generated by jOOQ
 */
package com.staypal.db.tables;


import com.staypal.db.Staypaldb;
import com.staypal.db.tables.records.AuthTokensRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuthTokens extends TableImpl<AuthTokensRecord> {

    private static final long serialVersionUID = -1872145034;

    /**
     * The reference instance of <code>staypaldb.auth_tokens</code>
     */
    public static final AuthTokens AUTH_TOKENS = new AuthTokens();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuthTokensRecord> getRecordType() {
        return AuthTokensRecord.class;
    }

    /**
     * The column <code>staypaldb.auth_tokens.email</code>.
     */
    public final TableField<AuthTokensRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>staypaldb.auth_tokens.access_token</code>.
     */
    public final TableField<AuthTokensRecord, String> ACCESS_TOKEN = createField("access_token", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>staypaldb.auth_tokens.refresh_token</code>.
     */
    public final TableField<AuthTokensRecord, String> REFRESH_TOKEN = createField("refresh_token", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>staypaldb.auth_tokens.time_issued</code>.
     */
    public final TableField<AuthTokensRecord, Timestamp> TIME_ISSUED = createField("time_issued", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>staypaldb.auth_tokens</code> table reference
     */
    public AuthTokens() {
        this("auth_tokens", null);
    }

    /**
     * Create an aliased <code>staypaldb.auth_tokens</code> table reference
     */
    public AuthTokens(String alias) {
        this(alias, AUTH_TOKENS);
    }

    private AuthTokens(String alias, Table<AuthTokensRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuthTokens(String alias, Table<AuthTokensRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Staypaldb.STAYPALDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthTokens as(String alias) {
        return new AuthTokens(alias, this);
    }

    /**
     * Rename this table
     */
    public AuthTokens rename(String name) {
        return new AuthTokens(name, null);
    }
}
